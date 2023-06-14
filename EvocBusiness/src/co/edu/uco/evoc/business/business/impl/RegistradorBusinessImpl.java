package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.RegistradorAssembler;
import co.edu.uco.evoc.business.business.RegistradorBusiness;
import co.edu.uco.evoc.business.domain.RegistradorDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.RegistradorEntity;

public final class RegistradorBusinessImpl implements RegistradorBusiness{
	
	private DAOFactory daoFactory;

	public RegistradorBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RegistradorDomain domain) {
		
		UUID identificador;
		RegistradorEntity entityTmp;
		List<RegistradorEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = RegistradorEntity.createWithIdentificador(identificador);
			result = daoFactory.getRegistradorDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = RegistradorEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getRegistradorDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Registrador que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new RegistradorDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido(), domain.getTipoRegistrador(), domain.getRegistraduria(), domain.getTelefono(), domain.getCorreo(), domain.getFechaInicialCargo(), domain.getFechaFinalCargo(), domain.getEstadoRegistrador());
		
		final RegistradorEntity entity = RegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistradorDAO().create(entity);

	}

	@Override
	public final List<RegistradorDomain> list(final RegistradorDomain domain) {
		
		final RegistradorEntity entity = RegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RegistradorEntity> resultEntityList = daoFactory.getRegistradorDAO().read(entity);
		
		return RegistradorAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RegistradorDomain domain) {
		final RegistradorEntity entity = RegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistradorDAO().update(entity);

		

	}

	@Override
	public final void drop(final RegistradorDomain domain) {
		final RegistradorEntity entity = RegistradorAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistradorDAO().delete(entity);

	}

}
