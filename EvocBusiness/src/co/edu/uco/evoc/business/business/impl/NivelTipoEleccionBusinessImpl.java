package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.NivelTipoEleccionAssembler;
import co.edu.uco.evoc.business.business.NivelTipoEleccionBusiness;
import co.edu.uco.evoc.business.domain.NivelTipoEleccionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.NivelTipoEleccionEntity;

public final class NivelTipoEleccionBusinessImpl implements NivelTipoEleccionBusiness{
	
	private DAOFactory daoFactory;

	public NivelTipoEleccionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final NivelTipoEleccionDomain domain) {
		
		UUID identificador;
		NivelTipoEleccionEntity entityTmp;
		List<NivelTipoEleccionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = NivelTipoEleccionEntity.createWithIdentificador(identificador);
			result = daoFactory.getNivelTipoEleccionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = NivelTipoEleccionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getNivelTipoEleccionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Nivel de Tipo de Eleccion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new NivelTipoEleccionDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final NivelTipoEleccionEntity entity = NivelTipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getNivelTipoEleccionDAO().create(entity);

	}

	@Override
	public final List<NivelTipoEleccionDomain> list(final NivelTipoEleccionDomain domain) {
		
		final NivelTipoEleccionEntity entity = NivelTipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<NivelTipoEleccionEntity> resultEntityList = daoFactory.getNivelTipoEleccionDAO().read(entity);
		
		return NivelTipoEleccionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final NivelTipoEleccionDomain domain) {
		final NivelTipoEleccionEntity entity = NivelTipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getNivelTipoEleccionDAO().update(entity);

		

	}

	@Override
	public final void drop(final NivelTipoEleccionDomain domain) {
		final NivelTipoEleccionEntity entity = NivelTipoEleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getNivelTipoEleccionDAO().delete(entity);

	}


}
