package co.edu.uco.evoc.data.dao.relational.postgresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.crosscutting.exception.EvocDataException;
import co.edu.uco.evoc.crosscutting.exception.EvocException;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.TipoRegistradorDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.TipoRegistradorEntity;

public final class TipoRegistradorPostgreSqlDAO extends SqlDAO<TipoRegistradorEntity> implements TipoRegistradorDAO{
	
	public TipoRegistradorPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final TipoRegistradorEntity entity) {
		
		var sqlStatement = "INSERT INTO TipoRegistrador(codigo, nombre, descripcion) VALUES (?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getDescripcion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo Tipo Registrador";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo tipo registrador";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<TipoRegistradorEntity> read(final TipoRegistradorEntity entity) {
		var sqlStatement = new StringBuilder();
		var parameters = new ArrayList<>();
		
		sqlStatement.append(prepareSelect());
		sqlStatement.append(prepareFrom());
		sqlStatement.append(prepareWhere(entity, parameters));
		sqlStatement.append(prepareOrderBy());
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement.toString())){
			
			setParameters(preparedStatement, parameters);
			
			return executeQuery(preparedStatement);
			
		} catch(final EvocException exception){
			
			throw(exception);
		
		} catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información del tipo registrador deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del tipo registrador deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final TipoRegistradorEntity entity) {
		
		var sqlStatement = "UPDATE TipoRegistrador SET nombre= ?, Descripcion= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getDescripcion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del tipo registrador deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del tipo registrador deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final TipoRegistradorEntity entity) {
		var sqlStatement = "DELETE FROM TipoRegistrador WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getDescripcion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del tipo registrador";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase TipoRegisytradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del tipo registrador deseado";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase TiporegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, descripcion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM TipoRegistrador";
	}

	@Override
	protected final String prepareWhere(TipoRegistradorEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND").append("nombre=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append(setWhere ? "WHERE " : "AND").append("nombre=? ");
				setWhere = false;
			}
			
		}
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY nombre ASC";
	}

	@Override
	protected final void setParameters(PreparedStatement preparedStatement, List<Object> parameters) {
		try {
			if(!UtilObject.isNull(parameters) && !UtilObject.isNull(preparedStatement)) {
				for(int index = 0; index < parameters.size(); index++) {
					preparedStatement.setObject(index + 1, parameters.get(index));
				}
			}
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los tipos registrador";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Tipo Registrador";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<TipoRegistradorEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<TipoRegistradorEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new TipoRegistradorEntity(resultSet.getObject("identificador", UUID.class), resultSet.getString("nombre"),resultSet.getString("descripcion"));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Tipos Registrador";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase TipoRegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Tipo Registrador";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase TipoRegistradorPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
