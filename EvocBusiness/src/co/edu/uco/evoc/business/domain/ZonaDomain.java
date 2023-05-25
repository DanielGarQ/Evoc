package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class ZonaDomain {
	
	private static final ZonaDomain DEFAULT_OBJECT = new ZonaDomain();
	private UUID identificador;
	private String nombre;
	private ZonaDomain zonaPadre;
	private int potencialElectoral;
	
	private ZonaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setZonaPadre(ZonaDomain.getDefaultobject());
		setPotencialElectoral(potencialElectoral);
	}

	public ZonaDomain(final UUID identificador, final String nombre, final ZonaDomain zonaPadre, final int potencialElectoral) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setZonaPadre(zonaPadre);
		setPotencialElectoral(potencialElectoral);
	}
	
	public static ZonaDomain getDefaultobject() {
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
	public final ZonaDomain getZonaPadre() {
		return zonaPadre;
	}
	private final void setZonaPadre(final ZonaDomain zonaPadre) {
		this.zonaPadre = UtilObject.getDefault(zonaPadre, ZonaDomain.getDefaultobject());
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}

}
