package co.edu.uco.evoc.entities;

import java.util.UUID;

public class PersonaEntity {
	
	protected UUID identificador;
	protected TipoIdentificacionEntity tipoIdentificacion;
	protected String identificacion;
	protected String nombre;
	protected String apellido;

	public PersonaEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
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
	protected void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}
	public TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
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
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
