package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class TipoRegistradorEntity {
	
	private static final TipoRegistradorEntity DEFAULT_OBJECT = new TipoRegistradorEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private TipoRegistradorEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public TipoRegistradorEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  TipoRegistradorEntity createWithIdentificador(final UUID identificador) {
		return new TipoRegistradorEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoRegistradorEntity createWithNombre(final String nombre) {
		return new TipoRegistradorEntity(UtilUUID.DEFAULT_UUID, nombre,UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoRegistradorEntity createWithDescripcion(final String descripcion) {
		return new TipoRegistradorEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion);
	}
	
	public static TipoRegistradorEntity getDefaultObject() {
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
