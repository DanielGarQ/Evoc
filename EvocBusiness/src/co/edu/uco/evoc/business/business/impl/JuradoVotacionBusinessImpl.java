package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.JuradoVotacionAssembler;
import co.edu.uco.evoc.business.business.JuradoVotacionBusiness;
import co.edu.uco.evoc.business.domain.JuradoVotacionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.JuradoVotacionEntity;

public final class JuradoVotacionBusinessImpl implements JuradoVotacionBusiness{
	
	private DAOFactory daoFactory;

	public JuradoVotacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final JuradoVotacionDomain domain) {
		
		UUID identificador;
		JuradoVotacionEntity entityTmp;
		List<JuradoVotacionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = JuradoVotacionEntity.createWithIdentificador(identificador);
			result = daoFactory.getJuradoVotacionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = JuradoVotacionEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getJuradoVotacionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Jurado Votacion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new JuradoVotacionDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido(), domain.getTelefono(), domain.getCorreo(), domain.getMesaVotacion());
		
		final JuradoVotacionEntity entity = JuradoVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoVotacionDAO().create(entity);

	}

	@Override
	public final List<JuradoVotacionDomain> list(final JuradoVotacionDomain domain) {
		
		final JuradoVotacionEntity entity = JuradoVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<JuradoVotacionEntity> resultEntityList = daoFactory.getJuradoVotacionDAO().read(entity);
		
		return JuradoVotacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final JuradoVotacionDomain domain) {
		final JuradoVotacionEntity entity = JuradoVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoVotacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final JuradoVotacionDomain domain) {
		final JuradoVotacionEntity entity = JuradoVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoVotacionDAO().delete(entity);

	}

}
