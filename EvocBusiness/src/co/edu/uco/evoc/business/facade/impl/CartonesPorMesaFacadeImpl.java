package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.CartonesPorMesaAssembler;
import co.edu.uco.evoc.business.business.CartonesPorMesaBusiness;
import co.edu.uco.evoc.business.business.impl.CartonesPorMesaBusinessImpl;
import co.edu.uco.evoc.business.facade.CartonesPorMesaFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.CartonesPorMesaFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.CartonesPorMesaDTO;

public final class CartonesPorMesaFacadeImpl implements CartonesPorMesaFacade{
	
	private final DAOFactory daoFactory;
	private final CartonesPorMesaBusiness business;
	
	public CartonesPorMesaFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new CartonesPorMesaBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(CartonesPorMesaDTO dto) {
		try {
			final var domain = CartonesPorMesaAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= CartonesPorMesaFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CartonesPorMesaFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<CartonesPorMesaDTO> list(final CartonesPorMesaDTO dto) {
		try {
			final var domain = CartonesPorMesaAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return CartonesPorMesaAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= CartonesPorMesaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CartonesPorMesaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(CartonesPorMesaDTO dto) {
		try {
			
			final var domain = CartonesPorMesaAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = CartonesPorMesaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CartonesPorMesaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(CartonesPorMesaDTO dto) {
		try {
			
			final var domain = CartonesPorMesaAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= CartonesPorMesaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CartonesPorMesaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
