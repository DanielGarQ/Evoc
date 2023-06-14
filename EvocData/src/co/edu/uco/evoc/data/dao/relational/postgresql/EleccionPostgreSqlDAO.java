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
import co.edu.uco.evoc.data.dao.EleccionDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.EleccionEntity;
import co.edu.uco.evoc.entities.EstadoEleccionEntity;
import co.edu.uco.evoc.entities.RegistradorEntity;
import co.edu.uco.evoc.entities.TipoEleccionEntity;
import co.edu.uco.evoc.entities.ZonaEntity;

public final class EleccionPostgreSqlDAO extends SqlDAO<EleccionEntity> implements EleccionDAO{
	
	public EleccionPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final EleccionEntity entity) {
		
		var sqlStatement = "INSERT INTO Eleccion(identificador, nombre, tipoEleccion, zona, fechaInicial, fechaFinal, registrador, estadoEleccion) VALUES (?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getTipoEleccion());
			preparedStatement.setObject(4, entity.getZona());
			preparedStatement.setObject(5, entity.getFechaInicial());
			preparedStatement.setObject(6, entity.getFechaFinal());
			preparedStatement.setObject(7, entity.getRegistrador());
			preparedStatement.setObject(8, entity.getEstadoEleccion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información de la nueva Eleccion";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información de la nueva Eleccion";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<EleccionEntity> read(final EleccionEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de la Eleccion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de la Eleccion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final EleccionEntity entity) {
		
		var sqlStatement = "UPDATE Eleccion SET nombre= ?, tipoEleccion= ?, zona= ?, fechaInicial= ?, fechaFinal= ?, registrador= ?, estadoEleccion= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getTipoEleccion());
			preparedStatement.setObject(4, entity.getZona());
			preparedStatement.setObject(5, entity.getFechaInicial());
			preparedStatement.setObject(6, entity.getFechaFinal());
			preparedStatement.setObject(7, entity.getRegistrador());
			preparedStatement.setObject(8, entity.getEstadoEleccion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información de la Eleccion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de de la Eleccion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final EleccionEntity entity) {
		var sqlStatement = "DELETE FROM Eleccion WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNombre());
			preparedStatement.setObject(3, entity.getTipoEleccion());
			preparedStatement.setObject(4, entity.getZona());
			preparedStatement.setObject(5, entity.getFechaInicial());
			preparedStatement.setObject(6, entity.getFechaFinal());
			preparedStatement.setObject(7, entity.getRegistrador());
			preparedStatement.setObject(8, entity.getEstadoEleccion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información de la Eleccion";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información de la Eleccion";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, nombre, tipoEleccion, zona, fechaInicial, fechaFinal, registrador, estadoEleccion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Eleccion";
	}

	@Override
	protected final String prepareWhere(EleccionEntity entity, List<Object> parameters) {
		
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
			
			if (!UtilObject.isNull(entity.getTipoEleccion())) {
				parameters.add(entity.getTipoEleccion());
				where.append("WHERE tipoEleccion=?");
			}
			
			if (!UtilObject.isNull(entity.getZona())) {
				parameters.add(entity.getZona());
				where.append("WHERE zona=?");
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getFechaInicial())) {
				parameters.add(entity.getFechaInicial());
				where.append(setWhere ? "WHERE " : "AND").append("fechaInicial=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getFechaFinal())) {
				parameters.add(entity.getFechaFinal());
				where.append(setWhere ? "WHERE " : "AND").append("fechaFinal=? ");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getRegistrador())) {
				parameters.add(entity.getRegistrador());
				where.append("WHERE registrador=?");
			}
			
			if (!UtilObject.isNull(entity.getEstadoEleccion())) {
				parameters.add(entity.getEstadoEleccion());
				where.append("WHERE estadoEleccion=?");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las Elecciones";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Eleccion";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<EleccionEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<EleccionEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new EleccionEntity(resultSet.getObject("identificador", UUID.class), resultSet.getString("nombre"),resultSet.getObject("tipoEleccion", TipoEleccionEntity.class) , resultSet.getObject("zona", ZonaEntity.class),resultSet.getString("fechaInicial"), resultSet.getString("fechaFinal"), resultSet.getObject("registrador", RegistradorEntity.class), resultSet.getObject("estadoEleccion", EstadoEleccionEntity.class));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las Elecciones";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Eleccion";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase EleccionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
