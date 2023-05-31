package co.edu.uco.evoc.entities;

import java.util.UUID;

public class ZonaEntity {
	
	private UUID identificador;
	private String nombre;
	private String zonaPadre;
	private int potencialElectoral;

	public ZonaEntity(UUID identificador, String nombre, String zonaPadre, int potencialElectoral) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
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
	public final String getZonaPadre() {
		return zonaPadre;
	}
	private final void setZonaPadre(final String zonaPadre) {
		this.zonaPadre = zonaPadre;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}

}
