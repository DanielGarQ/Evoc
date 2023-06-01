package co.edu.uco.evoc.data.dao.factory;

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
import co.edu.uco.evoc.data.dao.factory.relational.postgresql.PostgreSqlDAOFactory;

public abstract class DAOFactory {
	
	public static DAOFactory getFactory(final Factory factory) {

		DAOFactory daoFactory;

		switch (factory) {

		case POSTGRESQL: {

			daoFactory = new PostgreSqlDAOFactory();
			break;
		}
		default:
			throw new IllegalArgumentException("Not implemented yet!");
		}
		return daoFactory;
	}
	
	protected abstract void abrirConexion();

	public abstract void cerrarConexion();

	public abstract void iniciarTransaccion();

	public abstract void confirmarTransaccion();

	public abstract void cancelarTransaccion();
	
	public abstract CandidatoDAO getCandidatoDAO();
	
	public abstract CartonesPorMesaDAO getCartonesPorMesaDAO();
	
	public abstract CartonVotacionDAO getCartonVotacionDAO();
	
	public abstract EleccionDAO getEleccionDAO();
	
	public abstract EstadoEleccionDAO getEstadoEleccionDAO();
	
	public abstract EstadoMesaVotacionCalculadoDAO getEstadoMesaVotacionCalculadoDAO();
	
	public abstract EstadoRegistradorDAO getEstadoRegistradorDAO();
	
	public abstract JuradoVotacionDAO getJuradoVotacionDAO();
	
	public abstract JuradoRemanenteDAO getJuradoRemanenteDAO();
	
	public abstract LocacionDAO getLocacionDAO();
	
	public abstract MesaVotacionDAO getMesaVotacionDAO();
	
	public abstract NivelTipoEleccionDAO getNivelTipoEleccionDAO();
	
	public abstract PartidoDAO getPartidoDAO();
	
	public abstract PersonaDAO getPersonaDAO();
	
	public abstract RegistradorDAO getRegistradorDAO();
	
	public abstract RegistraduriaDAO getRegistraduriaDAO();
	
	public abstract TipoCandidatoDAO getTipoCandidato();
	
	public abstract TipoEleccionDAO getTipoEleccionDAO();
	
	public abstract TipoIdentificacionDAO getTipoIdentificacionDAO();
	
	public abstract TipoRegistradorDAO getTipoRegistradorDAO();
	
	public abstract VotanteRegistradoDAO getVotanteRegistradoDAO();
	
	public abstract ZonaDAO getZonaDAO();

}
