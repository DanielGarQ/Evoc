package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class ZonaDTO {
	
	private UUID identificador;
	private String nombre;
	private ZonaDTO zonaPadre;
	private int potencialElectoral;
	
	public ZonaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setZonaPadre(ZonaDTO.create());
		setPotencialElectoral(potencialElectoral);
	}
	
	public ZonaDTO(final UUID identificador, final String nombre, final  ZonaDTO zonaPadre, final int potencialElectoral) {
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
	public final ZonaDTO getZonaPadre() {
		return zonaPadre;
	}
	public final ZonaDTO setZonaPadre(final ZonaDTO zonaPadre) {
		this.zonaPadre = UtilObject.getDefault(zonaPadre, ZonaDTO.create());
		return this;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	public final ZonaDTO setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
		return this;
	}


}
