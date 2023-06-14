package co.edu.uco.evoc.business.facade.impl;

import java.util.List;

import co.edu.uco.evoc.business.assembler.concrete.VotanteRegistradoAssembler;
import co.edu.uco.evoc.business.business.VotanteRegistradoBusiness;
import co.edu.uco.evoc.business.business.impl.VotanteRegistradoBusinessImpl;
import co.edu.uco.evoc.business.facade.VotanteRegistradoFacade;
import co.edu.uco.evoc.crosscutting.exception.EvocBusinessException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.Messages.VotanteRegistradoFacadeImplMessages;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.factory.Factory;
import co.edu.uco.evoc.dto.VotanteRegistradoDTO;

public final class VotanteRegistradoFacadeImpl implements VotanteRegistradoFacade{
	
	private final DAOFactory daoFactory;
	private final VotanteRegistradoBusiness business;
	
	public VotanteRegistradoFacadeImpl() {
		daoFactory = DAOFactory.getFactory(Factory.SQLSERVER);
		business = new VotanteRegistradoBusinessImpl(daoFactory);
	}
	
	@Override
	public void register(VotanteRegistradoDTO dto) {
		try {
			final var domain = VotanteRegistradoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.register(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= VotanteRegistradoFacadeImplMessages.REGISTER_EXCEPTION_USER_MESSAGE;
			var technicalMessage= VotanteRegistradoFacadeImplMessages.REGISTER_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public final List<VotanteRegistradoDTO> list(final VotanteRegistradoDTO dto) {
		try {
			final var domain = VotanteRegistradoAssembler.getinstance().toDomainFromDto(dto);
			final var returnDomainList = business.list(domain);
			
			return VotanteRegistradoAssembler.getinstance().toDtoListFromDomainList(returnDomainList);
		}catch (final EvocException exception){
			throw exception;
		}catch (final Exception exception) {
			var userMessage= VotanteRegistradoFacadeImplMessages.LIST_EXCEPTION_USER_MESSAGE;
			var technicalMessage= VotanteRegistradoFacadeImplMessages.LIST_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
			
		}finally {
			daoFactory.cerrarConexion();
		}
	}

	@Override
	public void modify(VotanteRegistradoDTO dto) {
		try {
			
			final var domain = VotanteRegistradoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.modify(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage = VotanteRegistradoFacadeImplMessages.MODIFY_EXCEPTION_USER_MESSAGE;
			var technicalMessage= VotanteRegistradoFacadeImplMessages.MODIFY_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

	@Override
	public void drop(VotanteRegistradoDTO dto) {
		try {
			
			final var domain = VotanteRegistradoAssembler.getinstance().toDomainFromDto(dto);
			
			daoFactory.iniciarTransaccion();
			business.drop(domain);
			daoFactory.confirmarTransaccion();
		}catch (final EvocException exception) {
			daoFactory.cancelarTransaccion();
			throw exception;
		}catch (final Exception exception) {
			daoFactory.cancelarTransaccion();
			
			var userMessage= VotanteRegistradoFacadeImplMessages.DROP_EXCEPTION_USER_MESSAGE;
			var technicalMessage= VotanteRegistradoFacadeImplMessages.DROP_EXCEPTION_TECHNICAL_MESSAGE;
			
			throw EvocBusinessException.create(technicalMessage, userMessage, exception);
		}finally {
			daoFactory.cerrarConexion();
		}
		
	}

}
