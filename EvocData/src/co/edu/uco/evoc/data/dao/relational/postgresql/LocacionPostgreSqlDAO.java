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
import co.edu.uco.evoc.data.dao.LocacionDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.LocacionEntity;
import co.edu.uco.evoc.entities.ZonaEntity;

public final class LocacionPostgreSqlDAO extends SqlDAO<LocacionEntity> implements LocacionDAO{
	
	public LocacionPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final LocacionEntity entity) {
		
		var sqlStatement = "INSERT INTO Locacion(identificador, direccion, descripcion, potencialElectoral, zona) VALUES (?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getDireccion());
			preparedStatement.setObject(3, entity.getDescripcion());
			preparedStatement.setObject(4, entity.getPotencialElectoral());
			preparedStatement.setObject(5, entity.getZona());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información de la nueva Locacion";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información de la nueva Locacion";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<LocacionEntity> read(final LocacionEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de la Locacion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de la Locacion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final LocacionEntity entity) {
		
		var sqlStatement = "UPDATE Locacion SET direccion= ?, descripcion= ?, potencialElectoral= ?, zona= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getDireccion());
			preparedStatement.setObject(3, entity.getDescripcion());
			preparedStatement.setObject(4, entity.getPotencialElectoral());
			preparedStatement.setObject(5, entity.getZona());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información de la Locacion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de de la Locacion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final LocacionEntity entity) {
		var sqlStatement = "DELETE FROM Locacion WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getDireccion());
			preparedStatement.setObject(3, entity.getDescripcion());
			preparedStatement.setObject(4, entity.getPotencialElectoral());
			preparedStatement.setObject(5, entity.getZona());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información de la Locacion";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información de la Locacion";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, direccion, descripcion, potencialElectoral, zona";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Locacion";
	}

	@Override
	protected final String prepareWhere(LocacionEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getDireccion())) {
				parameters.add(entity.getDireccion());
				where.append(setWhere ? "WHERE " : "AND").append("direccion=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getDescripcion())) {
				parameters.add(entity.getDescripcion());
				where.append(setWhere ? "WHERE " : "AND").append("descripcion=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getPotencialElectoral())) {
				parameters.add(entity.getPotencialElectoral());
				where.append(setWhere ? "WHERE " : "AND").append("potencialElectoral=? ");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getZona())) {
				parameters.add(entity.getZona());
				where.append(setWhere ? "WHERE " : "AND").append("zona LIKE %?% ");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las Locaciones";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Locacion";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<LocacionEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<LocacionEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new LocacionEntity(resultSet.getObject("identificador", UUID.class), resultSet.getString("direccion"),resultSet.getString("descripcion"),resultSet.getString("potencialElectoral"),resultSet.getObject("zona", ZonaEntity.class));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las locaciones";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase LocacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Locacion";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase LocacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
