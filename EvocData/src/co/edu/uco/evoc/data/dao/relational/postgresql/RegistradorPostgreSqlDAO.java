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
import co.edu.uco.evoc.data.dao.RegistradorDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.EstadoRegistradorEntity;
import co.edu.uco.evoc.entities.RegistradorEntity;
import co.edu.uco.evoc.entities.RegistraduriaEntity;
import co.edu.uco.evoc.entities.TipoIdentificacionEntity;
import co.edu.uco.evoc.entities.TipoRegistradorEntity;

public final class RegistradorPostgreSqlDAO extends SqlDAO<RegistradorEntity> implements RegistradorDAO{
	
	public RegistradorPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final RegistradorEntity entity) {
		
		var sqlStatement = "INSERT INTO Registrador(identificador, tipoIdentificacion, identificacion, nombre, apellido, tipoRegistrador, registraduria, telefono, correo, fechaInicialCargo, fechaFinalCargo, estadoRegistrador) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			preparedStatement.setObject(6, entity.getTipoRegistrador());
			preparedStatement.setObject(7, entity.getRegistraduria());
			preparedStatement.setObject(8, entity.getTelefono());
			preparedStatement.setObject(9, entity.getCorreo());
			preparedStatement.setObject(10, entity.getFechaInicialCargo());
			preparedStatement.setObject(11, entity.getFechaFinalCargo());
			preparedStatement.setObject(12, entity.getEstadoRegistrador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo Registrador";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo Registrador";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<RegistradorEntity> read(final RegistradorEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información del Registrador deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Registrador deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final RegistradorEntity entity) {
		
		var sqlStatement = "UPDATE Registrador SET tipoIdentificacion= ?, identificacion= ?, nombre= ?, apellido= ?, tipoRegistrador= ?, registraduria= ?, telefono= ?, correo= ?, fechaInicialCargo= ?, fechaFinalCargo= ?, estadoRegistrador= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			preparedStatement.setObject(6, entity.getTipoRegistrador());
			preparedStatement.setObject(7, entity.getRegistraduria());
			preparedStatement.setObject(8, entity.getTelefono());
			preparedStatement.setObject(9, entity.getCorreo());
			preparedStatement.setObject(10, entity.getFechaInicialCargo());
			preparedStatement.setObject(11, entity.getFechaFinalCargo());
			preparedStatement.setObject(12, entity.getEstadoRegistrador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del Registrador deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Registrador deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final RegistradorEntity entity) {
		var sqlStatement = "DELETE FROM Registrador WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			preparedStatement.setObject(6, entity.getTipoRegistrador());
			preparedStatement.setObject(7, entity.getRegistraduria());
			preparedStatement.setObject(8, entity.getTelefono());
			preparedStatement.setObject(9, entity.getCorreo());
			preparedStatement.setObject(10, entity.getFechaInicialCargo());
			preparedStatement.setObject(11, entity.getFechaFinalCargo());
			preparedStatement.setObject(12, entity.getEstadoRegistrador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del Registrador";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del Registrador";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, tipoIdentificacion, identificacion, nombre, apellido, tipoRegistrador, registraduria, telefono, correo, fechaInicialCargo, fechaFinalCargo, estadoRegistrador";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM Registrador";
	}

	@Override
	protected final String prepareWhere(RegistradorEntity entity, List<Object> parameters) {
		
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
			
			if (!UtilObject.isNull(entity.getTipoRegistrador())) {
				parameters.add(entity.getTipoRegistrador());
				where.append("WHERE tipoRegistrador=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getRegistraduria())) {
				parameters.add(entity.getRegistraduria());
				where.append("WHERE registraduria=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getTelefono())) {
				parameters.add(entity.getTelefono());
				where.append(setWhere ? "WHERE " : "AND").append("telefono=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getCorreo())) {
				parameters.add(entity.getCorreo());
				where.append(setWhere ? "WHERE " : "AND").append("correo=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getFechaInicialCargo())) {
				parameters.add(entity.getFechaInicialCargo());
				where.append(setWhere ? "WHERE " : "AND").append("fechaInicialCargo=? ");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getFechaFinalCargo())) {
				parameters.add(entity.getFechaFinalCargo());
				where.append(setWhere ? "WHERE " : "AND").append("fechaFinalCargo=? ");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getEstadoRegistrador())) {
				parameters.add(entity.getEstadoRegistrador());
				where.append("WHERE estadoRegistrador=?");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Registradores";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Registrador";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<RegistradorEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<RegistradorEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new RegistradorEntity(resultSet.getObject("identificador", UUID.class),resultSet.getObject("tipoIdentificacion", TipoIdentificacionEntity.class), resultSet.getString("identificacion") ,resultSet.getString("nombre"),resultSet.getString("apellido"),resultSet.getObject("tipoRegistrador", TipoRegistradorEntity.class), resultSet.getObject("registraduria", RegistraduriaEntity.class), resultSet.getString("telefono"),resultSet.getString("correo"),resultSet.getString("fechaInicialCargo"),resultSet.getString("fechaFinalCargo"),resultSet.getObject("estadoRegistrador", EstadoRegistradorEntity.class));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Registradores";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase RegistradorSqlServerDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Registrador";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase RegistradorPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
