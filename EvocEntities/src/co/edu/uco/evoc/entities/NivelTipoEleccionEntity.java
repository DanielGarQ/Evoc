package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class NivelTipoEleccionEntity{
	
	private static final NivelTipoEleccionEntity DEFAULT_OBJECT = new NivelTipoEleccionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private NivelTipoEleccionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public NivelTipoEleccionEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  NivelTipoEleccionEntity createWithIdentificador(final UUID identificador) {
		return new NivelTipoEleccionEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  NivelTipoEleccionEntity createWithNombre(final String nombre) {
		return new NivelTipoEleccionEntity(UtilUUID.DEFAULT_UUID, nombre,UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  NivelTipoEleccionEntity createWithDescripcion(final String descripcion) {
		return new NivelTipoEleccionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion);
	}
	
	public static NivelTipoEleccionEntity getDefaultObject() {
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
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
	}
	
}

