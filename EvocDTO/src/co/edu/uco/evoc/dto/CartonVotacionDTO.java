package co.edu.uco.evoc.dto;

import java.util.List;
import java.util.UUID;

public final class CartonVotacionDTO {
	
	private UUID identificador;
	private List<CandidatoDTO> candidatos;
	private EleccionDTO eleccion;
	
	public CartonVotacionDTO() {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	
	public CartonVotacionDTO(UUID identificador, List<CandidatoDTO> candidato, EleccionDTO eleccion) {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = identificador;
	}
	public final List<CandidatoDTO> getCandidatos() {
		return candidatos;
	}
	public final void setCandidatos(final List<CandidatoDTO> candidatos) {
		this.candidatos = candidatos;
	}
	public final EleccionDTO getEleccion() {
		return eleccion;
	}
	public final void setEleccion(final EleccionDTO eleccion) {
		this.eleccion = eleccion;
	}
	
	

}
