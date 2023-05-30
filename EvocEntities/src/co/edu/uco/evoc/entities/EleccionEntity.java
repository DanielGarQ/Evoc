package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class EleccionEntity {
	
	private static final EleccionEntity DEFAULT_OBJECT = new EleccionEntity();
	private UUID identificador;
	private String nombre;
	private TipoEleccionEntity tipoEleccion;
	private ZonaEntity zona;
	private Date fechaInicial;
	private Date fechaFinal;
	private RegistradorEntity registrador;
	private EstadoEleccionEntity estadoEleccion;
	
	private EleccionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoEleccion(TipoEleccionEntity.getDefaultObject());
		setZona(ZonaEntity.getDefaultobject());
		setFechaInicial(fechaInicial);
		setFechaFinal(fechaFinal);
		setRegistrador(RegistradorEntity.getDefaultobject());
		setEstadoEleccion(EstadoEleccionEntity.getDefaultObject());
	}
	
	public EleccionEntity(final UUID identificador, final String nombre, final TipoEleccionEntity tipoEleccion, final ZonaEntity zona, final Date fechaInicial,
			final Date fechaFinal, final RegistradorEntity registrador, final EstadoEleccionEntity estadoELeccion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setTipoEleccion(tipoEleccion);
		setZona(zona);
		setFechaInicial(fechaInicial);
		setFechaFinal(fechaFinal);
		setRegistrador(registrador);
		setEstadoEleccion(estadoEleccion);
	}
	
	public static EleccionEntity getDefaultObject() {
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
	public final TipoEleccionEntity getTipoEleccion() {
		return tipoEleccion;
	}
	private final void setTipoEleccion(final TipoEleccionEntity tipoEleccion) {
		this.tipoEleccion = UtilObject.getDefault(tipoEleccion, TipoEleccionEntity.getDefaultObject());
	}
	public final ZonaEntity getZona() {
		return zona;
	}
	private final void setZona(final ZonaEntity zona) {
		this.zona = UtilObject.getDefault(zona, ZonaEntity.getDefaultobject());
	}
	public final Date getFechaInicial() {
		return fechaInicial;
	}
	private final void setFechaInicial(final Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public final Date getFechaFinal() {
		return fechaFinal;
	}
	private final void setFechaFinal(final Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public final RegistradorEntity getRegistrador() {
		return registrador;
	}
	private final void setRegistrador(final RegistradorEntity registrador) {
		this.registrador = UtilObject.getDefault(registrador, RegistradorEntity.getDefaultobject());
	}
	public final EstadoEleccionEntity getEstadoEleccion() {
		return estadoEleccion;
	}
	private final void setEstadoEleccion(final EstadoEleccionEntity estadoEleccion) {
		this.estadoEleccion = UtilObject.getDefault(estadoEleccion, EstadoEleccionEntity.getDefaultObject());
	}

}
