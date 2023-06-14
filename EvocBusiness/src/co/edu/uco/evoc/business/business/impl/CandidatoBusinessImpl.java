package co.edu.uco.evoc.business.business.impl;

import java.util.List;

import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.CandidatoAssembler;
import co.edu.uco.evoc.business.business.CandidatoBusiness;
import co.edu.uco.evoc.business.domain.CandidatoDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.CandidatoEntity;

public final class CandidatoBusinessImpl implements CandidatoBusiness{
	
	private DAOFactory daoFactory;

	public CandidatoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final CandidatoDomain domain) {
		
		UUID identificador;
		CandidatoEntity entityTmp;
		List<CandidatoEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = CandidatoEntity.createWithIdentificador(identificador);
			result = daoFactory.getCandidatoDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = CandidatoEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getCandidatoDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Candidato que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new CandidatoDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido(), domain.getTipoCandidato(), domain.getPartido());
		
		final CandidatoEntity entity = CandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCandidatoDAO().create(entity);

	}

	@Override
	public final List<CandidatoDomain> list(final CandidatoDomain domain) {
		
		final CandidatoEntity entity = CandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<CandidatoEntity> resultEntityList = daoFactory.getCandidatoDAO().read(entity);
		
		return CandidatoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final CandidatoDomain domain) {
		final CandidatoEntity entity = CandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCandidatoDAO().update(entity);

		

	}

	@Override
	public final void drop(final CandidatoDomain domain) {
		final CandidatoEntity entity = CandidatoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCandidatoDAO().delete(entity);

	}

}
