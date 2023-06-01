package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class PartidoDomain {
	
	private static final PartidoDomain DEFAULT_OBJECT = new PartidoDomain();
	private UUID identificador;
	private String nombre;
	private String sede;
	
	private PartidoDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setSede(UtilText.EMPTY);
	}
	
	public PartidoDomain(final UUID identificador, final String nombre, final String sede) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setSede(sede);
	}
	
	public static PartidoDomain getDefaultObject() {
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
	public final String getSede() {
		return sede;
	}
	private final void setSede(final String sede) {
		this.sede = UtilText.getUtilText().applyTrim(sede);
	}

}
