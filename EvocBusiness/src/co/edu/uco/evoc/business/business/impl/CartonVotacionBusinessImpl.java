package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.CandidatoAssembler;
import co.edu.uco.evoc.business.assembler.concrete.CartonVotacionAssembler;
import co.edu.uco.evoc.business.business.CartonVotacionBusiness;
import co.edu.uco.evoc.business.domain.CartonVotacionDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.CartonVotacionEntity;

public class CartonVotacionBusinessImpl implements CartonVotacionBusiness{
	
	private DAOFactory daoFactory;

	public CartonVotacionBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final CartonVotacionDomain domain) {
		
		UUID identificador;
		CartonVotacionEntity entityTmp;
		List<CartonVotacionEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = CartonVotacionEntity.createWithIdentificador(identificador);
			result = daoFactory.getCartonVotacionDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = CartonVotacionEntity.createWithCandidatos(CandidatoAssembler.getinstance().toEntityFromDomain(domain.getCandidatos()));
		result = daoFactory.getCartonVotacionDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Carton Votacion que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new CartonVotacionDomain(identificador, domain.getCandidatos(), domain.getEleccion());
		
		final CartonVotacionEntity entity = CartonVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonVotacionDAO().create(entity);

	}

	@Override
	public final List<CartonVotacionDomain> list(final CartonVotacionDomain domain) {
		
		final CartonVotacionEntity entity = CartonVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<CartonVotacionEntity> resultEntityList = daoFactory.getCartonVotacionDAO().read(entity);
		
		return CartonVotacionAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final CartonVotacionDomain domain) {
		final CartonVotacionEntity entity = CartonVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonVotacionDAO().update(entity);

		

	}

	@Override
	public final void drop(final CartonVotacionDomain domain) {
		final CartonVotacionEntity entity = CartonVotacionAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonVotacionDAO().delete(entity);

	}

}
