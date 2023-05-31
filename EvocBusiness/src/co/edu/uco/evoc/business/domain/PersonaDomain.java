package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public class PersonaDomain {
	
	protected UUID identificador;
	protected TipoIdentificacionDomain tipoIdentificacion;
	protected String identificacion;
	protected String nombre;
	protected String apellido;

	public PersonaDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
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
	public TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
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
