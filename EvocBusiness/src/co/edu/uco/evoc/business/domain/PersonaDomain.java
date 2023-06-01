package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class PersonaDomain {
	
	protected UUID identificador;
	protected TipoIdentificacionDomain tipoIdentificacion;
	protected String identificacion;
	protected String nombre;
	protected String apellido;
	
	protected PersonaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setTipoIdentificacion(TipoIdentificacionDomain.getDefaultObject());
		setIdentificacion(identificacion);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setApellido(UtilText.getUtilText().getDefaultValue());
	}

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
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	protected void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDomain.getDefaultObject());
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
