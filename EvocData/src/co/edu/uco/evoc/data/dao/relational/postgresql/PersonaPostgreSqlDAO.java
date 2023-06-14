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
import co.edu.uco.evoc.data.dao.PersonaDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.PersonaEntity;
import co.edu.uco.evoc.entities.TipoIdentificacionEntity;

public class PersonaPostgreSqlDAO extends SqlDAO<PersonaEntity> implements PersonaDAO{
	
	public PersonaPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final PersonaEntity entity) {
		
		var sqlStatement = "INSERT INTO Persona(identificador, tipoIdentificacion, identificacion, nombre, apellido) VALUES (?, ?, ?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información de la nueva Persona";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información de la nueva Persona";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<PersonaEntity> read(final PersonaEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de la Persona deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de la Persona deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final PersonaEntity entity) {
		
		var sqlStatement = "UPDATE Persona SET tipoIdentificacion= ?, identificacion= ?, nombre= ?, apellido= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información de la Persona deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de la Persona deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final PersonaEntity entity) {
		var sqlStatement = "DELETE FROM Persona WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información de la Persona";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información de la Persona deseada";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, tipoIdentificacion, identificacion, nombre, apellido";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Persona";
	}

	@Override
	protected final String prepareWhere(PersonaEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getTipoIdentificacion())) {
				parameters.add(entity.getTipoIdentificacion());
				where.append("WHERE tipoIdentificacion=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getIdentificacion())) {
				parameters.add(entity.getIdentificacion());
				where.append(setWhere ? "WHERE " : "AND").append("identificacion=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getNombre())) {
				parameters.add(entity.getNombre());
				where.append(setWhere ? "WHERE " : "AND").append("nombre=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getApellido())) {
				parameters.add(entity.getApellido());
				where.append(setWhere ? "WHERE " : "AND").append("apellido=? ");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las Personas";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Persona";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<PersonaEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<PersonaEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new PersonaEntity(resultSet.getObject("identificador", UUID.class),resultSet.getObject("tipoIdentificacion", TipoIdentificacionEntity.class), resultSet.getString("identificacion") ,resultSet.getString("nombre"),resultSet.getString("apellido"));
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las personas";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase PersonaSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Persona";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase PersonaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
