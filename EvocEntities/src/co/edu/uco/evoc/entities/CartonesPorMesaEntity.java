package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonesPorMesaEntity {
	
	private static final CartonesPorMesaEntity DEFAULT_OBJECT = new CartonesPorMesaEntity();
	private UUID identificador;
	private MesaVotacionEntity mesaVotacion;
	private CartonVotacionEntity cartonVotacion;
	private VotanteRegistradoEntity votante;
	private boolean marcacion;
	
	public CartonesPorMesaEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setMesaVotacion(MesaVotacionEntity.getDefaultObject());
		setCartonVotacion(CartonVotacionEntity.getDefaultObject());
		setVotante(VotanteRegistradoEntity.getDefaultObject());
		setMarcacion(marcacion);
	}
	
	public CartonesPorMesaEntity(final UUID identificador, final MesaVotacionEntity mesaVotacion, final CartonVotacionEntity cartonVotacion,
			final VotanteRegistradoEntity votante, final boolean marcacion) {
		super();
		setIdentificador(identificador);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	
	public static CartonesPorMesaEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final MesaVotacionEntity getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionEntity.getDefaultObject());
	}
	public final CartonVotacionEntity getCartonVotacion() {
		return cartonVotacion;
	}
	private final void setCartonVotacion(final CartonVotacionEntity cartonVotacion) {
		this.cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonVotacionEntity.getDefaultObject());
	}
	public final VotanteRegistradoEntity getVotante() {
		return votante;
	}
	private final void setVotante(final VotanteRegistradoEntity votante) {
		this.votante = UtilObject.getDefault(votante, VotanteRegistradoEntity.getDefaultObject());
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	private final void setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
	}
	
	

}
