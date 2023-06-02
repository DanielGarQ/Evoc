package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class EleccionDTO {
	
	private UUID identificador;
	private String nombre;
	private TipoEleccionDTO tipoEleccion;
	private ZonaDTO zona;
	private String fechaInicial;
	private String fechaFinal;
	private RegistradorDTO registrador;
	private EstadoEleccionDTO estadoEleccion;
	
	public EleccionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNombre(UtilText.getUtilText().getDefaultValue());
		setTipoEleccion(TipoEleccionDTO.create());
		setZona(ZonaDTO.create());
		setFechaInicial(fechaInicial);
		setFechaFinal(fechaFinal);
		setRegistrador(RegistradorDTO.create());
		setEstadoEleccion(EstadoEleccionDTO.create());
	}
	
	public EleccionDTO(final UUID identificador, final String nombre, final TipoEleccionDTO tipoEleccion, final ZonaDTO zona, final String fechaInicial,
			final String fechaFinal, final RegistradorDTO registrador, final EstadoEleccionDTO estadoELeccion) {
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
	
	public static EleccionDTO create() {
		return new EleccionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final EleccionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNombre() {
		return nombre;
	}
	public final EleccionDTO setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		return this;
	}
	public final TipoEleccionDTO getTipoEleccion() {
		return tipoEleccion;
	}
	public final EleccionDTO setTipoEleccion(final TipoEleccionDTO tipoEleccion) {
		this.tipoEleccion = UtilObject.getDefault(tipoEleccion, TipoEleccionDTO.create());
		return this;
	}
	public final ZonaDTO getZona() {
		return zona;
	}
	public final EleccionDTO setZona(final ZonaDTO zona) {
		this.zona = UtilObject.getDefault(zona, ZonaDTO.create());
		return this;
	}
	public final String getFechaInicial() {
		return fechaInicial;
	}
	public final EleccionDTO setFechaInicial(final String fechaInicial) {
		this.fechaInicial = fechaInicial;
		return this;
	}
	public final String getFechaFinal() {
		return fechaFinal;
	}
	public final EleccionDTO setFechaFinal(final String fechaFinal) {
		this.fechaFinal = fechaFinal;
		return this;
	}
	public final RegistradorDTO getRegistrador() {
		return registrador;
	}
	public final EleccionDTO setRegistrador(final RegistradorDTO registrador) {
		this.registrador = UtilObject.getDefault(registrador, RegistradorDTO.create());
		return this;
	}
	public final EstadoEleccionDTO getEstadoEleccion() {
		return estadoEleccion;
	}
	public final EleccionDTO setEstadoEleccion(final EstadoEleccionDTO estadoEleccion) {
		this.estadoEleccion = UtilObject.getDefault(estadoEleccion, EstadoEleccionDTO.create());
		return this;
	}

}
