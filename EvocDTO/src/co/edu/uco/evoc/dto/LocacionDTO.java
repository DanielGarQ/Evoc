package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class LocacionDTO {
	
	private UUID identificador;
	private String direccion;
	private String descripcion;
	private int potencialElectoral;
	private ZonaDTO zona;
	
	public LocacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);;
		setDireccion(direccion);
		setDescripcion(UtilText.EMPTY);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	
	public LocacionDTO(final UUID identificador, final String direccion, final String descripcion, final int potencialElectoral, final ZonaDTO zona) {
		super();
		setIdentificador(identificador);
		setDireccion(direccion);
		setDescripcion(descripcion);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	
	public static LocacionDTO create() {
		return new LocacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final LocacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getDireccion() {
		return direccion;
	}
	public final LocacionDTO setDireccion(final String direccion) {
		this.direccion = direccion;
		return this;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final LocacionDTO setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		return this;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	public final LocacionDTO setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
		return this;
	}
	public final ZonaDTO getZona() {
		return zona;
	}
	public final LocacionDTO setZona(final ZonaDTO zona) {
		this.zona = zona;
		return this;
	}


}
