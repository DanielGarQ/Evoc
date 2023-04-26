package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class TipoIdentificacionDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public TipoIdentificacionDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public TipoIdentificacionDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
