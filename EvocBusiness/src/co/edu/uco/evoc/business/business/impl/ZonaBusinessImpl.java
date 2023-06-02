package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.ZonaAssembler;
import co.edu.uco.evoc.business.business.ZonaBusiness;
import co.edu.uco.evoc.business.domain.ZonaDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.ZonaEntity;

public final class ZonaBusinessImpl implements ZonaBusiness{
	
	private DAOFactory daoFactory;

	public ZonaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final ZonaDomain domain) {
		
		UUID identificador;
		ZonaEntity entityTmp;
		List<ZonaEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = ZonaEntity.createWithIdentificador(identificador);
			result = daoFactory.getZonaDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = ZonaEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getZonaDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El stado de tipo relaciuon institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new ZonaDomain(identificador, domain.getNombre(), domain.getZonaPadre(), domain.getPotencialElectoral());
		
		final ZonaEntity entity = ZonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getZonaDAO().create(entity);

	}

	@Override
	public final List<ZonaDomain> list(final ZonaDomain domain) {
		
		final ZonaEntity entity = ZonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<ZonaEntity> resultEntityList = daoFactory.getZonaDAO().read(entity);
		
		return ZonaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final ZonaDomain domain) {
		final ZonaEntity entity = ZonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getZonaDAO().update(entity);

		

	}

	@Override
	public final void drop(final ZonaDomain domain) {
		final ZonaEntity entity = ZonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getZonaDAO().delete(entity);

	}

}
