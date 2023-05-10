package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class PersonaDTO {
	
	protected UUID identificador;
	protected TipoIdentificacionDTO tipoIdentificacion;
	protected String identificacion;
	protected String nombre;
	protected String apellido;
	
	public PersonaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setApellido(UtilText.getUtilText().getDefaultValue());
	}
	
	public PersonaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String identificacion,
			String nombre, String apellido) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setIdentificacion(identificacion);
		setNombre(nombre);
		setApellido(apellido);
	}
	public UUID getIdentificador() {
		return identificador;
	}
	public PersonaDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public PersonaDTO setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public String getApellido() {
		return apellido;
	}
	public PersonaDTO setApellido(String apellido) {
		this.apellido = UtilText.getUtilText().applyTrim(apellido);
		return this;
	}


}
