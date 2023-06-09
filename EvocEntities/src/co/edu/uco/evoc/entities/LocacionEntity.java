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
	private String potencialElectoral;
	private ZonaEntity zona;
	
	private LocacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setDireccion(direccion);
		setDescripcion(UtilText.EMPTY);
		setPotencialElectoral(UtilText.getUtilText().getDefaultValue());
		setZona(ZonaEntity.getDefaultobject());
	}
	
	public LocacionEntity(final UUID identificador, final String direccion, final String descripcion, final String potencialElectoral, final ZonaEntity zona) {
		super();
		setIdentificador(identificador);
		setDireccion(direccion);
		setDescripcion(descripcion);
		setPotencialElectoral(potencialElectoral);
		setZona(zona);
	}
	
	public static final  LocacionEntity createWithIdentificador(final UUID identificador) {
		return new LocacionEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), ZonaEntity.getDefaultobject());
	}
	
	public static final  LocacionEntity createWithDireccion(final String direccion) {
		return new LocacionEntity(UtilUUID.DEFAULT_UUID, direccion,UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), ZonaEntity.getDefaultobject());
	}
	
	public static final  LocacionEntity createWithDescripcion(final String descripcion) {
		return new LocacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion, UtilText.getUtilText().getDefaultValue(), ZonaEntity.getDefaultobject());
	}
	
	public static final  LocacionEntity createWithPotencialElectoral(final String potencialElectoral) {
		return new LocacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), potencialElectoral, ZonaEntity.getDefaultobject());
	}
	
	public static final  LocacionEntity createWithZona(final ZonaEntity zona) {
		return new LocacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), zona);
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
	public final String getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final String potencialElectoral) {
		this.potencialElectoral = UtilText.getUtilText().getDefaultValue();
	}
	public final ZonaEntity getZona() {
		return zona;
	}
	private final void setZona(final ZonaEntity zona) {
		this.zona = UtilObject.getDefault(zona, ZonaEntity.getDefaultobject());
	}

}
