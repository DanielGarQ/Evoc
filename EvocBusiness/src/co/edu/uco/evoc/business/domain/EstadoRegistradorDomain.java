package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class EstadoRegistradorDomain {
	
	private static final EstadoRegistradorDomain DEFAULT_OBJECT = new EstadoRegistradorDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private EstadoRegistradorDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}

	public EstadoRegistradorDomain(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoRegistradorDomain getdefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

}
