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
import co.edu.uco.evoc.data.dao.CartonesPorMesaDAO;
import co.edu.uco.evoc.data.dao.relational.SqlDAO;
import co.edu.uco.evoc.entities.CartonVotacionEntity;
import co.edu.uco.evoc.entities.CartonesPorMesaEntity;
import co.edu.uco.evoc.entities.MesaVotacionEntity;
import co.edu.uco.evoc.entities.VotanteRegistradoEntity;

public final class CartonesPorMesaPostgreSqlDAO extends SqlDAO<CartonesPorMesaEntity> implements CartonesPorMesaDAO{
	
	public CartonesPorMesaPostgreSqlDAO(final Connection connection) {
		super(connection);
	}

	@Override
	public final void create(final CartonesPorMesaEntity entity) {
		
		var sqlStatement = "INSERT INTO CartonesPorMesa(identificacor, mesaVotacion, cartonVotacion, votante, marcacion) VALUES (?, ?, ?, ?, ?)";
				
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getMesaVotacion());
			preparedStatement.setObject(3, entity.getCartonVotacion());
			preparedStatement.setObject(4, entity.getVotante());
			preparedStatement.setObject(5, entity.isMarcacion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de registrar la información del nuevo Cartones Por Mesa";
			var technicalMessage = "se ha presentado un problema de  tipo SQLException  dentro del metodo create de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de registrar la información del nuevo Cartones Por Mesa";
			var technicalMessage = "se ha presentado un problema inesperado dentro del metodo create de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final List<CartonesPorMesaEntity> read(final CartonesPorMesaEntity entity) {
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información del CartonesPorMesa deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo read de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		} catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del CartonesPorMesa deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo read de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
	}

	@Override
	public final void update(final CartonesPorMesaEntity entity) {
		
		var sqlStatement = "UPDATE CartonesPorMesa SET mesaVotacion= ?, cartonVotacion= ?, votante= ?, marcacion= ? WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			preparedStatement.setObject(2, entity.getMesaVotacion());
			preparedStatement.setObject(3, entity.getCartonVotacion());
			preparedStatement.setObject(4, entity.getVotante());
			preparedStatement.setObject(5, entity.isMarcacion());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de modificar la información del CartonesPorMesa deseado...";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo update de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de modificar la información del CartonesPorMesa deseado...";
			var technicalMessage = "Un problema inesperado dentro del metodo update de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	public final void delete(final CartonesPorMesaEntity entity) {
		var sqlStatement = "DELETE FROM CartonesPorMesa WHERE identificador=?";
		
		try (var preparedStatement = getConnection().prepareStatement(sqlStatement)){
			
			preparedStatement.setObject(1, entity.getIdentificador());
			
			preparedStatement.executeUpdate();
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando de dar de baja la información del Carton Por Mesa deseaado";
			var technicalMessage = "Un problema de tipo SQLException dentro del metodo create de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando dar de baja la información del Carton Por Mesa";
			var technicalMessage = "Un problema inesperado dentro del metodo create de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}
		
	}

	@Override
	protected final String prepareSelect() {
		return "SELECT identificador, mesaVotacion, cartonVotacion, votante, marcacion";
	}

	@Override
	protected final String prepareFrom() {
		return "FROM CartonesPorMesa";
	}

	@Override
	protected final String prepareWhere(CartonesPorMesaEntity entity, List<Object> parameters) {
		
		final var where = new StringBuilder("");
		parameters = UtilObject.getDefault(parameters, new ArrayList<>());
		var setWhere = true;
		
		
		if(!UtilObject.isNull(entity)) {
			
			if (!UtilUUID.isDefault(entity.getIdentificador())) {
				parameters.add(entity.getIdentificador());
				where.append("WHERE identificador=?");
				setWhere = false;
			}
			
			
			if (!UtilObject.isNull(entity.getMesaVotacion())) {
				parameters.add(entity.getMesaVotacion());
				where.append("WHERE mesaVotacion=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getCartonVotacion())) {
				parameters.add(entity.getCartonVotacion());
				where.append("WHERE cartonVotacion=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.getVotante())) {
				parameters.add(entity.getVotante());
				where.append("WHERE votante=?");
				setWhere = false;
			}
			
			if (!UtilObject.isNull(entity.isMarcacion())) {
				parameters.add(entity.isMarcacion());
				where.append("WHERE marcacion=?");
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
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los cartones por mesa";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Cartones Por Mesa";
			var technicalMessage = "Un problema inesperado dentro del metodo setParameters de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}
	}

	@Override
	protected List<CartonesPorMesaEntity> executeQuery(PreparedStatement preparedStatement) {
		
		final List<CartonesPorMesaEntity> result = new ArrayList<>();
		
		try(var resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				var entityTmp = new CartonesPorMesaEntity(resultSet.getObject("identificador", UUID.class), resultSet.getObject("mesaVotacion", MesaVotacionEntity.class), resultSet.getObject("cartonVotacion", CartonVotacionEntity.class), resultSet.getObject("votante", VotanteRegistradoEntity.class), resultSet.getBoolean(null));
				
				result.add(entityTmp);
			}
			
			return result;
			
		}catch (final SQLException exception) {
			
			var userMessage = "Se ha presentado un problema tratando consultar la información de los Cartones Por Mesa";
			var technicalMessage = "Se ha presentado un  problema de tipo SQLException dentro del metodo setParameters de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
			
		}catch (final Exception exception) {
			
			var userMessage = "Se ha presentado un problema inesperado tratando de consultar la información del Cartones Por Mesa";
			var technicalMessage = "Un problema inesperado dentro del metodo executeQuery de la clase CartonesPorMesaPostgreSqlDAO. Por favor verifique la traza completa del error...";
			
			throw EvocDataException.create(technicalMessage, userMessage, exception);
		}

	}

}
