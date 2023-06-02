package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class RegistradorDTO extends PersonaDTO {
	
	private TipoRegistradorDTO tipoRegistrador;
	private RegistraduriaDTO registraduria;
	private String telefono;
	private String correo;
	private String fechaInicialCargo;
	private String fechaFinalCargo;
	private EstadoRegistradorDTO estadoRegistrador;
	
	public RegistradorDTO() {
		super();
		setTipoRegistrador(TipoRegistradorDTO.create());
		setRegistraduria(RegistraduriaDTO.create());
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(EstadoRegistradorDTO.create());
	}
	
	public RegistradorDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido,final TipoRegistradorDTO tipoRegistrador,final RegistraduriaDTO registraduria, String telefono,
			final String correo,final String fechaInicialCargo,final String fechaFinalCargo,final EstadoRegistradorDTO estadoRegistrador) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoRegistrador(tipoRegistrador);
		setRegistraduria(registraduria);
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(estadoRegistrador);
	}
	
	public static RegistradorDTO create() {
		return new RegistradorDTO();
	}
	
	public final TipoRegistradorDTO getTipoRegistrador() {
		return tipoRegistrador;
	}
	public final RegistradorDTO setTipoRegistrador(final TipoRegistradorDTO tipoRegistrador) {
		this.tipoRegistrador = UtilObject.getDefault(tipoRegistrador, TipoRegistradorDTO.create());
		return this;
	}
	public final RegistraduriaDTO getRegistraduria() {
		return registraduria;
	}
	public final RegistradorDTO setRegistraduria(final RegistraduriaDTO registraduria) {
		this.registraduria = UtilObject.getDefault(registraduria, RegistraduriaDTO.create());
		return this;
	}
	public final String getTelefono() {
		return telefono;
	}
	public final RegistradorDTO setTelefono(final String telefono) {
		this.telefono = telefono;
		return this;
	}
	public final String getCorreo() {
		return correo;
	}
	public final RegistradorDTO setCorreo(final String correo) {
		this.correo = correo;
		return this;
	}
	public final String getFechaInicialCargo() {
		return fechaInicialCargo;
	}
	public final RegistradorDTO setFechaInicialCargo(final String fechaInicialCargo) {
		this.fechaInicialCargo = fechaInicialCargo;
		return  this;
	}
	public final String getFechaFinalCargo() {
		return fechaFinalCargo;
	}
	public final RegistradorDTO setFechaFinalCargo(final String fechaFinalCargo) {
		this.fechaFinalCargo = fechaFinalCargo;
		return this;
	}
	public final EstadoRegistradorDTO getEstadoRegistrador() {
		return estadoRegistrador;
	}
	public final RegistradorDTO setEstadoRegistrador(final EstadoRegistradorDTO estadoRegistrador) {
		this.estadoRegistrador = UtilObject.getDefault(estadoRegistrador, EstadoRegistradorDTO.create());
		return this;
	}
	
	

}
