package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class PartidoDTO {
	
	private UUID identificador;
	private String nombre;
	private String sede;
	
	public PartidoDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setSede(UtilText.EMPTY);
	}
	
	public PartidoDTO(UUID identificador, String nombre, String sede) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setSede(sede);
	}
	
	public static PartidoDTO create() {
		return new PartidoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final PartidoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final PartidoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getSede() {
		return sede;
	}
	public final PartidoDTO setSede(final String sede) {
		this.sede = UtilText.getUtilText().applyTrim(sede);
		return this;
	}


}
