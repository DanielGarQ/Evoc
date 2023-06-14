package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.EstadoRegistradorAssembler;
import co.edu.uco.evoc.business.business.EstadoRegistradorBusiness;
import co.edu.uco.evoc.business.business.impl.EstadoRegistradorBusinessImpl;
import co.edu.uco.evoc.business.facade.EstadoRegistradorFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.EstadoRegistradorFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.EstadoRegistradorDTO;

public final class EstadoRegistradorFacadeImpl implements EstadoRegistradorFacade{
	
	private final DAOFactory daoFactory;
	private final EstadoRegistradorBusiness business;
	
	public EstadoRegistradorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoRegistradorBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(EstadoRegistradorDTO dto) {
		try {
			final var domain = EstadoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoRegistradorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoRegistradorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<EstadoRegistradorDTO> list(final EstadoRegistradorDTO dto) {
		try {
			final var domain = EstadoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return EstadoRegistradorAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= EstadoRegistradorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoRegistradorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(EstadoRegistradorDTO dto) {
		try {
			
			final var domain = EstadoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = EstadoRegistradorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoRegistradorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(EstadoRegistradorDTO dto) {
		try {
			
			final var domain = EstadoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoRegistradorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoRegistradorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
