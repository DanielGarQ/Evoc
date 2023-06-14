package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.JuradoRemanenteAssembler;
import co.edu.uco.evoc.business.business.JuradoRemanenteBusiness;
import co.edu.uco.evoc.business.business.impl.JuradoRemanenteBusinessImpl;
import co.edu.uco.evoc.business.facade.JuradoRemanenteFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.JuradoRemanenteFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.JuradoRemanenteDTO;

public final class JuradoRemanenteFacadeImpl implements JuradoRemanenteFacade{
	
	private final DAOFactory daoFactory;
	private final JuradoRemanenteBusiness business;
	
	public JuradoRemanenteFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new JuradoRemanenteBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(JuradoRemanenteDTO dto) {
		try {
			final var domain = JuradoRemanenteAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= JuradoRemanenteFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoRemanenteFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<JuradoRemanenteDTO> list(final JuradoRemanenteDTO dto) {
		try {
			final var domain = JuradoRemanenteAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return JuradoRemanenteAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= JuradoRemanenteFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoRemanenteFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(JuradoRemanenteDTO dto) {
		try {
			
			final var domain = JuradoRemanenteAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = JuradoRemanenteFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoRemanenteFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(JuradoRemanenteDTO dto) {
		try {
			
			final var domain = JuradoRemanenteAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= JuradoRemanenteFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoRemanenteFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
