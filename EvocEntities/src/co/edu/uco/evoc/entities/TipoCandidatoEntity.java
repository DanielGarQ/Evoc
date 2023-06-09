package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class TipoCandidatoEntity {
	
	private static final TipoCandidatoEntity DEFAULT_OBJECT = new TipoCandidatoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private TipoCandidatoEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
		
	public TipoCandidatoEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  TipoCandidatoEntity createWithIdentificador(final UUID identificador) {
		return new TipoCandidatoEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoCandidatoEntity createWithNombre(final String nombre) {
		return new TipoCandidatoEntity(UtilUUID.DEFAULT_UUID, nombre,UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  TipoCandidatoEntity createWithDescripcion(final String descripcion) {
		return new TipoCandidatoEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion);
	}
	
	public static final TipoCandidatoEntity getDefaultObject() {
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
