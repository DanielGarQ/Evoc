package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.LocacionAssembler;
import co.edu.uco.evoc.business.business.LocacionBusiness;
import co.edu.uco.evoc.business.domain.LocacionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.LocacionEntity;


public final class LocacionBusinessImpl implements LocacionBusiness{
	
	private DAOFactory daoFactory;

	public LocacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final LocacionDomain domain) {
		
		UUID identificador;
		LocacionEntity entityTmp;
		List<LocacionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = LocacionEntity.createWithIdentificador(identificador);
			result = daoFactory.getLocacionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = LocacionEntity.createWithDireccion(domain.getDireccion());
		result = daoFactory.getLocacionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "La Locacion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new LocacionDomain(identificador, domain.getDireccion(), domain.getDescripcion(), domain.getPotencialElectoral(), domain.getZona());
		
		final LocacionEntity entity = LocacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLocacionDAO().create(entity);

	}

	@Override
	public final List<LocacionDomain> list(final LocacionDomain domain) {
		
		final LocacionEntity entity = LocacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<LocacionEntity> resultEntityList = daoFactory.getLocacionDAO().read(entity);
		
		return LocacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final LocacionDomain domain) {
		final LocacionEntity entity = LocacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLocacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final LocacionDomain domain) {
		final LocacionEntity entity = LocacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getLocacionDAO().delete(entity);

	}

}
