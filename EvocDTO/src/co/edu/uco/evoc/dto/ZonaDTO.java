package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class ZonaDTO {
	
	private UUID identificador;
	private String nombre;
	private String zonaPadre;
	private int potencialElectoral;
	
	public ZonaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
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
	
	public static ZonaDTO create() {
		return new ZonaDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final ZonaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final ZonaDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
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
