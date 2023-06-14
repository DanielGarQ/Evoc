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
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.data.dao.CartonVotacionDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.CandidatoEntity;
import co.edu.uco.evoc.entities.CartonVotacionEntity;
import co.edu.uco.evoc.entities.EleccionEntity;

public final class CartonVotacionPostgreSqlDAO extends SqlDAO<CartonVotacionEntity> implements CartonVotacionDAO{
	
	public CartonVotacionPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final CartonVotacionEntity entity) {
		
		var sqlStatement = "INSERT INTO CartonVotacion(identificador, candidatos, eleccion) VALUES (?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getCandidatos());
			preparedStatement.setObject(3, entity.getEleccion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo CartonVotacion";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo Carton Votacion";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<CartonVotacionEntity> read(final CartonVotacionEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información del Carton Votacion deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Carton Votacion deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final CartonVotacionEntity entity) {
		
		var sqlStatement = "UPDATE CartonVotacion SET candidatos= ?, eleccion= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getCandidatos());
			preparedStatement.setObject(3, entity.getEleccion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del Carton Votacion deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Carton Votacion deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final CartonVotacionEntity entity) {
		var sqlStatement = "DELETE FROM CartonVotacion WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del Carton Votacion";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del Carton Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, candidatos, eleccion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Zona";
	}

	@Override
	protected final String prepareWhere(CartonVotacionEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getCandidatos())) {
				parameters.add(entity.getCandidatos());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getEleccion())) {
				parameters.add(entity.getEleccion());
				where.append("WHERE identificador=?");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los cartones de votacion";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Carton Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<CartonVotacionEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<CartonVotacionEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new CartonVotacionEntity(resultSet.getObject("identificador", UUID.class), resultSet.getObject("candidatos", CandidatoEntity.class), resultSet.getObject("eleccion", EleccionEntity.class));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Cartones de votacion";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Carton Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase CartonVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
