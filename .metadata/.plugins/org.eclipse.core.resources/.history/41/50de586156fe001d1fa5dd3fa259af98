package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class ZonaEntity {
	
	private static final ZonaEntity DEFAULT_OBJECT = new ZonaEntity();
	private UUID identificador;
	private String nombre;
	private ZonaEntity zonaPadre;
	private String potencialElectoral;
	
	private ZonaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setZonaPadre(ZonaEntity.getDefaultobject());
		setPotencialElectoral(UtilText.getUtilText().getDefaultValue());
	}

	public ZonaEntity(final UUID identificador, final String nombre, final ZonaEntity zonaPadre, final String potencialElectoral) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
	}
	
	public static final  ZonaEntity createWithIdentificador(final UUID identificador) {
		return new ZonaEntity(identificador, UtilText.getUtilText().getDefaultValue(),ZonaEntity.getDefaultobject(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  ZonaEntity createWithNombre(final String nombre) {
		return new ZonaEntity(UtilUUID.DEFAULT_UUID, nombre,ZonaEntity.getDefaultobject(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  ZonaEntity createWithZonaPadre(final ZonaEntity ZonaPadre) {
		return new ZonaEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), ZonaPadre, UtilText.getUtilText().getDefaultValue());
	}
	
	public static final ZonaEntity createWithPotencialElectoral(final String potencialElectoral) {
		return new ZonaEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(),ZonaEntity.getDefaultobject(),potencialElectoral);
	}
	
	public static ZonaEntity getDefaultobject() {
		return DEFAULT_OBJECT;
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	}
	public final ZonaEntity getZonaPadre() {
		return zonaPadre;
	}
	private final void setZonaPadre(final ZonaEntity zonaPadre) {
		this.zonaPadre = UtilObject.getDefault(zonaPadre, ZonaEntity.getDefaultobject());
	}
	public final String getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final String potencialElectoral2) {
		this.potencialElectoral = UtilText.getUtilText().getDefaultValue();
	}

}
