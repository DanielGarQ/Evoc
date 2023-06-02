package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.PartidoAssembler;
import co.edu.uco.evoc.business.business.PartidoBusiness;
import co.edu.uco.evoc.business.business.impl.PartidoBusinessImpl;
import co.edu.uco.evoc.business.facade.PartidoFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.PartidoFacadeImplMessages;
import co.edu.uco.evoc.crosscutting.utils.Messages.ZonaFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.PartidoDTO;

public final class PartidoFacadeImpl implements PartidoFacade{
	
	private final DAOFactory daoFactory;
	private final PartidoBusiness business;
	
	public PartidoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new PartidoBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(PartidoDTO dto) {
		try {
			final var domain = PartidoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= PartidoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= PartidoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<PartidoDTO> list(final PartidoDTO dto) {
		try {
			final var domain = PartidoAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return PartidoAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= ZonaFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= ZonaFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(PartidoDTO dto) {
		try {
			
			final var domain = PartidoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = PartidoFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= PartidoFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(PartidoDTO dto) {
		try {
			
			final var domain = PartidoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= PartidoFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= PartidoFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
