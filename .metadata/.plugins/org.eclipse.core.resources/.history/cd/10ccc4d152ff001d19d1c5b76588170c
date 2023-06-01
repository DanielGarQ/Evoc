package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class JuradoVotacionEntity extends PersonaEntity {
	
	private static final JuradoVotacionEntity DEFAUTL_OBJECT = new JuradoVotacionEntity();
	private String telefono;
	private String correo;
	private MesaVotacionEntity mesaVotacion;
	
	private JuradoVotacionEntity() {
		super();
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(MesaVotacionEntity.getDefaultObject());
	}
	
	public JuradoVotacionEntity(final UUID identificador, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final String telefono, final String correo, final MesaVotacionEntity mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public static JuradoVotacionEntity getDefaultObject() {
		return DEFAUTL_OBJECT;
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
