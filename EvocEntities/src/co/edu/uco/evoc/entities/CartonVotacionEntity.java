package co.edu.uco.evoc.entities;

import java.util.List;
import java.util.UUID;

public final class CartonVotacionEntity {
	
	private UUID identificador;
	private List<CandidatoEntity> candidatos;
	private EleccionEntity eleccion;

	
	public CartonVotacionEntity(UUID identificador, List<CandidatoEntity> candidato, EleccionEntity eleccion) {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final List<CandidatoEntity> getCandidatos() {
		return candidatos;
	}
	private final void setCandidatos(final List<CandidatoEntity> candidatos) {
		this.candidatos = candidatos;
	}
	public final EleccionEntity getEleccion() {
		return eleccion;
	}
	private final void setEleccion(final EleccionEntity eleccion) {
		this.eleccion = eleccion;
	}
	
	

}
