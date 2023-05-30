package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonVotacionDomain {
	
	private static final CartonVotacionDomain DEFAULT_OBJECT = new CartonVotacionDomain();
	private UUID identificador;
	private CandidatoDomain candidatos;
	private EleccionDomain eleccion;
	
	private CartonVotacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCandidatos(CandidatoDomain.getDefaultObject());
		setEleccion(EleccionDomain.getDefaultObject());
	}
	
	public CartonVotacionDomain(final UUID identificador, final CandidatoDomain candidatos, final EleccionDomain eleccion) {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	
	public static CartonVotacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CandidatoDomain getCandidatos() {
		return candidatos;
	}
	private final void setCandidatos(final CandidatoDomain candidatos) {
		this.candidatos = UtilObject.getDefault(candidatos, CandidatoDomain.getDefaultObject());
	}
	public final EleccionDomain getEleccion() {
		return eleccion;
	}
	private final void setEleccion(final EleccionDomain eleccion) {
		this.eleccion = UtilObject.getDefault(eleccion, EleccionDomain.getDefaultObject());
	}
	
	

}