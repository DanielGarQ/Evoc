package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class TipoEleccionDomain {
	
	private static final TipoEleccionDomain DEFAULT_OBJECT = new TipoEleccionDomain();
	private UUID identificador;
	private String nombre;
	private NivelTipoEleccionDomain nivelTipoEleccion;
	
	private TipoEleccionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setNivelTipoEleccion(NivelTipoEleccionDomain.getDefaultObject());
	}
	
	public TipoEleccionDomain(final UUID identificador, final String nombre, final NivelTipoEleccionDomain nivelTipoEleccion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setNivelTipoEleccion(nivelTipoEleccion);
	}
	
	public static TipoEleccionDomain getDefaultObject() {
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
	public final NivelTipoEleccionDomain getNivelTipoEleccion() {
		return nivelTipoEleccion;
	}
	private final void setNivelTipoEleccion(final NivelTipoEleccionDomain nivelTipoEleccion) {
		this.nivelTipoEleccion = UtilObject.getDefault(nivelTipoEleccion, NivelTipoEleccionDomain.getDefaultObject());
	}

}
