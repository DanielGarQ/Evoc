package co.edu.uco.evoc.dto;

import java.util.List;
import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonVotacionDTO {
	
	private UUID identificador;
	private CandidatoDTO candidatos;
	private EleccionDTO eleccion;
	
	public CartonVotacionDTO() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCandidatos(CandidatoDTO.create());
		setEleccion(EleccionDTO.create());
	}
	
	public CartonVotacionDTO(final UUID identificador,final CandidatoDTO candidatos, final EleccionDTO eleccion) {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	
	public static CartonVotacionDTO create() {
		return new CartonVotacionDTO();
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final CartonVotacionDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}
	public final CandidatoDTO getCandidatos() {
		return candidatos;
	}
	public final CartonVotacionDTO setCandidatos(final CandidatoDTO candidatos) {
		this.candidatos = UtilObject.getDefault(candidatos, CandidatoDTO.create());
		return this;
	}
	public final EleccionDTO getEleccion() {
		return eleccion;
	}
	public final CartonVotacionDTO setEleccion(final EleccionDTO eleccion) {
		this.eleccion = UtilObject.getDefault(eleccion, EleccionDTO.create());
		return this;
	}
}
