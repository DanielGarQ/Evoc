package co.edu.uco.evoc.entities;

import java.util.UUID;

public class LocacionEntity {
	
	private UUID identificador;
	private String direccion;
	private String descripcion;
	private int potencialElectoral;
	private ZonaEntity zona;

	public LocacionEntity(UUID identificador, String direccion, String descripcion, int potencialElectoral, ZonaEntity zona) {
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
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getDireccion() {
		return direccion;
	}
	private final void setDireccion(final String direccion) {
		this.direccion = direccion;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}
	public final ZonaEntity getZona() {
		return zona;
	}
	private final void setZona(final ZonaEntity zona) {
		this.zona = zona;
	}

}
