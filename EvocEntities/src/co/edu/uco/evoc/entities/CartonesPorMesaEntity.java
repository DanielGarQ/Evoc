package co.edu.uco.evoc.entities;

import java.util.UUID;

public final class CartonesPorMesaEntity {
	
	private UUID identificador;
	private MesaVotacionEntity mesaVotacion;
	private CartonVotacionEntity cartonVotacion;
	private VotanteRegistradoEntity votante;
	private boolean marcacion;
	
	public CartonesPorMesaEntity(UUID identidicador, MesaVotacionEntity mesaVotacion, CartonVotacionEntity cartonVotacion,
			VotanteRegistradoEntity votante, boolean marcacion) {
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
	public final MesaVotacionEntity getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	public final CartonVotacionEntity getCartonVotacion() {
		return cartonVotacion;
	}
	public final void setCartonVotacion(final CartonVotacionEntity cartonVotacion) {
		this.cartonVotacion = cartonVotacion;
	}
	public final VotanteRegistradoEntity getVotante() {
		return votante;
	}
	public final void setVotante(final VotanteRegistradoEntity votante) {
		this.votante = votante;
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	public final void setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
	}
	
	

}
