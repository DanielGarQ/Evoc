package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class EstadoMesaVotacionCalculadoDTO {
	
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	public EstadoMesaVotacionCalculadoDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public EstadoMesaVotacionCalculadoDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static EstadoMesaVotacionCalculadoDTO create() {
		return new EstadoMesaVotacionCalculadoDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EstadoMesaVotacionCalculadoDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final EstadoMesaVotacionCalculadoDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final EstadoMesaVotacionCalculadoDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	

}
