package co.edu.uco.evoc.business.business.impl;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.business.assembler.concrete.CartonesPorMesaAssembler;
import co.edu.uco.evoc.business.assembler.concrete.MesaVotacionAssembler;
import co.edu.uco.evoc.business.business.CartonesPorMesaBusiness;
import co.edu.uco.evoc.business.domain.CartonesPorMesaDomain;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.entities.CartonesPorMesaEntity;

public final class CartonesPorMesaBusinessImpl implements CartonesPorMesaBusiness{
	
	private DAOFactory daoFactory;

	public CartonesPorMesaBusinessImpl(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public final void register(final CartonesPorMesaDomain domain) {
		
		UUID identificador;
		CartonesPorMesaEntity entityTmp;
		List<CartonesPorMesaEntity> result;
		
		do {
			identificador = UtilUUID.generateNewUUID();
			entityTmp = CartonesPorMesaEntity.createWithIdentificador(identificador);
			result = daoFactory.getCartonesPorMesaDAO().read(entityTmp);
			
		}while(!result.isEmpty());
		
		entityTmp = CartonesPorMesaEntity.createWithMesaVotacion(MesaVotacionAssembler.getinstance().toEntityFromDomain(domain.getMesaVotacion()));
		result = daoFactory.getCartonesPorMesaDAO().read(entityTmp);
		
		if(!result.isEmpty()) {
			var userMessage = "El Cartones Por Mesa que intenta crear ya existe, por favor verifique los datos y de ser necesario, proceda a actualizarlos...";
			throw EvocBusinessException.create(userMessage);
		}
		
		final var domainToCreate = new CartonesPorMesaDomain(identificador, domain.getMesaVotacion(), domain.getCartonVotacion(), domain.getVotante(), domain.isMarcacion());
		
		final CartonesPorMesaEntity entity = CartonesPorMesaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonesPorMesaDAO().create(entity);

	}

	@Override
	public final List<CartonesPorMesaDomain> list(final CartonesPorMesaDomain domain) {
		
		final CartonesPorMesaEntity entity = CartonesPorMesaAssembler.getinstance()
				.toEntityFromDomain(domain);
		
		final List<CartonesPorMesaEntity> resultEntityList = daoFactory.getCartonesPorMesaDAO().read(entity);
		
		return CartonesPorMesaAssembler.getinstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public final void modify(final CartonesPorMesaDomain domain) {
		final CartonesPorMesaEntity entity = CartonesPorMesaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonesPorMesaDAO().update(entity);

		

	}

	@Override
	public final void drop(final CartonesPorMesaDomain domain) {
		final CartonesPorMesaEntity entity = CartonesPorMesaAssembler.getinstance()
				.toEntityFromDomain(domain);
		daoFactory.getCartonesPorMesaDAO().delete(entity);

	}

}
