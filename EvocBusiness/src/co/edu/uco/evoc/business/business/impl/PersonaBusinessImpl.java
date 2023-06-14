package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.PersonaAssembler;
import co.edu.uco.evoc.business.business.PersonaBusiness;
import co.edu.uco.evoc.business.domain.PersonaDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.PersonaEntity;

public final class PersonaBusinessImpl implements PersonaBusiness{
	
	private DAOFactory daoFactory;

	public PersonaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final PersonaDomain domain) {
		
		UUID identificador;
		PersonaEntity entityTmp;
		List<PersonaEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = PersonaEntity.createWithIdentificador(identificador);
			result = daoFactory.getPersonaDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = PersonaEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getPersonaDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "La Persona institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new PersonaDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido());
		
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().create(entity);

	}

	@Override
	public final List<PersonaDomain> list(final PersonaDomain domain) {
		
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<PersonaEntity> resultEntityList = daoFactory.getPersonaDAO().read(entity);
		
		return PersonaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final PersonaDomain domain) {
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().update(entity);

		

	}

	@Override
	public final void drop(final PersonaDomain domain) {
		final PersonaEntity entity = PersonaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getPersonaDAO().delete(entity);

	}

}
