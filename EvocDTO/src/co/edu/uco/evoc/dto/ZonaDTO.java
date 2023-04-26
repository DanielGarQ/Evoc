package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class ZonaDTO {
	
	private UUID identificador;
	private String nombre;
	private String zonaPadre;
	private int potencialElectoral;
	
	public ZonaDTO() {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
	}
	
	public ZonaDTO(UUID identificador, String nombre, String zonaPadre, int potencialElectoral) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
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
	public final String getZonaPadre() {
		return zonaPadre;
	}
	public final void setZonaPadre(final String zonaPadre) {
		this.zonaPadre = zonaPadre;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	public final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}
	

}
