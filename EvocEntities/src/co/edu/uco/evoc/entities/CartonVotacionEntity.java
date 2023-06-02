package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonVotacionEntity {
	
	private static final CartonVotacionEntity DEFAULT_OBJECT = new CartonVotacionEntity();
	private UUID identificador;
	private CandidatoEntity candidatos;
	private EleccionEntity eleccion;

	private CartonVotacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setCandidatos(CandidatoEntity.getDefaultObject());
		setEleccion(EleccionEntity.getDefaultObject());
	}
	
	public CartonVotacionEntity(final UUID identificador, final CandidatoEntity candidatos, final EleccionEntity eleccion) {
		super();
		setIdentificador(identificador);
		setCandidatos(candidatos);
		setEleccion(eleccion);
	}
	
	public static final  CartonVotacionEntity createWithIdentificador(final UUID identificador) {
		return new CartonVotacionEntity(identificador, CandidatoEntity.getDefaultObject(), EleccionEntity.getDefaultObject());
	}
	
	public static final  CartonVotacionEntity createWithCandidatos(final CandidatoEntity candidatos) {
		return new CartonVotacionEntity(UtilUUID.DEFAULT_UUID, candidatos, EleccionEntity.getDefaultObject());
	}
	
	public static final  CartonVotacionEntity createWithEleccion(final EleccionEntity eleccion) {
		return new CartonVotacionEntity(UtilUUID.DEFAULT_UUID, CandidatoEntity.getDefaultObject(), eleccion);
	}
	
	public static CartonVotacionEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final CandidatoEntity getCandidatos() {
		return candidatos;
	}
	private final void setCandidatos(final CandidatoEntity candidatos) {
		this.candidatos = UtilObject.getDefault(candidatos, CandidatoEntity.getDefaultObject());
	}
	public final EleccionEntity getEleccion() {
		return eleccion;
	}
	private final void setEleccion(final EleccionEntity eleccion) {
		this.eleccion = UtilObject.getDefault(eleccion, EleccionEntity.getDefaultObject());
	}
	
	

}
