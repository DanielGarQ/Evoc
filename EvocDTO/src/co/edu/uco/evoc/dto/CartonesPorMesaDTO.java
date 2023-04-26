package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class CartonesPorMesaDTO {
	
	private UUID identificador;
	private MesaVotacionDTO mesaVotacion;
	private CartonVotacionDTO cartonVotacion;
	private VotanteRegistradoDTO votante;
	private boolean marcacion;
	
	public CartonesPorMesaDTO() {
		super();
		setIdentificador(identificador);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	
	public CartonesPorMesaDTO(UUID identidicador, MesaVotacionDTO mesaVotacion, CartonVotacionDTO cartonVotacion,
			VotanteRegistradoDTO votante, boolean marcacion) {
		super();
		setIdentificador(identificador);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	public final CartonVotacionDTO getCartonVotacion() {
		return cartonVotacion;
	}
	public final void setCartonVotacion(final CartonVotacionDTO cartonVotacion) {
		this.cartonVotacion = cartonVotacion;
	}
	public final VotanteRegistradoDTO getVotante() {
		return votante;
	}
	public final void setVotante(final VotanteRegistradoDTO votante) {
		this.votante = votante;
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	public final void setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
	}
	
	

}
