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
import co.edu.uco.evoc.data.dao.MesaVotacionDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.EstadoMesaVotacionCalculadoEntity;
import co.edu.uco.evoc.entities.LocacionEntity;
import co.edu.uco.evoc.entities.MesaVotacionEntity;

public final class MesaVotacionPostgreSqlDAO extends SqlDAO<MesaVotacionEntity> implements MesaVotacionDAO{
	
	public MesaVotacionPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final MesaVotacionEntity entity) {
		
		var sqlStatement = "INSERT INTO MesaVotacion(identificador, numeroMesa, potencialElectoral, locacion, estadoMesaVotacionCalculado) VALUES (?, ?, ?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNumeroMesa());
			preparedStatement.setObject(3, entity.getPotencialElectoral());
			preparedStatement.setObject(4, entity.getLocacion());
			preparedStatement.setObject(5, entity.getEstadoMesaVotacionCalculado());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información de la nueva Mesa Votacion";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase MesaVotacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información de la nueva Mesa Votacion";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase MesaVotacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<MesaVotacionEntity> read(final MesaVotacionEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de la MesaVotacion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de la Mesa Votacion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase MesaVotacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final MesaVotacionEntity entity) {
		
		var sqlStatement = "UPDATE MesaVotacion SET numeroMesa= ?, potencialElectoral= ?, locacion= ?, estadoMesaVotacionCalculado= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getNumeroMesa());
			preparedStatement.setObject(3, entity.getPotencialElectoral());
			preparedStatement.setObject(4, entity.getLocacion());
			preparedStatement.setObject(5, entity.getEstadoMesaVotacionCalculado());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información de la Mesa Votacion deseada...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información de de la MesaVotacion deseada...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase MesaVotacionSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final MesaVotacionEntity entity) {
		var sqlStatement = "DELETE FROM MesaVotacion WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información de la Mesa Votacion";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información de la Mesa Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, numeroMesa, potencialElectoral, locacion, estadoMesaVotacionCalculado";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM MesaVotacion";
	}

	@Override
	protected final String prepareWhere(MesaVotacionEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getNumeroMesa())) {
				parameters.add(entity.getNumeroMesa());
				where.append(setWhere ? "WHERE " : "AND").append("numeroMesa=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getPotencialElectoral())) {
				parameters.add(entity.getPotencialElectoral());
				where.append(setWhere ? "WHERE " : "AND").append("potencialElectoral=? ");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getLocacion())) {
				parameters.add(entity.getLocacion());
				where.append(setWhere ? "WHERE " : "AND").append("locacion LIKE %?% ");
			}
			
			if (!UtilObject.isNull(entity.getEstadoMesaVotacionCalculado())) {
				parameters.add(entity.getEstadoMesaVotacionCalculado());
				where.append(setWhere ? "WHERE " : "AND").append("estadoMesaVotacionCalculado LIKE %?% ");
			}
		}
		return where.toString();
	}

	@Override
	protected final String prepareOrderBy() {
		return "ORDER BY numeroMesa ASC";
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las Mesas de Votacion";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Mesa Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<MesaVotacionEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<MesaVotacionEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new MesaVotacionEntity(resultSet.getObject("identificador", UUID.class), resultSet.getString("numeroMesa"), resultSet.getString("potencialElectoral"),resultSet.getObject("locacion", LocacionEntity.class), resultSet.getObject("estadoMesaVotacionCalculado", EstadoMesaVotacionCalculadoEntity.class));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de las mesas de votacion";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información de la Mesa Votacion";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase MesaVotacionPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}
	
	

}
