package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.TipoCandidatoAssembler;
import co.edu.uco.evoc.business.business.TipoCandidatoBusiness;
import co.edu.uco.evoc.business.domain.TipoCandidatoDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.TipoCandidatoEntity;

public final class TipoCandidatoBusinessImpl implements TipoCandidatoBusiness{
	
	private DAOFactory daoFactory;

	public TipoCandidatoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoCandidatoDomain domain) {
		
		UUID identificador;
		TipoCandidatoEntity entityTmp;
		List<TipoCandidatoEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = TipoCandidatoEntity.createWithIdentificador(identificador);
			result = daoFactory.getTipoCandidatoDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = TipoCandidatoEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getTipoCandidatoDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Tipo Candidato que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new TipoCandidatoDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final TipoCandidatoEntity entity = TipoCandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoCandidatoDAO().create(entity);

	}

	@Override
	public final List<TipoCandidatoDomain> list(final TipoCandidatoDomain domain) {
		
		final TipoCandidatoEntity entity = TipoCandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoCandidatoEntity> resultEntityList = daoFactory.getTipoCandidatoDAO().read(entity);
		
		return TipoCandidatoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoCandidatoDomain domain) {
		final TipoCandidatoEntity entity = TipoCandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoCandidatoDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoCandidatoDomain domain) {
		final TipoCandidatoEntity entity = TipoCandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoCandidatoDAO().delete(entity);

	}


}
