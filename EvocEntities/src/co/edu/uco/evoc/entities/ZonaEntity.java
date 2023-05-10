package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class ZonaEntity {
	
	private static final ZonaEntity DEFAULT_OBJECT = new ZonaEntity();
	private UUID identificador;
	private String nombre;
	private String zonaPadre;
	private int potencialElectoral;
	
	private ZonaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
	}

	public ZonaEntity(final UUID identificador, final String nombre, final String zonaPadre, final int potencialElectoral) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
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
