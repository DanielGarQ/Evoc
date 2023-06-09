package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class EstadoMesaVotacionCalculadoEntity {
	
	private static final EstadoMesaVotacionCalculadoEntity DEFAULT_OBJECT = new EstadoMesaVotacionCalculadoEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private EstadoMesaVotacionCalculadoEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public EstadoMesaVotacionCalculadoEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  EstadoMesaVotacionCalculadoEntity createWithIdentificador(final UUID identificador) {
		return new EstadoMesaVotacionCalculadoEntity(identificador, UtilText.getUtilText().getDefaultValue(),UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  EstadoMesaVotacionCalculadoEntity createWithNombre(final String nombre) {
		return new EstadoMesaVotacionCalculadoEntity(UtilUUID.DEFAULT_UUID, nombre,UtilText.getUtilText().getDefaultValue());
	}
	
	public static final  EstadoMesaVotacionCalculadoEntity createWithDescripcion(final String descripcion) {
		return new EstadoMesaVotacionCalculadoEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), descripcion);
	}
	
	public static EstadoMesaVotacionCalculadoEntity getDefaultObject() {
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