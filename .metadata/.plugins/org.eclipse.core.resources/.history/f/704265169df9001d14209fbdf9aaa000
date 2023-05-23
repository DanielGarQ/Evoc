package co.edu.uco.evoc.business.domain;

import java.util.Date;
import java.util.UUID;

public class RegistradorDomain extends PersonaDomain {
	
	private TipoRegistradorDomain tipoRegistrador;
	private RegistraduriaDomain registraduria;
	private String telefono;
	private String correo;
	private Date fechaInicialCargo;
	private Date fechaFinalCargo;
	private EstadoRegistradorDomain estadoRegistrador;
	
	public RegistradorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido,TipoRegistradorDomain tipoRegistrador, RegistraduriaDomain registraduria, String telefono,
			String correo, Date fechaInicialCargo, Date fechaFinalCargo, EstadoRegistradorDomain estadoRegistrador) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoRegistrador(tipoRegistrador);
		setRegistraduria(registraduria);
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(estadoRegistrador);
	}
	public final TipoRegistradorDomain getTipoRegistrador() {
		return tipoRegistrador;
	}
	private final void setTipoRegistrador(final TipoRegistradorDomain tipoRegistrador) {
		this.tipoRegistrador = tipoRegistrador;
	}
	public final RegistraduriaDomain getRegistraduria() {
		return registraduria;
	}
	private final void setRegistraduria(final RegistraduriaDomain registraduria) {
		this.registraduria = registraduria;
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
	public final Date getFechaInicialCargo() {
		return fechaInicialCargo;
	}
	private final void setFechaInicialCargo(final Date fechaInicialCargo) {
		this.fechaInicialCargo = fechaInicialCargo;
	}
	public final Date getFechaFinalCargo() {
		return fechaFinalCargo;
	}
	private final void setFechaFinalCargo(final Date fechaFinalCargo) {
		this.fechaFinalCargo = fechaFinalCargo;
	}
	public final EstadoRegistradorDomain getEstadoRegistrador() {
		return estadoRegistrador;
	}
	private final void setEstadoRegistrador(final EstadoRegistradorDomain estadoRegistrador) {
		this.estadoRegistrador = estadoRegistrador;
	}

}

