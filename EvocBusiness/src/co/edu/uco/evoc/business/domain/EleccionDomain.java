package co.edu.uco.evoc.business.domain;

import java.util.Date;
import java.util.UUID;

public class EleccionDomain {
	
	private UUID identificador;
	private String nombre;
	private TipoEleccionDomain tipoEleccion;
	private ZonaDomain zona;
	private Date fechaInicial;
	private Date fechaFinal;
	private RegistradorDomain registrador;
	private EstadoEleccionDomain estadoEleccion;
	
	
	
	public EleccionDomain(UUID identificador, String nombre, TipoEleccionDomain tipoEleccion, ZonaDomain zona, Date fechaInicial,
			Date fechaFinal, RegistradorDomain registrador, EstadoEleccionDomain estadoELeccion) {
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
	public final TipoEleccionDomain getTipoEleccion() {
		return tipoEleccion;
	}
	private final void setTipoEleccion(final TipoEleccionDomain tipoEleccion) {
		this.tipoEleccion = tipoEleccion;
	}
	public final ZonaDomain getZona() {
		return zona;
	}
	private final void setZona(final ZonaDomain zona) {
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
	public final RegistradorDomain getRegistrador() {
		return registrador;
	}
	private final void setRegistrador(final RegistradorDomain registrador) {
		this.registrador = registrador;
	}
	public final EstadoEleccionDomain getEstadoEleccion() {
		return estadoEleccion;
	}
	private final void setEstadoEleccion(final EstadoEleccionDomain estadoEleccion) {
		this.estadoEleccion = estadoEleccion;
	}

}
