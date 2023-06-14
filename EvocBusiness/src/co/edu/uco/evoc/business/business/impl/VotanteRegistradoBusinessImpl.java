package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.VotanteRegistradoAssembler;
import co.edu.uco.evoc.business.business.VotanteRegistradoBusiness;
import co.edu.uco.evoc.business.domain.VotanteRegistradoDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.VotanteRegistradoEntity;

public final class VotanteRegistradoBusinessImpl implements VotanteRegistradoBusiness{
	
	private DAOFactory daoFactory;

	public VotanteRegistradoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final VotanteRegistradoDomain domain) {
		
		UUID identificador;
		VotanteRegistradoEntity entityTmp;
		List<VotanteRegistradoEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = VotanteRegistradoEntity.createWithIdentificador(identificador);
			result = daoFactory.getVotanteRegistradoDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = VotanteRegistradoEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getVotanteRegistradoDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Votante Registrado que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new VotanteRegistradoDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido(), domain.getMesaVotacion(), domain.getFechaExpedicionIdentificacion(), domain.isValidacionDactilar(), domain.getCartonVotacion());
		
		final VotanteRegistradoEntity entity = VotanteRegistradoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVotanteRegistradoDAO().create(entity);

	}

	@Override
	public final List<VotanteRegistradoDomain> list(final VotanteRegistradoDomain domain) {
		
		final VotanteRegistradoEntity entity = VotanteRegistradoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<VotanteRegistradoEntity> resultEntityList = daoFactory.getVotanteRegistradoDAO().read(entity);
		
		return VotanteRegistradoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final VotanteRegistradoDomain domain) {
		final VotanteRegistradoEntity entity = VotanteRegistradoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVotanteRegistradoDAO().update(entity);

		

	}

	@Override
	public final void drop(final VotanteRegistradoDomain domain) {
		final VotanteRegistradoEntity entity = VotanteRegistradoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getVotanteRegistradoDAO().delete(entity);

	}

}
