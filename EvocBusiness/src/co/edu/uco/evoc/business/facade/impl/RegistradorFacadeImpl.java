package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.RegistradorAssembler;
import co.edu.uco.evoc.business.business.RegistradorBusiness;
import co.edu.uco.evoc.business.business.impl.RegistradorBusinessImpl;
import co.edu.uco.evoc.business.facade.RegistradorFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.RegistradorFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.RegistradorDTO;

public final class RegistradorFacadeImpl implements RegistradorFacade{
	
	private final DAOFactory daoFactory;
	private final RegistradorBusiness business;
	
	public RegistradorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new RegistradorBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(RegistradorDTO dto) {
		try {
			final var domain = RegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= RegistradorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= RegistradorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<RegistradorDTO> list(final RegistradorDTO dto) {
		try {
			final var domain = RegistradorAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return RegistradorAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= RegistradorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= RegistradorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(RegistradorDTO dto) {
		try {
			
			final var domain = RegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = RegistradorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= RegistradorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(RegistradorDTO dto) {
		try {
			
			final var domain = RegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= RegistradorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= RegistradorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
