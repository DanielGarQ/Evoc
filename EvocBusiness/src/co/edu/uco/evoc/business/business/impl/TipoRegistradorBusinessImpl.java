package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.TipoRegistradorAssembler;
import co.edu.uco.evoc.business.business.TipoRegistradorBusiness;
import co.edu.uco.evoc.business.domain.TipoRegistradorDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.TipoRegistradorEntity;

public final class TipoRegistradorBusinessImpl implements TipoRegistradorBusiness{
	
	private DAOFactory daoFactory;

	public TipoRegistradorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final TipoRegistradorDomain domain) {
		
		UUID identificador;
		TipoRegistradorEntity entityTmp;
		List<TipoRegistradorEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = TipoRegistradorEntity.createWithIdentificador(identificador);
			result = daoFactory.getTipoRegistradorDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = TipoRegistradorEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getTipoRegistradorDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Tipo Registrador que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new TipoRegistradorDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final TipoRegistradorEntity entity = TipoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRegistradorDAO().create(entity);

	}

	@Override
	public final List<TipoRegistradorDomain> list(final TipoRegistradorDomain domain) {
		
		final TipoRegistradorEntity entity = TipoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<TipoRegistradorEntity> resultEntityList = daoFactory.getTipoRegistradorDAO().read(entity);
		
		return TipoRegistradorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final TipoRegistradorDomain domain) {
		final TipoRegistradorEntity entity = TipoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRegistradorDAO().update(entity);

		

	}

	@Override
	public final void drop(final TipoRegistradorDomain domain) {
		final TipoRegistradorEntity entity = TipoRegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getTipoRegistradorDAO().delete(entity);

	}


}
