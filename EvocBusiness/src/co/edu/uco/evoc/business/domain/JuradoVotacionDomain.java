package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class JuradoVotacionDomain extends PersonaDomain {
	
	private static final JuradoVotacionDomain DEFAUTL_OBJECT = new JuradoVotacionDomain();
	private String telefono;
	private String correo;
	private MesaVotacionDomain mesaVotacion;
	
	private JuradoVotacionDomain() {
		super();
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(MesaVotacionDomain.getDefaultObject());
	}
	
	public JuradoVotacionDomain(final UUID identificador, final TipoIdentificacionDomain tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final String telefono, final String correo, final MesaVotacionDomain mesaVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTelefono(telefono);
		setCorreo(correo);
		setMesaVotacion(mesaVotacion);
	}
	
	public static JuradoVotacionDomain getDefaultObject() {
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
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionDomain.getDefaultObject());
	}
	

}
