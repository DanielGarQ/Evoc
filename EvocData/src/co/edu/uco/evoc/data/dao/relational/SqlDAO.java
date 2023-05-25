package co.edu.uco.evoc.data.dao.relational;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import co.edu.uco.evoc.crosscutting.exception.EvocDataException;
import co.edu.uco.evoc.crosscutting.utils.UtilSql;

public abstract class SqlDAO<E>{
	
private Connection connection;
	
	protected SqlDAO(final Connection connection) {
		setConnection(connection);
	}
	
	protected final Connection getConnection() {
		return connection;
	}
	
	private final void setConnection(final Connection connection) {
		if (!UtilSql.connectionIsOpen(connection)) {
			var userMessage = " se ha presentado un problema tratando de llevar a cabo la operacion deseada. Por favor intende de nuevo, si el problema persiste, contacte al administrador de la aplicacion...";
			var technicalMessage = " No se ha podido crear el SqlDAO,debido a que la conexion no está abierta...";
			
			throw EvocDataException.create(technicalMessage, userMessage);
		}
		this.connection = connection;
	}
	
	protected  abstract String prepareSelect();
	
	protected  abstract String prepareFrom();
	
	protected  abstract String prepareWhere(E entity, List<Object> parameters);
	
	protected  abstract String prepareOrderBy();
	
	protected abstract void setParameters(PreparedStatement prepareStatement, List<Object> parameters);
	
	protected abstract List<E> executeQuery(PreparedStatement preparedStatement);

}
