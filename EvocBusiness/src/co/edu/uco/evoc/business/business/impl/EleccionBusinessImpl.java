package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.EleccionAssembler;
import co.edu.uco.evoc.business.business.EleccionBusiness;
import co.edu.uco.evoc.business.domain.EleccionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.EleccionEntity;

public final class EleccionBusinessImpl implements EleccionBusiness{
	
	private DAOFactory daoFactory;

	public EleccionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final EleccionDomain domain) {
		
		UUID identificador;
		EleccionEntity entityTmp;
		List<EleccionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = EleccionEntity.createWithIdentificador(identificador);
			result = daoFactory.getEleccionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = EleccionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getEleccionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "La Eleccion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new EleccionDomain(identificador, domain.getNombre(), domain.getTipoEleccion(), domain.getZona(), domain.getFechaInicial(), domain.getFechaFinal(), domain.getRegistrador(), domain.getEstadoEleccion());
		
		final EleccionEntity entity = EleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEleccionDAO().create(entity);

	}

	@Override
	public final List<EleccionDomain> list(final EleccionDomain domain) {
		
		final EleccionEntity entity = EleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<EleccionEntity> resultEntityList = daoFactory.getEleccionDAO().read(entity);
		
		return EleccionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final EleccionDomain domain) {
		final EleccionEntity entity = EleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEleccionDAO().update(entity);

		

	}

	@Override
	public final void drop(final EleccionDomain domain) {
		final EleccionEntity entity = EleccionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getEleccionDAO().delete(entity);

	}

}
