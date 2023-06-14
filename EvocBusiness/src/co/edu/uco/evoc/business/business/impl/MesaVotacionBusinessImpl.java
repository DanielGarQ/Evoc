package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.MesaVotacionAssembler;
import co.edu.uco.evoc.business.business.MesaVotacionBusiness;
import co.edu.uco.evoc.business.domain.MesaVotacionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.MesaVotacionEntity;

public final class MesaVotacionBusinessImpl implements MesaVotacionBusiness{
	
	private DAOFactory daoFactory;

	public MesaVotacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final MesaVotacionDomain domain) {
		
		UUID identificador;
		MesaVotacionEntity entityTmp;
		List<MesaVotacionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = MesaVotacionEntity.createWithIdentificador(identificador);
			result = daoFactory.getMesaVotacionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = MesaVotacionEntity.createWithNumeroMesa(domain.getNumeroMesa());
		result = daoFactory.getMesaVotacionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "La  Mesa de Votacion institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new MesaVotacionDomain(identificador, domain.getNumeroMesa(), domain.getPotencialElectoral(), domain.getLocacion(), domain.getEstadoMesaVotacionCalculado());
		
		final MesaVotacionEntity entity = MesaVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getMesaVotacionDAO().create(entity);

	}

	@Override
	public final List<MesaVotacionDomain> list(final MesaVotacionDomain domain) {
		
		final MesaVotacionEntity entity = MesaVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<MesaVotacionEntity> resultEntityList = daoFactory.getMesaVotacionDAO().read(entity);
		
		return MesaVotacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final MesaVotacionDomain domain) {
		final MesaVotacionEntity entity = MesaVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getMesaVotacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final MesaVotacionDomain domain) {
		final MesaVotacionEntity entity = MesaVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getMesaVotacionDAO().delete(entity);

	}

}
