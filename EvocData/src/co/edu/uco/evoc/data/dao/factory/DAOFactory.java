package co.edu.uco.evoc.data.dao.factory;

import co.edu.uco.evoc.data.dao.NivelTipoEleccionDAO;
import co.edu.uco.evoc.data.dao.PartidoDAO;
import co.edu.uco.evoc.data.dao.RegistraduriaDAO;
import co.edu.uco.evoc.data.dao.TipoCandidatoDAO;
import co.edu.uco.evoc.data.dao.TipoIdentificacionDAO;
import co.edu.uco.evoc.data.dao.TipoRegistradorDAO;
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
	
	public abstract ZonaDAO getZonaDAO();
	
	public abstract TipoRegistradorDAO getTipoRegistradorDAO();
	
	public abstract TipoIdentificacionDAO getTipoIdentificacionDAO();
	
	public abstract TipoCandidatoDAO getTipoCandidatoDAO();
	
	public abstract PartidoDAO getPartidoDAO();
	
	public abstract RegistraduriaDAO getRegistraduriaDAO();
	
	public abstract NivelTipoEleccionDAO getNivelTipoEleccionDAO();

}
