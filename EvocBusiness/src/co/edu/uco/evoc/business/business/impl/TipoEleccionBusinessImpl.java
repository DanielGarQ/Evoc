package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.TipoEleccionAssembler;
import co.edu.uco.evoc.business.business.TipoEleccionBusiness;
import co.edu.uco.evoc.business.domain.TipoEleccionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.TipoEleccionEntity;

public final class TipoEleccionBusinessImpl implements TipoEleccionBusiness{
	
	private DAOFactory daoFactory;

	public TipoEleccionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoEleccionDomain domain) {
		
		UUID identificador;
		TipoEleccionEntity entityTmp;
		List<TipoEleccionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = TipoEleccionEntity.createWithIdentificador(identificador);
			result = daoFactory.getTipoEleccionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = TipoEleccionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getTipoEleccionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Tipo Eleccion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new TipoEleccionDomain(identificador, domain.getNombre(), domain.getNivelTipoEleccion());
		
		final TipoEleccionEntity entity = TipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEleccionDAO().create(entity);

	}

	@Override
	public final List<TipoEleccionDomain> list(final TipoEleccionDomain domain) {
		
		final TipoEleccionEntity entity = TipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoEleccionEntity> resultEntityList = daoFactory.getTipoEleccionDAO().read(entity);
		
		return TipoEleccionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoEleccionDomain domain) {
		final TipoEleccionEntity entity = TipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEleccionDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoEleccionDomain domain) {
		final TipoEleccionEntity entity = TipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoEleccionDAO().delete(entity);

	}

}
