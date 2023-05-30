package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public class RegistradorEntity extends PersonaEntity {
	
	private static final RegistradorEntity DEFAULT_OBJECT = new RegistradorEntity();
	private TipoRegistradorEntity tipoRegistrador;
	private RegistraduriaEntity registraduria;
	private String telefono;
	private String correo;
	private Date fechaInicialCargo;
	private Date fechaFinalCargo;
	private EstadoRegistradorEntity estadoRegistrador;
	
	private RegistradorEntity() {
		super();
		setTipoRegistrador(TipoRegistradorEntity.getDefaultObject());
		setRegistraduria(RegistraduriaEntity.getDefaultObject());
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(EstadoRegistradorEntity.getdefaultObject());
	}
	
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
	
	public static RegistradorEntity getDefaultobject() {
		return DEFAULT_OBJECT;
	}
	
	public final TipoRegistradorEntity getTipoRegistrador() {
		return tipoRegistrador;
	}
	private final void setTipoRegistrador(final TipoRegistradorEntity tipoRegistrador) {
		this.tipoRegistrador = UtilObject.getDefault(tipoRegistrador, TipoRegistradorEntity.getDefaultObject());
	}
	public final RegistraduriaEntity getRegistraduria() {
		return registraduria;
	}
	private final void setRegistraduria(final RegistraduriaEntity registraduria) {
		this.registraduria = UtilObject.getDefault(registraduria, RegistraduriaEntity.getDefaultObject());
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
		this.estadoRegistrador = UtilObject.getDefault(estadoRegistrador, EstadoRegistradorEntity.getdefaultObject());
	}

}
