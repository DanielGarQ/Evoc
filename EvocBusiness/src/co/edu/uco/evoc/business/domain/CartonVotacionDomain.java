package co.edu.uco.evoc.business.domain;

import java.util.List;
import java.util.UUID;

public final class CartonVotacionDomain {
	
	private UUID identificador;
	private List<CandidatoDomain> candidatos;
	private EleccionDomain eleccion;

	
	public CartonVotacionDomain(UUID identificador, List<CandidatoDomain> candidato, EleccionDomain eleccion) {
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
	public final List<CandidatoDomain> getCandidatos() {
		return candidatos;
	}
	private final void setCandidatos(final List<CandidatoDomain> candidatos) {
		this.candidatos = candidatos;
	}
	public final EleccionDomain getEleccion() {
		return eleccion;
	}
	private final void setEleccion(final EleccionDomain eleccion) {
		this.eleccion = eleccion;
	}
	
	

}