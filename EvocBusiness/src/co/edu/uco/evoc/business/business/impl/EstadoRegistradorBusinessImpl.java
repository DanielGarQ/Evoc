package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.EstadoRegistradorAssembler;
import co.edu.uco.evoc.business.business.EstadoRegistradorBusiness;
import co.edu.uco.evoc.business.domain.EstadoRegistradorDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.EstadoRegistradorEntity;

public final class EstadoRegistradorBusinessImpl implements EstadoRegistradorBusiness{
	
	private DAOFactory daoFactory;

	public EstadoRegistradorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoRegistradorDomain domain) {
		
		UUID identificador;
		EstadoRegistradorEntity entityTmp;
		List<EstadoRegistradorEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EstadoRegistradorEntity.createWithIdentificador(identificador);
			result = daoFactory.getEstadoRegistradorDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = EstadoRegistradorEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getEstadoRegistradorDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Estado Registrador que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new EstadoRegistradorDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final EstadoRegistradorEntity entity = EstadoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRegistradorDAO().create(entity);

	}

	@Override
	public final List<EstadoRegistradorDomain> list(final EstadoRegistradorDomain domain) {
		
		final EstadoRegistradorEntity entity = EstadoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoRegistradorEntity> resultEntityList = daoFactory.getEstadoRegistradorDAO().read(entity);
		
		return EstadoRegistradorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoRegistradorDomain domain) {
		final EstadoRegistradorEntity entity = EstadoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRegistradorDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoRegistradorDomain domain) {
		final EstadoRegistradorEntity entity = EstadoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoRegistradorDAO().delete(entity);

	}

}
