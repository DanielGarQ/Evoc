package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class TipoIdentificacionEntity {
	
	private static final TipoIdentificacionEntity DEFAULT_OBJECT = new TipoIdentificacionEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private TipoIdentificacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public TipoIdentificacionEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  TipoIdentificacionEntity createWithIdentificador(final UUID identificador) {
		return new TipoIdentificacionEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoIdentificacionEntity createWithNombre(final String nombre) {
		return new TipoIdentificacionEntity(UtilUUID.DEFAULT_UUID, nombre,UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoIdentificacionEntity createWithDescripcion(final String descripcion) {
		return new TipoIdentificacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion);
	}
	
	public static final TipoIdentificacionEntity getDefaultObject() {
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
