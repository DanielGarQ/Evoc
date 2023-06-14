package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.EstadoMesaVotacionCalculadoAssembler;
import co.edu.uco.evoc.business.business.EstadoMesaVotacionCalculadoBusiness;
import co.edu.uco.evoc.business.domain.EstadoMesaVotacionCalculadoDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.EstadoMesaVotacionCalculadoEntity;

public final class EstadoMesaVotacionCalculadoBusinessImpl implements EstadoMesaVotacionCalculadoBusiness{
	
	private DAOFactory daoFactory;

	public EstadoMesaVotacionCalculadoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoMesaVotacionCalculadoDomain domain) {
		
		UUID identificador;
		EstadoMesaVotacionCalculadoEntity entityTmp;
		List<EstadoMesaVotacionCalculadoEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EstadoMesaVotacionCalculadoEntity.createWithIdentificador(identificador);
			result = daoFactory.getEstadoMesaVotacionCalculadoDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = EstadoMesaVotacionCalculadoEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getEstadoMesaVotacionCalculadoDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Tipo Registrador que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new EstadoMesaVotacionCalculadoDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final EstadoMesaVotacionCalculadoEntity entity = EstadoMesaVotacionCalculadoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoMesaVotacionCalculadoDAO().create(entity);

	}

	@Override
	public final List<EstadoMesaVotacionCalculadoDomain> list(final EstadoMesaVotacionCalculadoDomain domain) {
		
		final EstadoMesaVotacionCalculadoEntity entity = EstadoMesaVotacionCalculadoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoMesaVotacionCalculadoEntity> resultEntityList = daoFactory.getEstadoMesaVotacionCalculadoDAO().read(entity);
		
		return EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoMesaVotacionCalculadoDomain domain) {
		final EstadoMesaVotacionCalculadoEntity entity = EstadoMesaVotacionCalculadoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoMesaVotacionCalculadoDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoMesaVotacionCalculadoDomain domain) {
		final EstadoMesaVotacionCalculadoEntity entity = EstadoMesaVotacionCalculadoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoMesaVotacionCalculadoDAO().delete(entity);

	}

}
