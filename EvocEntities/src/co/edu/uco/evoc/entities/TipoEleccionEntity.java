package co.edu.uco.evoc.entities;

import java.util.UUID;

public class TipoEleccionEntity {
	
	private UUID identificador;
	private String nombre;
	private NivelTipoEleccionEntity nivelTipoEleccion;
	
	
	public TipoEleccionEntity(UUID identificador, String nombre, NivelTipoEleccionEntity nivelTipoEleccion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setNivelTipoEleccion(nivelTipoEleccion);
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
	public final NivelTipoEleccionEntity getNivelTipoEleccion() {
		return nivelTipoEleccion;
	}
	private final void setNivelTipoEleccion(final NivelTipoEleccionEntity nivelTipoEleccion) {
		this.nivelTipoEleccion = nivelTipoEleccion;
	}

}
