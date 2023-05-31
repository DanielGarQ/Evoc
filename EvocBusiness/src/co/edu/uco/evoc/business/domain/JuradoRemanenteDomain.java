package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public final class JuradoRemanenteDomain extends PersonaDomain {
	
	private String telefono;
	private String correo;
	private MesaVotacionDomain mesaVotacion;
	
	public JuradoRemanenteDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido, String telefono, String correo, MesaVotacionDomain mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	public final String getTelefono() {
		return telefono;
	}
	private final void setTelefono(final String telefono) {
		this.telefono = telefono;
	}
	public final String getCorreo() {
		return correo;
	}
	private final void setCorreo(final String correo) {
		this.correo = correo;
	}
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	

}