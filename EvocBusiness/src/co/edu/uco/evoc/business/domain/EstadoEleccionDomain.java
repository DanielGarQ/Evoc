package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public class EstadoEleccionDomain {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoEleccionDomain(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
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