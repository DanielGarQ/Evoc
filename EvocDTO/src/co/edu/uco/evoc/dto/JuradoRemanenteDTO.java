package co.edu.uco.evoc.dto;

import java.util.UUID;

public class JuradoRemanenteDTO extends PersonaDTO {
	
	private String telefono;
	private String correo;
	private MesaVotacionDTO mesaVotacion;
	
	public JuradoRemanenteDTO() {
		super();
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public JuradoRemanenteDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final String telefono, final String correo, final MesaVotacionDTO mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public static JuradoRemanenteDTO create() {
		return new JuradoRemanenteDTO();
	}
	
	public final String getTelefono() {
		return telefono;
	}
	public final JuradoRemanenteDTO setTelefono(final String telefono) {
		this.telefono = telefono;
		return this;
	}
	public final String getCorreo() {
		return correo;
	}
	public final JuradoRemanenteDTO setCorreo(final String correo) {
		this.correo = correo;
		return this;
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final JuradoRemanenteDTO setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
		return this;
	}

}
