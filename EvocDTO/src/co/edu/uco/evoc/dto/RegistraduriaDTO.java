package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class RegistraduriaDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public RegistraduriaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public RegistraduriaDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	public static TipoCandidatoDTO create() {
		return new TipoCandidatoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final RegistraduriaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final RegistraduriaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final RegistraduriaDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}


}
