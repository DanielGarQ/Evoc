package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilCorreo;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilTelefono;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

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
	
	public static JuradoVotacionEntity createWithIdentificador( UUID identificador) {
		return new JuradoVotacionEntity(identificador, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoVotacionEntity createWithTipoIdentificacion( TipoIdentificacionEntity tipoidentificacion) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, tipoidentificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoVotacionEntity createWithIdentificacion( String identificacion) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), identificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoVotacionEntity createWithNombre( String nombre) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), nombre, UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static JuradoVotacionEntity createWithApellido( String apellido) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), apellido,UtilTelefono.DEFAULT_TELEFONO ,UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoVotacionEntity createWithTelefono(final String telefono) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),telefono, UtilCorreo.DEFAULT_CORREO, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoVotacionEntity createWithCorreo(final String correo) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO, correo, MesaVotacionEntity.getDefaultObject());
	}
	
	public static final  JuradoVotacionEntity createWithMesaVOtacion(final MesaVotacionEntity mesaVotacion) {
		return new JuradoVotacionEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO, mesaVotacion);
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
