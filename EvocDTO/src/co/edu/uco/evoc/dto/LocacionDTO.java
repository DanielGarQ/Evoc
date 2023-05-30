package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class LocacionDTO {
	
	private UUID identificador;
	private String direccion;
	private String descripcion;
	private String potencialElectoral;
	private ZonaDTO zona;
	
	public LocacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setDireccion(direccion);
		setDescripcion(UtilText.EMPTY);
		setPotencialElectoral(UtilText.getUtilText().getDefaultValue());
		setZona(ZonaDTO.create());
	}
	
	public LocacionDTO(final UUID identificador, final String direccion, final String descripcion, final String potencialElectoral, final ZonaDTO zona) {
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
	public final String getPotencialElectoral() {
		return potencialElectoral;
	}
	public final LocacionDTO setPotencialElectoral(final String potencialElectoral) {
		this.potencialElectoral = UtilText.getUtilText().getDefaultValue();
		return this;
	}
	public final ZonaDTO getZona() {
		return zona;
	}
	public final LocacionDTO setZona(final ZonaDTO zona) {
		this.zona = UtilObject.getDefault(zona, ZonaDTO.create());
		return this;
	}


}
