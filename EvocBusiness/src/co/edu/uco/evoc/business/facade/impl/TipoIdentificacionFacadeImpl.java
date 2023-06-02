package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.TipoIdentificacionAssembler;
import co.edu.uco.evoc.business.business.TipoIdentificacionBusiness;
import co.edu.uco.evoc.business.business.impl.TipoIdentificacionBusinessImpl;
import co.edu.uco.evoc.business.facade.TipoIdentificacionFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.TipoIdentificacionFacadeImplMessages;
import co.edu.uco.evoc.crosscutting.utils.Messages.ZonaFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.TipoIdentificacionDTO;

public final class TipoIdentificacionFacadeImpl implements TipoIdentificacionFacade{
	
	private final DAOFactory daoFactory;
	private final TipoIdentificacionBusiness business;
	
	public TipoIdentificacionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new TipoIdentificacionBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(TipoIdentificacionDTO dto) {
		try {
			final var domain = TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= TipoIdentificacionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoIdentificacionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<TipoIdentificacionDTO> list(final TipoIdentificacionDTO dto) {
		try {
			final var domain = TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return TipoIdentificacionAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= TipoIdentificacionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoIdentificacionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(TipoIdentificacionDTO dto) {
		try {
			
			final var domain = TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = ZonaFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= ZonaFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(TipoIdentificacionDTO dto) {
		try {
			
			final var domain = TipoIdentificacionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= ZonaFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= ZonaFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
