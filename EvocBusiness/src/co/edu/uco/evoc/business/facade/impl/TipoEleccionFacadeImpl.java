package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.TipoEleccionAssembler;
import co.edu.uco.evoc.business.business.TipoEleccionBusiness;
import co.edu.uco.evoc.business.business.impl.TipoEleccionBusinessImpl;
import co.edu.uco.evoc.business.facade.TipoEleccionFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.TipoEleccionFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.TipoEleccionDTO;

public final class TipoEleccionFacadeImpl implements TipoEleccionFacade{
	
	private final DAOFactory daoFactory;
	private final TipoEleccionBusiness business;
	
	public TipoEleccionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new TipoEleccionBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(TipoEleccionDTO dto) {
		try {
			final var domain = TipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= TipoEleccionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoEleccionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<TipoEleccionDTO> list(final TipoEleccionDTO dto) {
		try {
			final var domain = TipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return TipoEleccionAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= TipoEleccionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoEleccionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(TipoEleccionDTO dto) {
		try {
			
			final var domain = TipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = TipoEleccionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoEleccionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(TipoEleccionDTO dto) {
		try {
			
			final var domain = TipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= TipoEleccionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= TipoEleccionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
