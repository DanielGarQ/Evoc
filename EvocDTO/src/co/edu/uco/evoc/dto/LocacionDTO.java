package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class LocacionDTO {
	
	private UUID identificador;
	private String direccion;
	private String descripcion;
	private int potencialElectoral;
	private ZonaDTO zona;
	
	public LocacionDTO() {
		super();
		setIdentificador(identificador);
		setDireccion(direccion);
		setDescripcion(descripcion);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	
	public LocacionDTO(UUID identificador, String direccion, String descripcion, int potencialElectoral, ZonaDTO zona) {
		super();
		setIdentificador(identificador);
		setDireccion(direccion);
		setDescripcion(descripcion);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getDireccion() {
		return direccion;
	}
	public final void setDireccion(final String direccion) {
		this.direccion = direccion;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	public final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}
	public final ZonaDTO getZona() {
		return zona;
	}
	public final void setZona(final ZonaDTO zona) {
		this.zona = zona;
	}

}
