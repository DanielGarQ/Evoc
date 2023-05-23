package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class LocacionEntity {
	
	private static final LocacionEntity DEFAULT_OBJECT = new LocacionEntity();
	private UUID identificador;
	private String direccion;
	private String descripcion;
	private int potencialElectoral;
	private ZonaEntity zona;
	
	private LocacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setDireccion(direccion);
		setDescripcion(UtilText.EMPTY);
		setPotencialElectoral(potencialElectoral);
		setZona(ZonaEntity.getDefaultobject());
	}
	
	public LocacionEntity(final UUID identificador, final String direccion, final String descripcion, final int potencialElectoral, final ZonaEntity zona) {
		super();
		setIdentificador(identificador);
		setDireccion(direccion);
		setDescripcion(descripcion);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	
	public static LocacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
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
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
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
		this.zona = UtilObject.getDefault(zona, ZonaEntity.getDefaultobject());
	}

}
