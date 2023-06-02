package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public class RegistradorDomain extends PersonaDomain {
	
	private static final RegistradorDomain DEFAULT_OBJECT = new RegistradorDomain();
	private TipoRegistradorDomain tipoRegistrador;
	private RegistraduriaDomain registraduria;
	private String telefono;
	private String correo;
	private String fechaInicialCargo;
	private String fechaFinalCargo;
	private EstadoRegistradorDomain estadoRegistrador;
	
	private RegistradorDomain() {
		super();
		setTipoRegistrador(TipoRegistradorDomain.getDefaultObject());
		setRegistraduria(RegistraduriaDomain.getDefaultObject());
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(EstadoRegistradorDomain.getdefaultObject());
	}
	
	public RegistradorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido,TipoRegistradorDomain tipoRegistrador, RegistraduriaDomain registraduria, String telefono,
			String correo, String fechaInicialCargo, String fechaFinalCargo, EstadoRegistradorDomain estadoRegistrador) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoRegistrador(tipoRegistrador);
		setRegistraduria(registraduria);
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(estadoRegistrador);
	}
	
	public static RegistradorDomain getDefaultobject() {
		return DEFAULT_OBJECT;
	}
	
	public final TipoRegistradorDomain getTipoRegistrador() {
		return tipoRegistrador;
	}
	private final void setTipoRegistrador(final TipoRegistradorDomain tipoRegistrador) {
		this.tipoRegistrador = UtilObject.getDefault(tipoRegistrador, TipoRegistradorDomain.getDefaultObject());
	}
	public final RegistraduriaDomain getRegistraduria() {
		return registraduria;
	}
	private final void setRegistraduria(final RegistraduriaDomain registraduria) {
		this.registraduria = UtilObject.getDefault(registraduria, RegistraduriaDomain.getDefaultObject());
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
	public final String getFechaInicialCargo() {
		return fechaInicialCargo;
	}
	private final void setFechaInicialCargo(final String fechaInicialCargo) {
		this.fechaInicialCargo = fechaInicialCargo;
	}
	public final String getFechaFinalCargo() {
		return fechaFinalCargo;
	}
	private final void setFechaFinalCargo(final String fechaFinalCargo) {
		this.fechaFinalCargo = fechaFinalCargo;
	}
	public final EstadoRegistradorDomain getEstadoRegistrador() {
		return estadoRegistrador;
	}
	private final void setEstadoRegistrador(final EstadoRegistradorDomain estadoRegistrador) {
		this.estadoRegistrador = UtilObject.getDefault(estadoRegistrador, EstadoRegistradorDomain.getdefaultObject());
	}

}

