package co.edu.uco.evoc.dto;

import java.util.Date;
import java.util.UUID;

public final class EleccionDTO {
	
	private UUID identificador;
	private String nombre;
	private TipoEleccionDTO tipoEleccion;
	private ZonaDTO zona;
	private Date fechaInicial;
	private Date fechaFinal;
	private RegistradorDTO registrador;
	private EstadoEleccionDTO estadoEleccion;
	
	public EleccionDTO() {
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
	
	public EleccionDTO(UUID identificador, String nombre, TipoEleccionDTO tipoEleccion, ZonaDTO zona, Date fechaInicial,
			Date fechaFinal, RegistradorDTO registrador, EstadoEleccionDTO estadoELeccion) {
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
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNombre() {
		return nombre;
	}
	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}
	public final TipoEleccionDTO getTipoEleccion() {
		return tipoEleccion;
	}
	public final void setTipoEleccion(final TipoEleccionDTO tipoEleccion) {
		this.tipoEleccion = tipoEleccion;
	}
	public final ZonaDTO getZona() {
		return zona;
	}
	public final void setZona(final ZonaDTO zona) {
		this.zona = zona;
	}
	public final Date getFechaInicial() {
		return fechaInicial;
	}
	public final void setFechaInicial(final Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public final Date getFechaFinal() {
		return fechaFinal;
	}
	public final void setFechaFinal(final Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public final RegistradorDTO getRegistrador() {
		return registrador;
	}
	public final void setRegistrador(final RegistradorDTO registrador) {
		this.registrador = registrador;
	}
	public final EstadoEleccionDTO getEstadoEleccion() {
		return estadoEleccion;
	}
	public final void setEstadoEleccion(final EstadoEleccionDTO estadoEleccion) {
		this.estadoEleccion = estadoEleccion;
	}
	
	
	

}
