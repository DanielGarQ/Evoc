package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilFecha;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class EleccionEntity {
	
	private static final EleccionEntity DEFAULT_OBJECT = new EleccionEntity();
	private UUID identificador;
	private String nombre;
	private TipoEleccionEntity tipoEleccion;
	private ZonaEntity zona;
	private String fechaInicial;
	private String fechaFinal;
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
	
	public EleccionEntity(final UUID identificador, final String nombre, final TipoEleccionEntity tipoEleccion, final ZonaEntity zona, final String fechaInicial,
			final String fechaFinal, final RegistradorEntity registrador, final EstadoEleccionEntity estadoELeccion) {
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
	
	public static final  EleccionEntity createWithIdentificador(final UUID identificador) {
		return new EleccionEntity(identificador, UtilText.getUtilText().getDefaultValue(),TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithNombre(final String nombre) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,nombre,TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithTipoEleccion(final TipoEleccionEntity tipoEleccion) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), tipoEleccion, ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithZona(final ZonaEntity zona) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), TipoEleccionEntity.getDefaultObject(), zona, UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithfechaInicial(final String fechaInicial) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), fechaInicial, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithfechaFinal(final String fechaFinal) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, fechaFinal, RegistradorEntity.getDefaultobject(), EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithfechaRegistrador(final RegistradorEntity registrador) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, registrador, EstadoEleccionEntity.getDefaultObject());
	}
	
	public static final  EleccionEntity createWithEstadoEleccion(final EstadoEleccionEntity estadoEleccion) {
		return new EleccionEntity(UtilUUID.DEFAULT_UUID,UtilText.getUtilText().getDefaultValue(), TipoEleccionEntity.getDefaultObject(), ZonaEntity.getDefaultobject(), UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, RegistradorEntity.getDefaultobject(), estadoEleccion);
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
	public final String getFechaInicial() {
		return fechaInicial;
	}
	private final void setFechaInicial(final String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public final String getFechaFinal() {
		return fechaFinal;
	}
	private final void setFechaFinal(final String fechaFinal) {
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
