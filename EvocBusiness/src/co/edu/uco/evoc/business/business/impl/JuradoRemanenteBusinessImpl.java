package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.JuradoRemanenteAssembler;
import co.edu.uco.evoc.business.business.JuradoRemanenteBusiness;
import co.edu.uco.evoc.business.domain.JuradoRemanenteDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.JuradoRemanenteEntity;

public final class JuradoRemanenteBusinessImpl implements JuradoRemanenteBusiness{
	
	private DAOFactory daoFactory;

	public JuradoRemanenteBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final JuradoRemanenteDomain domain) {
		
		UUID identificador;
		JuradoRemanenteEntity entityTmp;
		List<JuradoRemanenteEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = JuradoRemanenteEntity.createWithIdentificador(identificador);
			result = daoFactory.getJuradoRemanenteDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = JuradoRemanenteEntity.createWithNombre(domain.getNombre());
		result = daoFactory.getJuradoRemanenteDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Jurado Remanente que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new JuradoRemanenteDomain(identificador, domain.getTipoIdentificacion(), domain.getIdentificacion(), domain.getNombre(), domain.getApellido(), domain.getTelefono(), domain.getCorreo(), domain.getMesaVotacion());
		
		final JuradoRemanenteEntity entity = JuradoRemanenteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoRemanenteDAO().create(entity);

	}

	@Override
	public final List<JuradoRemanenteDomain> list(final JuradoRemanenteDomain domain) {
		
		final JuradoRemanenteEntity entity = JuradoRemanenteAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<JuradoRemanenteEntity> resultEntityList = daoFactory.getJuradoRemanenteDAO().read(entity);
		
		return JuradoRemanenteAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final JuradoRemanenteDomain domain) {
		final JuradoRemanenteEntity entity = JuradoRemanenteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoRemanenteDAO().update(entity);

		

	}

	@Override
	public final void drop(final JuradoRemanenteDomain domain) {
		final JuradoRemanenteEntity entity = JuradoRemanenteAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getJuradoRemanenteDAO().delete(entity);

	}

}
