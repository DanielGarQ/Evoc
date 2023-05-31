package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public class MesaVotacionDomain {
	
	private UUID identificador;
	private String numeroMesa;
	private int potencialElectoral;
	private LocacionDomain locacion;
	private EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado;
	
	public MesaVotacionDomain(UUID identificador, String numeroMesa, int potencialElectoral, LocacionDomain locacion,
			EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado) {
		super();
		setIdentificador(identificador);
		setNumeroMesa(numeroMesa);
		setPotencialElectoral(potencialElectoral);
		setLocacion(locacion);
		setEstadoMesaVotacionCalculado(estadoMesaVotacionCalculado);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final String getNumeroMesa() {
		return numeroMesa;
	}
	private final void setNumeroMesa(final String numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}
	public final LocacionDomain getLocacion() {
		return locacion;
	}
	private final void setLocacion(final LocacionDomain locacion) {
		this.locacion = locacion;
	}
	public final EstadoMesaVotacionCalculadoDomain getEstadoMesaVotacionCalculado() {
		return estadoMesaVotacionCalculado;
	}
	private final void setEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado) {
		this.estadoMesaVotacionCalculado = estadoMesaVotacionCalculado;
	}

}
