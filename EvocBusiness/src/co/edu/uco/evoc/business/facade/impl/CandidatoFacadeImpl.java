package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.CandidatoAssembler;
import co.edu.uco.evoc.business.business.CandidatoBusiness;
import co.edu.uco.evoc.business.business.impl.CandidatoBusinessImpl;
import co.edu.uco.evoc.business.facade.CandidatoFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.CandidatoFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.CandidatoDTO;

public final class CandidatoFacadeImpl implements CandidatoFacade{
	
	private final DAOFactory daoFactory;
	private final CandidatoBusiness business;
	
	public CandidatoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new CandidatoBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(CandidatoDTO dto) {
		try {
			final var domain = CandidatoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= CandidatoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CandidatoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<CandidatoDTO> list(final CandidatoDTO dto) {
		try {
			final var domain = CandidatoAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return CandidatoAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= CandidatoFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CandidatoFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(CandidatoDTO dto) {
		try {
			
			final var domain = CandidatoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = CandidatoFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CandidatoFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(CandidatoDTO dto) {
		try {
			
			final var domain = CandidatoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= CandidatoFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= CandidatoFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
