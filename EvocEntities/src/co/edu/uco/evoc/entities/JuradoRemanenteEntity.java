package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;


public final class JuradoRemanenteEntity extends PersonaEntity {
	
	private static final JuradoRemanenteEntity DEFAULT_OBJECT = new JuradoRemanenteEntity();
	private String telefono;
	private String correo;
	private MesaVotacionEntity mesaVotacion;
	
	private JuradoRemanenteEntity() {
		super();
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(MesaVotacionEntity.getDefaultObject());
	}
	
	public JuradoRemanenteEntity(final UUID identificador, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final String telefono, final String correo, final MesaVotacionEntity mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public static JuradoRemanenteEntity getDefaultObject() {
		return DEFAULT_OBJECT;
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
	public final MesaVotacionEntity getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionEntity.getDefaultObject());
	}
	

}