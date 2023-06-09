package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilCorreo;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilTelefono;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;


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
	
	public static JuradoRemanenteEntity createWithIdentificador( UUID identificador) {
		return new JuradoRemanenteEntity(identificador, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoRemanenteEntity createWithTipoIdentificacion( TipoIdentificacionEntity tipoidentificacion) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, tipoidentificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoRemanenteEntity createWithIdentificacion( String identificacion) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), identificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoRemanenteEntity createWithNombre( String nombre) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), nombre, UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoRemanenteEntity createWithApellido( String apellido) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), apellido,UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoRemanenteEntity createWithTelefono(final String telefono) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),telefono, UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoRemanenteEntity createWithCorreo(final String correo) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO, correo, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoRemanenteEntity createWithmesaVotacion(final MesaVotacionEntity mesaVotacion) {
		return new JuradoRemanenteEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO, mesaVotacion);
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