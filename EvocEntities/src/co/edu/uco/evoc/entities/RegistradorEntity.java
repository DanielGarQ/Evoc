package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;

public class RegistradorEntity extends PersonaEntity {
	
	private TipoRegistradorEntity tipoRegistrador;
	private RegistraduriaEntity registraduria;
	private String telefono;
	private String correo;
	private Date fechaInicialCargo;
	private Date fechaFinalCargo;
	private EstadoRegistradorEntity estadoRegistrador;
	
	public RegistradorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido,TipoRegistradorEntity tipoRegistrador, RegistraduriaEntity registraduria, String telefono,
			String correo, Date fechaInicialCargo, Date fechaFinalCargo, EstadoRegistradorEntity estadoRegistrador) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoRegistrador(tipoRegistrador);
		setRegistraduria(registraduria);
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(estadoRegistrador);
	}
	public final TipoRegistradorEntity getTipoRegistrador() {
		return tipoRegistrador;
	}
	private final void setTipoRegistrador(final TipoRegistradorEntity tipoRegistrador) {
		this.tipoRegistrador = tipoRegistrador;
	}
	public final RegistraduriaEntity getRegistraduria() {
		return registraduria;
	}
	private final void setRegistraduria(final RegistraduriaEntity registraduria) {
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
	public final EstadoRegistradorEntity getEstadoRegistrador() {
		return estadoRegistrador;
	}
	private final void setEstadoRegistrador(final EstadoRegistradorEntity estadoRegistrador) {
		this.estadoRegistrador = estadoRegistrador;
	}

}
