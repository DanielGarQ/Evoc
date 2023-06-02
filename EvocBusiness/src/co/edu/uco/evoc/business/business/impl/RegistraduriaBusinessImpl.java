package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.RegistraduriaAssembler;
import co.edu.uco.evoc.business.business.RegistraduriaBusiness;
import co.edu.uco.evoc.business.domain.RegistraduriaDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.RegistraduriaEntity;

public class RegistraduriaBusinessImpl implements RegistraduriaBusiness{
	
	private DAOFactory daoFactory;

	public RegistraduriaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final RegistraduriaDomain domain) {
		
		UUID identificador;
		RegistraduriaEntity entityTmp;
		List<RegistraduriaEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = RegistraduriaEntity.createWithIdentificador(identificador);
			result = daoFactory.getRegistraduriaDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = RegistraduriaEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getRegistraduriaDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "La Registraduria que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new RegistraduriaDomain(identificador, domain.getNombre(), domain.getDescripcion());
		
		final RegistraduriaEntity entity = RegistraduriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistraduriaDAO().create(entity);

	}

	@Override
	public final List<RegistraduriaDomain> list(final RegistraduriaDomain domain) {
		
		final RegistraduriaEntity entity = RegistraduriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<RegistraduriaEntity> resultEntityList = daoFactory.getRegistraduriaDAO().read(entity);
		
		return RegistraduriaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final RegistraduriaDomain domain) {
		final RegistraduriaEntity entity = RegistraduriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistraduriaDAO().update(entity);

		

	}

	@Override
	public final void drop(final RegistraduriaDomain domain) {
		final RegistraduriaEntity entity = RegistraduriaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getRegistraduriaDAO().delete(entity);

	}


}
