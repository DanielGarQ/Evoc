package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonesPorMesaDTO {
	
	private UUID identificador;
	private MesaVotacionDTO mesaVotacion;
	private CartonVotacionDTO cartonVotacion;
	private VotanteRegistradoDTO votante;
	private boolean marcacion;
	
	public CartonesPorMesaDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	
	public CartonesPorMesaDTO(final UUID identidicador, final MesaVotacionDTO mesaVotacion, final CartonVotacionDTO cartonVotacion,
			final VotanteRegistradoDTO votante, final boolean marcacion) {
		super();
		setIdentificador(identificador);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	
	public static CartonesPorMesaDTO create() {
		return new CartonesPorMesaDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CartonesPorMesaDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final CartonesPorMesaDTO setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
		return this;
	}
	public final CartonVotacionDTO getCartonVotacion() {
		return cartonVotacion;
	}
	public final CartonesPorMesaDTO setCartonVotacion(final CartonVotacionDTO cartonVotacion) {
		this.cartonVotacion = cartonVotacion;
		return this;
	}
	public final VotanteRegistradoDTO getVotante() {
		return votante;
	}
	public final CartonesPorMesaDTO setVotante(final VotanteRegistradoDTO votante) {
		this.votante = votante;
		return this;
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	public final CartonesPorMesaDTO setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
		return this;
	}

}
