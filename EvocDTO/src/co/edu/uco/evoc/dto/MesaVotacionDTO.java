package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class MesaVotacionDTO {
	
	private UUID identificador;
	private String numeroMesa;
	private int potencialElectoral;
	private LocacionDTO locacion;
	private EstadoMesaVotacionCalculadoDTO estadoMesaVotacionCalculado;
	
	public MesaVotacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNumeroMesa(UtilText.getUtilText().getDefaultValue());
		setPotencialElectoral(potencialElectoral);
		setLocacion(locacion);
		setEstadoMesaVotacionCalculado(estadoMesaVotacionCalculado);
	}
	
	public MesaVotacionDTO(final UUID identificador, final String numeroMesa, final int potencialElectoral, final LocacionDTO locacion,
			final EstadoMesaVotacionCalculadoDTO estadoMesaVotacionCalculado) {
		super();
		setIdentificador(identificador);
		setNumeroMesa(numeroMesa);
		setPotencialElectoral(potencialElectoral);
		setLocacion(locacion);
		setEstadoMesaVotacionCalculado(estadoMesaVotacionCalculado);
	}
	
	public static MesaVotacionDTO create() {
		return new MesaVotacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final MesaVotacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final String getNumeroMesa() {
		return numeroMesa;
	}
	public final MesaVotacionDTO setNumeroMesa(final String numeroMesa) {
		this.numeroMesa = UtilText.getUtilText().applyTrim(numeroMesa);
		return this;
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	public final MesaVotacionDTO setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
		return this;
	}
	public final LocacionDTO getLocacion() {
		return locacion;
	}
	public final MesaVotacionDTO setLocacion(final LocacionDTO locacion) {
		this.locacion = locacion;
		return this;
	}
	public final EstadoMesaVotacionCalculadoDTO getEstadoMesaVotacionCalculado() {
		return estadoMesaVotacionCalculado;
	}
	public final MesaVotacionDTO setEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoDTO estadoMesaVotacionCalculado) {
		this.estadoMesaVotacionCalculado = estadoMesaVotacionCalculado;
		return this;
	}

}
