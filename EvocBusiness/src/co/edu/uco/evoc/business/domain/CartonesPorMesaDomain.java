package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public final class CartonesPorMesaDomain {
	
	private UUID identificador;
	private MesaVotacionDomain mesaVotacion;
	private CartonVotacionDomain cartonVotacion;
	private VotanteRegistradoDomain votante;
	private boolean marcacion;
	
	public CartonesPorMesaDomain(UUID identidicador, MesaVotacionDomain mesaVotacion, CartonVotacionDomain cartonVotacion,
			VotanteRegistradoDomain votante, boolean marcacion) {
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
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	public final CartonVotacionDomain getCartonVotacion() {
		return cartonVotacion;
	}
	public final void setCartonVotacion(final CartonVotacionDomain cartonVotacion) {
		this.cartonVotacion = cartonVotacion;
	}
	public final VotanteRegistradoDomain getVotante() {
		return votante;
	}
	public final void setVotante(final VotanteRegistradoDomain votante) {
		this.votante = votante;
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	public final void setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
	}
	
	

}
