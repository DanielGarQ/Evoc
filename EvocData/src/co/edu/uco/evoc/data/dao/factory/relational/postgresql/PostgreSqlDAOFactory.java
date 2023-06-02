package co.edu.uco.evoc.data.dao.factory.relational.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.data.dao.NivelTipoEleccionDAO;
import co.edu.uco.evoc.data.dao.PartidoDAO;
import co.edu.uco.evoc.data.dao.RegistraduriaDAO;
import co.edu.uco.evoc.data.dao.TipoCandidatoDAO;
import co.edu.uco.evoc.data.dao.TipoIdentificacionDAO;
import co.edu.uco.evoc.data.dao.TipoRegistradorDAO;
import co.edu.uco.evoc.data.dao.ZonaDAO;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.relational.postgresql.NivelTipoEleccionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.PartidoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.RegistraduriaPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoCandidatoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoIdentificacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoRegistradorPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.ZonaPostgreSqlDAO;

public final class PostgreSqlDAOFactory extends DAOFactory{
	
	private static final String URL_BASE_DE_DATOS = "jdbc:postgresql://localhost:5432/bd_evoc";
	private static final String USUARIO_BASE_DE_DATOS = "postgresql";
	private static final String CLAVE_BASE_DE_DATOS = "DANIEL22001058";
	private Connection conexion;

	
	public PostgreSqlDAOFactory() {
		abrirConexion();
	}

	@Override
	protected final void abrirConexion() {
		try {
			
			conexion = DriverManager.getConnection(URL_BASE_DE_DATOS,USUARIO_BASE_DE_DATOS, CLAVE_BASE_DE_DATOS );
			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		
	}

	@Override
	public final void cerrarConexion() {
		try {
			
			if (!UtilObject.isNull(conexion) && !conexion.isClosed()) {
				
				conexion.close();
			}
			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		
	}

	@Override
	public final void iniciarTransaccion() {
		try {
			
			if (!UtilObject.isNull(conexion) && conexion.getAutoCommit()) {
				
				conexion.setAutoCommit(false);
				
			}
			

			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		
	}

	@Override
	public final void confirmarTransaccion() {
		try {
			
			if (!UtilObject.isNull(conexion) && !conexion.getAutoCommit()) {
				
				conexion.commit();
				conexion.setAutoCommit(true);
				
			}
			
			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		
	}

	@Override
	public final void cancelarTransaccion() {
		try {
			
			if (!UtilObject.isNull(conexion) && !conexion.getAutoCommit()) {
				
				conexion.rollback();
				conexion.setAutoCommit(true);
				
			}
			
			
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
		
	}
	
	@Override
	public ZonaDAO getZonaDAO() {
		return new ZonaPostgreSqlDAO(conexion);
	}
	
	@Override
	public TipoRegistradorDAO getTipoRegistradorDAO() {
		return new TipoRegistradorPostgreSqlDAO(conexion);
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return new TipoIdentificacionPostgreSqlDAO(conexion);
	}
	
	@Override
	public TipoCandidatoDAO getTipoCandidatoDAO() {
		return new TipoCandidatoPostgreSqlDAO(conexion);
	}
	
	@Override
	public PartidoDAO getPartidoDAO() {
		return new PartidoPostgreSqlDAO(conexion);
	}
	
	@Override
	public RegistraduriaDAO getRegistraduriaDAO() {
		return new RegistraduriaPostgreSqlDAO(conexion);
	}
	
	public NivelTipoEleccionDAO getNivelTipoEleccionDAO() {
		return new NivelTipoEleccionPostgreSqlDAO(conexion);
	}


}
