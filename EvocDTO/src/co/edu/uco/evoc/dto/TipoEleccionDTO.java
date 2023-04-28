package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class TipoEleccionDTO {
	
	private UUID identificador;
	private String nombre;
	private NivelTipoEleccionDTO nivelTipoEleccion;
	
	public TipoEleccionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setNivelTipoEleccion(nivelTipoEleccion);
	}
	
	public TipoEleccionDTO(UUID identificador, String nombre, NivelTipoEleccionDTO nivelTipoEleccion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setNivelTipoEleccion(nivelTipoEleccion);
	}
	
	public static TipoEleccionDTO create() {
		return new TipoEleccionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final TipoEleccionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final TipoEleccionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final NivelTipoEleccionDTO getNivelTipoEleccion() {
		return nivelTipoEleccion;
	}
	public final TipoEleccionDTO setNivelTipoEleccion(final NivelTipoEleccionDTO nivelTipoEleccion) {
		this.nivelTipoEleccion = nivelTipoEleccion;
		return this;
	}
	
	

}
