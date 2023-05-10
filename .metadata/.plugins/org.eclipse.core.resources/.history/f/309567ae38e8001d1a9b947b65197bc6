package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class JuradoVotacionDTO extends PersonaDTO {
	
	private String telefono;
	private String correo;
	private MesaVotacionDTO mesaVotacion;
	
	public JuradoVotacionDTO() {
		super();
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	public JuradoVotacionDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final String telefono, final String correo, final MesaVotacionDTO mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public static JuradoVotacionDTO create() {
		return new JuradoVotacionDTO();
	}
	
	public final String getTelefono() {
		return telefono;
	}
	public final JuradoVotacionDTO setTelefono(final String telefono) {
		this.telefono = telefono;
		return this;
	}
	public final String getCorreo() {
		return correo;
	}
	public final JuradoVotacionDTO setCorreo(final String correo) {
		this.correo = correo;
		return this;
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final JuradoVotacionDTO setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
		return this;
	}

}
