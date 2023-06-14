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
import co.edu.uco.evoc.data.dao.VotanteRegistradoDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.CartonesPorMesaEntity;
import co.edu.uco.evoc.entities.MesaVotacionEntity;
import co.edu.uco.evoc.entities.TipoIdentificacionEntity;
import co.edu.uco.evoc.entities.VotanteRegistradoEntity;

public final class VotanteRegistradoPostgreSqlDAO extends SqlDAO<VotanteRegistradoEntity> implements VotanteRegistradoDAO{
	
	public VotanteRegistradoPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final VotanteRegistradoEntity entity) {
		
		var sqlStatement = "INSERT INTO VotanteRegistrado(identificador, tipoIdentificacion, identificacion, nombre, apellido, mesaVotacion, fechaExpedicionIdentificacion, validacionDactilar, cartonVotacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			preparedStatement.setObject(6, entity.getMesaVotacion());
			preparedStatement.setObject(7, entity.getFechaExpedicionIdentificacion());
			preparedStatement.setObject(8, entity.isValidacionDactilar());
			preparedStatement.setObject(9, entity.getCartonVotacion());
			
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo Votante Registrado";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo Votante Registrado";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase VotanteRegistradoPOstgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<VotanteRegistradoEntity> read(final VotanteRegistradoEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información del Votante Registrado deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Votante Registrado deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final VotanteRegistradoEntity entity) {
		
		var sqlStatement = "UPDATE VotanteRegistrado SET tipoIdentificacion= ?, identificacion= ?, nombre= ?, apellido= ?, mesaVotacion= ?, fechaExpedicionIdentificacion= ?, validacionDactilar= ?, cartonVotacion= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getTipoIdentificacion());
			preparedStatement.setObject(3, entity.getIdentificacion());
			preparedStatement.setObject(4, entity.getNombre());
			preparedStatement.setObject(5, entity.getApellido());
			preparedStatement.setObject(6, entity.getMesaVotacion());
			preparedStatement.setObject(7, entity.getFechaExpedicionIdentificacion());
			preparedStatement.setObject(8, entity.isValidacionDactilar());
			preparedStatement.setObject(9, entity.getCartonVotacion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del Votante Registrado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del Votante Registrado...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final VotanteRegistradoEntity entity) {
		var sqlStatement = "DELETE FROM VotanteRegistrado WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del Votante Registrado";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del Votante Registrado deseado";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, tipoIdentificacion, identificacion, nombre, apellido, mesaVotacion, fechaExpedicionIdentificacion, validacionDactilar, cartonVotacion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM VotanteRegistrado";
	}

	@Override
	protected final String prepareWhere(VotanteRegistradoEntity entity, List<Object> parameters) {
		
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
				where.append("WHERE identificador=?");
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
			
			if (!UtilObject.isNull(entity.getMesaVotacion())) {
				parameters.add(entity.getMesaVotacion());
				where.append("WHERE mesaVotacion=?");
				setWhere = false;
			}
			
			if (!UtilText.getUtilText().isEmpty(entity.getFechaExpedicionIdentificacion())) {
				parameters.add(entity.getFechaExpedicionIdentificacion());
				where.append(setWhere ? "WHERE " : "AND").append("fechaExpedicionIdentificacion=? ");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los votantes Registrados";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Votante Registrado";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<VotanteRegistradoEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<VotanteRegistradoEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new VotanteRegistradoEntity(resultSet.getObject("identificador", UUID.class),resultSet.getObject("tipoIdentificacion", TipoIdentificacionEntity.class), resultSet.getString("identificacion") ,resultSet.getString("nombre"),resultSet.getString("apellido"), resultSet.getObject("mesaVotacion", MesaVotacionEntity.class), resultSet.getString("fechaExpedicionIdentificacion"), resultSet.getBoolean(null), resultSet.getObject("cartonVotacion", CartonesPorMesaEntity.class));
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Votantes Registrados";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Votante Registrado";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase VotanteRegistradoPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
