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
	
	public JuradoRemanenteDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String identificacion,
			String nombre, String apellido, String telefono, String correo, MesaVotacionDTO mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	public final String getTelefono() {
		return telefono;
	}
	public final void setTelefono(final String telefono) {
		this.telefono = telefono;
	}
	public final String getCorreo() {
		return correo;
	}
	public final void setCorreo(final String correo) {
		this.correo = correo;
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	

}
