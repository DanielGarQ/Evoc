package co.edu.uco.evoc.data.dao.factory;

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

}
