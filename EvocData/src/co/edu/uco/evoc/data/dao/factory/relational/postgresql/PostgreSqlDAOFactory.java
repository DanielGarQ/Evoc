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

public final class PostgreSqlDAOFactory extends DAOFactory{
	
	private static final String URL_BASE_DE_DATOS = "jdbc:postgresql://localhost:5432/nombrebasedatos";
	private static final String USUARIO_BASE_DE_DATOS = "postgresql";
	private static final String CLAVE_BASE_DE_DATOS = "contraseñabd";
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
	public CandidatoDAO getCandidatoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartonesPorMesaDAO getCartonesPorMesaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartonVotacionDAO getCartonVotacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EleccionDAO getEleccionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoEleccionDAO getEstadoEleccionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoMesaVotacionCalculadoDAO getEstadoMesaVotacionCalculadoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EstadoRegistradorDAO getEstadoRegistradorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JuradoVotacionDAO getJuradoVotacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JuradoRemanenteDAO getJuradoRemanenteDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocacionDAO getLocacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MesaVotacionDAO getMesaVotacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NivelTipoEleccionDAO getNivelTipoEleccionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PartidoDAO getPartidoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PersonaDAO getPersonaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistradorDAO getRegistradorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegistraduriaDAO getRegistraduriaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoCandidatoDAO getTipoCandidato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoEleccionDAO getTipoEleccionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionDAO getTipoIdentificacionDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoRegistradorDAO getTipoRegistradorDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VotanteRegistradoDAO getVotanteRegistradoDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZonaDAO getZonaDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
