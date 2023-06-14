package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.EstadoMesaVotacionCalculadoAssembler;
import co.edu.uco.evoc.business.business.EstadoMesaVotacionCalculadoBusiness;
import co.edu.uco.evoc.business.business.impl.EstadoMesaVotacionCalculadoBusinessImpl;
import co.edu.uco.evoc.business.facade.EstadoMesaVotacionCalculadoFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.EstadoMesaVotacionCalculadoFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.EstadoMesaVotacionCalculadoDTO;

public final class EstadoMesaVotacionCalculadoFacadeImpl implements EstadoMesaVotacionCalculadoFacade{
	
	private final DAOFactory daoFactory;
	private final EstadoMesaVotacionCalculadoBusiness business;
	
	public EstadoMesaVotacionCalculadoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoMesaVotacionCalculadoBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(EstadoMesaVotacionCalculadoDTO dto) {
		try {
			final var domain = EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<EstadoMesaVotacionCalculadoDTO> list(final EstadoMesaVotacionCalculadoDTO dto) {
		try {
			final var domain = EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return EstadoMesaVotacionCalculadoAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(EstadoMesaVotacionCalculadoDTO dto) {
		try {
			
			final var domain = EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = EstadoMesaVotacionCalculadoFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(EstadoMesaVotacionCalculadoDTO dto) {
		try {
			
			final var domain = EstadoMesaVotacionCalculadoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= EstadoMesaVotacionCalculadoFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
