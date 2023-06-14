package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.JuradoVotacionAssembler;
import co.edu.uco.evoc.business.business.JuradoVotacionBusiness;
import co.edu.uco.evoc.business.business.impl.JuradoVotacionBusinessImpl;
import co.edu.uco.evoc.business.facade.JuradoVotacionFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.JuradoVotacionFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.JuradoVotacionDTO;

public final class JuradoVotacionFacadeImpl implements JuradoVotacionFacade{
	
	private final DAOFactory daoFactory;
	private final JuradoVotacionBusiness business;
	
	public JuradoVotacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new JuradoVotacionBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(JuradoVotacionDTO dto) {
		try {
			final var domain = JuradoVotacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= JuradoVotacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoVotacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<JuradoVotacionDTO> list(final JuradoVotacionDTO dto) {
		try {
			final var domain = JuradoVotacionAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return JuradoVotacionAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= JuradoVotacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoVotacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(JuradoVotacionDTO dto) {
		try {
			
			final var domain = JuradoVotacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = JuradoVotacionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoVotacionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(JuradoVotacionDTO dto) {
		try {
			
			final var domain = JuradoVotacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= JuradoVotacionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= JuradoVotacionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
