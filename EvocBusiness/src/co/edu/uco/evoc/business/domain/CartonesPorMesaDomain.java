package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public final class CartonesPorMesaDomain {
	
	private static final CartonesPorMesaDomain DEFAULT_OBJECT = new CartonesPorMesaDomain();
	private UUID identificador;
	private MesaVotacionDomain mesaVotacion;
	private CartonVotacionDomain cartonVotacion;
	private VotanteRegistradoDomain votante;
	private boolean marcacion;
	
	private CartonesPorMesaDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setMesaVotacion(MesaVotacionDomain.getDefaultObject());
		setCartonVotacion(CartonVotacionDomain.getDefaultObject());
		setVotante(VotanteRegistradoDomain.getDefaultObject());
		setMarcacion(marcacion);
	}
	
	public CartonesPorMesaDomain(final UUID identificador, final MesaVotacionDomain mesaVotacion, final CartonVotacionDomain cartonVotacion,
			final VotanteRegistradoDomain votante, final boolean marcacion) {
		super();
		setIdentificador(identificador);
		setMesaVotacion(mesaVotacion);
		setCartonVotacion(cartonVotacion);
		setVotante(votante);
		setMarcacion(marcacion);
	}
	
	public static CartonesPorMesaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	public final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionDomain.getDefaultObject());
	}
	public final CartonVotacionDomain getCartonVotacion() {
		return cartonVotacion;
	}
	public final void setCartonVotacion(final CartonVotacionDomain cartonVotacion) {
		this.cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonVotacionDomain.getDefaultObject());
	}
	public final VotanteRegistradoDomain getVotante() {
		return votante;
	}
	public final void setVotante(final VotanteRegistradoDomain votante) {
		this.votante = UtilObject.getDefault(votante, VotanteRegistradoDomain.getDefaultObject());
	}
	public final boolean isMarcacion() {
		return marcacion;
	}
	public final void setMarcacion(final boolean marcacion) {
		this.marcacion = marcacion;
	}
	
	

}
