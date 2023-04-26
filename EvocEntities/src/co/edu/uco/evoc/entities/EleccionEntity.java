package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;

public class EleccionEntity {
	
	private UUID identificador;
	private String nombre;
	private TipoEleccionEntity tipoEleccion;
	private ZonaEntity zona;
	private Date fechaInicial;
	private Date fechaFinal;
	private RegistradorEntity registrador;
	private EstadoEleccionEntity estadoEleccion;
	
	
	
	public EleccionEntity(UUID identificador, String nombre, TipoEleccionEntity tipoEleccion, ZonaEntity zona, Date fechaInicial,
			Date fechaFinal, RegistradorEntity registrador, EstadoEleccionEntity estadoELeccion) {
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
	public final TipoEleccionEntity getTipoEleccion() {
		return tipoEleccion;
	}
	private final void setTipoEleccion(final TipoEleccionEntity tipoEleccion) {
		this.tipoEleccion = tipoEleccion;
	}
	public final ZonaEntity getZona() {
		return zona;
	}
	private final void setZona(final ZonaEntity zona) {
		this.zona = zona;
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
		this.registrador = registrador;
	}
	public final EstadoEleccionEntity getEstadoEleccion() {
		return estadoEleccion;
	}
	private final void setEstadoEleccion(final EstadoEleccionEntity estadoEleccion) {
		this.estadoEleccion = estadoEleccion;
	}

}
