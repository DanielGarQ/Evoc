package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.NivelTipoEleccionAssembler;
import co.edu.uco.evoc.business.business.NivelTipoEleccionBusiness;
import co.edu.uco.evoc.business.business.impl.NivelTipoEleccionBusinessImpl;
import co.edu.uco.evoc.business.facade.NivelTipoEleccionFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.NivelTipoEleccionFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.NivelTipoEleccionDTO;

public final class NivelTipoEleccionFacadeImpl implements NivelTipoEleccionFacade{
	
	private final DAOFactory daoFactory;
	private final NivelTipoEleccionBusiness business;
	
	public NivelTipoEleccionFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new NivelTipoEleccionBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(NivelTipoEleccionDTO dto) {
		try {
			final var domain = NivelTipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= NivelTipoEleccionFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= NivelTipoEleccionFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<NivelTipoEleccionDTO> list(final NivelTipoEleccionDTO dto) {
		try {
			final var domain = NivelTipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return NivelTipoEleccionAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= NivelTipoEleccionFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= NivelTipoEleccionFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(NivelTipoEleccionDTO dto) {
		try {
			
			final var domain = NivelTipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = NivelTipoEleccionFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= NivelTipoEleccionFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(NivelTipoEleccionDTO dto) {
		try {
			
			final var domain = NivelTipoEleccionAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= NivelTipoEleccionFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= NivelTipoEleccionFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
