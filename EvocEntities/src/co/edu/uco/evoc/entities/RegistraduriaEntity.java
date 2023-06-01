package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class RegistraduriaEntity {
	
	private static final RegistraduriaEntity DEFAULT_OBJECT = new RegistraduriaEntity();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	private RegistraduriaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.EMPTY);
	}
	
	public static RegistraduriaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public RegistraduriaEntity(final UUID identificador, final String nombre, final String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}
	
	public static final  RegistraduriaEntity createWithIdentificador(final UUID identificador) {
		return new RegistraduriaEntity(identificador, UtilText.getUtilText().getDefaultValue(), UtilText.EMPTY);
	}
	
	public static final  RegistraduriaEntity createWithNombre(final String nombre) {
		return new RegistraduriaEntity(UtilUUID.DEFAULT_UUID, nombre, UtilText.EMPTY);
	}
	
	public static final  RegistraduriaEntity createWithDescripcion(final String descripcion) {
		return new RegistraduriaEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), descripcion);
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
