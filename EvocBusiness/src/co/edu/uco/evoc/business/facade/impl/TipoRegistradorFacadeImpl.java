package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.TipoRegistradorAssembler;
import co.edu.uco.evoc.business.business.TipoRegistradorBusiness;
import co.edu.uco.evoc.business.business.impl.TipoRegistradorBusinessImpl;
import co.edu.uco.evoc.business.facade.TipoRegistradorFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.TipoRegistradorFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.TipoRegistradorDTO;

public final class TipoRegistradorFacadeImpl implements TipoRegistradorFacade{
	
	private final DAOFactory daoFactory;
	private final TipoRegistradorBusiness business;
	
	public TipoRegistradorFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new TipoRegistradorBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(TipoRegistradorDTO dto) {
		try {
			final var domain = TipoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= TipoRegistradorFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoRegistradorFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<TipoRegistradorDTO> list(final TipoRegistradorDTO dto) {
		try {
			final var domain = TipoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return TipoRegistradorAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= TipoRegistradorFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoRegistradorFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(TipoRegistradorDTO dto) {
		try {
			
			final var domain = TipoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = TipoRegistradorFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoRegistradorFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(TipoRegistradorDTO dto) {
		try {
			
			final var domain = TipoRegistradorAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= TipoRegistradorFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoRegistradorFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
