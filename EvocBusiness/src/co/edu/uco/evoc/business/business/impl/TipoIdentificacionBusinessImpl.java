package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.TipoIdentificacionAssembler;
import co.edu.uco.evoc.business.business.TipoIdentificacionBusiness;
import co.edu.uco.evoc.business.domain.TipoIdentificacionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionBusinessImpl implements TipoIdentificacionBusiness{
	
	private DAOFactory daoFactory;

	public TipoIdentificacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoIdentificacionDomain domain) {
		
		UUID identificador;
		TipoIdentificacionEntity entityTmp;
		List<TipoIdentificacionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = TipoIdentificacionEntity.createWithIdentificador(identificador);
			result = daoFactory.getTipoIdentificacionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = TipoIdentificacionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getTipoIdentificacionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Tipo Identificacion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new TipoIdentificacionDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().create(entity);

	}

	@Override
	public final List<TipoIdentificacionDomain> list(final TipoIdentificacionDomain domain) {
		
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoIdentificacionEntity> resultEntityList = daoFactory.getTipoIdentificacionDAO().read(entity);
		
		return TipoIdentificacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoIdentificacionDomain domain) {
		final TipoIdentificacionEntity entity = TipoIdentificacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoIdentificacionDAO().delete(entity);

	}


}
