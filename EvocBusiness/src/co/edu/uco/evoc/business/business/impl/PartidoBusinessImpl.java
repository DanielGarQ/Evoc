package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.PartidoAssembler;
import co.edu.uco.evoc.business.business.PartidoBusiness;
import co.edu.uco.evoc.business.domain.PartidoDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.PartidoEntity;

public final class PartidoBusinessImpl implements PartidoBusiness{
	
	private DAOFactory daoFactory;

	public PartidoBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PartidoDomain domain) {
		
		UUID identificador;
		PartidoEntity entityTmp;
		List<PartidoEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = PartidoEntity.createWithIdentificador(identificador);
			result = daoFactory.getPartidoDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = PartidoEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getPartidoDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Partido que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new PartidoDomain(identificador, domain.getNombre(),domain.getSede());
		
		final PartidoEntity entity = PartidoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPartidoDAO().create(entity);

	}

	@Override
	public final List<PartidoDomain> list(final PartidoDomain domain) {
		
		final PartidoEntity entity = PartidoAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PartidoEntity> resultEntityList = daoFactory.getPartidoDAO().read(entity);
		
		return PartidoAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PartidoDomain domain) {
		final PartidoEntity entity = PartidoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPartidoDAO().update(entity);

		

	}

	@Override
	public final void drop(final PartidoDomain domain) {
		final PartidoEntity entity = PartidoAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPartidoDAO().delete(entity);

	}


}
