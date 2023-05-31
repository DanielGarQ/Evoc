package co.edu.uco.evoc.entities;

import java.util.UUID;

public class MesaVotacionEntity {
	
	private UUID identificador;
	private String numeroMesa;
	private int potencialElectoral;
	private LocacionEntity locacion;
	private EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado;
	
	public MesaVotacionEntity(UUID identificador, String numeroMesa, int potencialElectoral, LocacionEntity locacion,
			EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado) {
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
	public final LocacionEntity getLocacion() {
		return locacion;
	}
	private final void setLocacion(final LocacionEntity locacion) {
		this.locacion = locacion;
	}
	public final EstadoMesaVotacionCalculadoEntity getEstadoMesaVotacionCalculado() {
		return estadoMesaVotacionCalculado;
	}
	private final void setEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado) {
		this.estadoMesaVotacionCalculado = estadoMesaVotacionCalculado;
	}

}
