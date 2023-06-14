package co.edu.uco.evoc.data.dao.factory.relational.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.data.dao.CandidatoDAO;
import co.edu.uco.evoc.data.dao.CartonVotacionDAO;
import co.edu.uco.evoc.data.dao.CartonesPorMesaDAO;
import co.edu.uco.evoc.data.dao.EleccionDAO;
import co.edu.uco.evoc.data.dao.EstadoEleccionDAO;
import co.edu.uco.evoc.data.dao.EstadoMesaVotacionCalculadoDAO;
import co.edu.uco.evoc.data.dao.EstadoRegistradorDAO;
import co.edu.uco.evoc.data.dao.JuradoRemanenteDAO;
import co.edu.uco.evoc.data.dao.JuradoVotacionDAO;
import co.edu.uco.evoc.data.dao.LocacionDAO;
import co.edu.uco.evoc.data.dao.MesaVotacionDAO;
import co.edu.uco.evoc.data.dao.NivelTipoEleccionDAO;
import co.edu.uco.evoc.data.dao.PartidoDAO;
import co.edu.uco.evoc.data.dao.PersonaDAO;
import co.edu.uco.evoc.data.dao.RegistradorDAO;
import co.edu.uco.evoc.data.dao.RegistraduriaDAO;
import co.edu.uco.evoc.data.dao.TipoCandidatoDAO;
import co.edu.uco.evoc.data.dao.TipoEleccionDAO;
import co.edu.uco.evoc.data.dao.TipoIdentificacionDAO;
import co.edu.uco.evoc.data.dao.TipoRegistradorDAO;
import co.edu.uco.evoc.data.dao.VotanteRegistradoDAO;
import co.edu.uco.evoc.data.dao.ZonaDAO;
import co.edu.uco.evoc.data.dao.factory.DAOFactory;
import co.edu.uco.evoc.data.dao.relational.postgresql.CandidatoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.CartonVotacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.CartonesPorMesaPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.EleccionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.EstadoEleccionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.EstadoMesaVotacionCalculadoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.EstadoRegistradorPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.JuradoRemanentePostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.JuradoVotacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.LocacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.MesaVotacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.NivelTipoEleccionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.PartidoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.PersonaPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.RegistradorPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.RegistraduriaPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoCandidatoPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoEleccionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoIdentificacionPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.TipoRegistradorPostgreSqlDAO;
import co.edu.uco.evoc.data.dao.relational.postgresql.VotanteRegistradoPostgreSqlDAO;
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
	
	public EstadoMesaVotacionCalculadoDAO getEstadoMesaVotacionCalculadoDAO() {
		return new EstadoMesaVotacionCalculadoPostgreSqlDAO(conexion);
	
	}
	
	public EstadoEleccionDAO getEstadoEleccionDAO() {
		return new EstadoEleccionPostgreSqlDAO(conexion);
	
	}
	
	public EstadoRegistradorDAO getEstadoRegistradorDAO() {
		return new EstadoRegistradorPostgreSqlDAO(conexion);
	
	}
	
	public TipoEleccionDAO getTipoEleccionDAO() {
		return new TipoEleccionPostgreSqlDAO(conexion);
	
	}
	
	public PersonaDAO getPersonaDAO() {
		return new PersonaPostgreSqlDAO(conexion);
	
	}

	public RegistradorDAO getRegistradorDAO() {
		return new RegistradorPostgreSqlDAO(conexion);
	}
	
	public LocacionDAO getLocacionDAO() {
		return new LocacionPostgreSqlDAO(conexion);
	}
	
	public MesaVotacionDAO getMesaVotacionDAO() {
		return new MesaVotacionPostgreSqlDAO(conexion);
	}
	
	public CandidatoDAO getCandidatoDAO() {
		return new CandidatoPostgreSqlDAO(conexion);
	}
	
	public VotanteRegistradoDAO getVotanteRegistradoDAO() {
		return new VotanteRegistradoPostgreSqlDAO(conexion);
	}
	
	public JuradoRemanenteDAO getJuradoRemanenteDAO() {
		return new JuradoRemanentePostgreSqlDAO(conexion);
	}
	
	public JuradoVotacionDAO getJuradoVotacionDAO() {
		return new JuradoVotacionPostgreSqlDAO(conexion);
	}
	
	public EleccionDAO getEleccionDAO() {
		return new EleccionPostgreSqlDAO(conexion);
	}
	
	public CartonVotacionDAO getCartonVotacionDAO() {
		return new CartonVotacionPostgreSqlDAO(conexion);
	}
	
	public CartonesPorMesaDAO getCartonesPorMesaDAO() {
		return new CartonesPorMesaPostgreSqlDAO(conexion);
	}


}
