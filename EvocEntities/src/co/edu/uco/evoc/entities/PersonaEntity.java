package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class PersonaEntity {
	
	protected UUID identificador;
	protected TipoIdentificacionEntity tipoIdentificacion;
	protected String identificacion;
	protected String nombre;
	protected String apellido;
	
	protected PersonaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionEntity.getDefaultObject());
		setIdentificacion(identificacion);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setApellido(UtilText.getUtilText().getDefaultValue());
	}

	public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombre(nombre);
		setApellido(apellido);
	}
	
	public static PersonaEntity createWithIdentificador( UUID identificador) {
		return new PersonaEntity(identificador, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue());
	}
	
	public static PersonaEntity createWithTipoIdentificacion( TipoIdentificacionEntity tipoidentificacion) {
		return new PersonaEntity(UtilUUID.DEFAULT_UUID, tipoidentificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue());
	}
	
	public static PersonaEntity createWithIdentificacion( String identificacion) {
		return new PersonaEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), identificacion, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue());
	}
	
	public static PersonaEntity createWithNombre( String nombre) {
		return new PersonaEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), nombre, UtilText.getUtilText().getDefaultValue());
	}
	
	public static PersonaEntity createWithApellido( String apellido) {
		return new PersonaEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), apellido);
	}
	
	public UUID getIdentificador() {
		return identificador;
	}
	protected void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionEntity.getDefaultObject());
	}
	public String getIdentificacion() {
		return identificacion;
	}
	protected void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}
	public String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = UtilText.getUtilText().applyTrim(apellido);
	}

}
