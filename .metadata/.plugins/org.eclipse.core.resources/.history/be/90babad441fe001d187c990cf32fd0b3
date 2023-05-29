package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class MesaVotacionDomain {
	
	private static final MesaVotacionDomain DEFAULT_OBJECT = new MesaVotacionDomain();
	private UUID identificador;
	private String numeroMesa;
	private int potencialElectoral;
	private LocacionDomain locacion;
	private EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado;
	
	private MesaVotacionDomain() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNumeroMesa(UtilText.getUtilText().getDefaultValue());
		setPotencialElectoral(potencialElectoral);
		setLocacion(LocacionDomain.getDefaultObject());
		setEstadoMesaVotacionCalculado(EstadoMesaVotacionCalculadoDomain.getDefaultObject());
	}
	
	public MesaVotacionDomain(final UUID identificador, final String numeroMesa, final int potencialElectoral, final LocacionDomain locacion,
			final EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado) {
		super();
		setIdentificador(identificador);
		setNumeroMesa(numeroMesa);
		setPotencialElectoral(potencialElectoral);
		setLocacion(locacion);
		setEstadoMesaVotacionCalculado(estadoMesaVotacionCalculado);
	}
	
	public static MesaVotacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	public final String getNumeroMesa() {
		return numeroMesa;
	}
	private final void setNumeroMesa(final String numeroMesa) {
		this.numeroMesa = UtilText.getUtilText().applyTrim(numeroMesa);
	}
	public final int getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final int potencialElectoral) {
		this.potencialElectoral = potencialElectoral;
	}
	public final LocacionDomain getLocacion() {
		return locacion;
	}
	private final void setLocacion(final LocacionDomain locacion) {
		this.locacion = UtilObject.getDefault(locacion, LocacionDomain.getDefaultObject());
	}
	public final EstadoMesaVotacionCalculadoDomain getEstadoMesaVotacionCalculado() {
		return estadoMesaVotacionCalculado;
	}
	private final void setEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoDomain estadoMesaVotacionCalculado) {
		this.estadoMesaVotacionCalculado = UtilObject.getDefault(estadoMesaVotacionCalculado, EstadoMesaVotacionCalculadoDomain.getDefaultObject());
	}

}
