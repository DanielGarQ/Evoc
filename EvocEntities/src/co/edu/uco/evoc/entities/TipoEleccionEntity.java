package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class TipoEleccionEntity {
	
	private static final TipoEleccionEntity DEFAULT_OBJECT = new TipoEleccionEntity();
	private UUID identificador;
	private String nombre;
	private NivelTipoEleccionEntity nivelTipoEleccion;
	
	private TipoEleccionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setNivelTipoEleccion(NivelTipoEleccionEntity.getDefaultObject());
	}
	
	public TipoEleccionEntity(final UUID identificador, final String nombre, final NivelTipoEleccionEntity nivelTipoEleccion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setNivelTipoEleccion(nivelTipoEleccion);
	}
	
	public static TipoEleccionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public final NivelTipoEleccionEntity getNivelTipoEleccion() {
		return nivelTipoEleccion;
	}
	private final void setNivelTipoEleccion(final NivelTipoEleccionEntity nivelTipoEleccion) {
		this.nivelTipoEleccion = UtilObject.getDefault(nivelTipoEleccion, NivelTipoEleccionEntity.getDefaultObject());
	}

}
