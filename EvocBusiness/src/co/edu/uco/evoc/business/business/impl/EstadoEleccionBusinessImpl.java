package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.EstadoEleccionAssembler;
import co.edu.uco.evoc.business.business.EstadoEleccionBusiness;
import co.edu.uco.evoc.business.domain.EstadoEleccionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.EstadoEleccionEntity;

public final class EstadoEleccionBusinessImpl implements EstadoEleccionBusiness{
	
	private DAOFactory daoFactory;

	public EstadoEleccionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EstadoEleccionDomain domain) {
		
		UUID identificador;
		EstadoEleccionEntity entityTmp;
		List<EstadoEleccionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EstadoEleccionEntity.createWithIdentificador(identificador);
			result = daoFactory.getEstadoEleccionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = EstadoEleccionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getEstadoEleccionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Estado Eleccion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new EstadoEleccionDomain(identificador, domain.getNombre(),domain.getDescripcion());
		
		final EstadoEleccionEntity entity = EstadoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEleccionDAO().create(entity);

	}

	@Override
	public final List<EstadoEleccionDomain> list(final EstadoEleccionDomain domain) {
		
		final EstadoEleccionEntity entity = EstadoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EstadoEleccionEntity> resultEntityList = daoFactory.getEstadoEleccionDAO().read(entity);
		
		return EstadoEleccionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EstadoEleccionDomain domain) {
		final EstadoEleccionEntity entity = EstadoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEleccionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EstadoEleccionDomain domain) {
		final EstadoEleccionEntity entity = EstadoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEstadoEleccionDAO().delete(entity);

	}

}
