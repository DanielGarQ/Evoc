package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class MesaVotacionEntity {
	
	private static final MesaVotacionEntity DEFAULT_OBJECT = new MesaVotacionEntity();
	private UUID identificador;
	private String numeroMesa;
	private String potencialElectoral;
	private LocacionEntity locacion;
	private EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado;
	
	private MesaVotacionEntity() {
		super();
		setIdentificador(UtilUUID.DEFAULT_UUID);
		setNumeroMesa(UtilText.getUtilText().getDefaultValue());
		setPotencialElectoral(UtilText.getUtilText().getDefaultValue());
		setLocacion(LocacionEntity.getDefaultObject());
		setEstadoMesaVotacionCalculado(EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}
	
	public MesaVotacionEntity(final UUID identificador, final String numeroMesa, final String potencialElectoral, final LocacionEntity locacion,
			final EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado) {
		super();
		setIdentificador(identificador);
		setNumeroMesa(numeroMesa);
		setPotencialElectoral(potencialElectoral);
		setLocacion(locacion);
		setEstadoMesaVotacionCalculado(estadoMesaVotacionCalculado);
	}
	
	public static final MesaVotacionEntity createWithIdentificador(final UUID identificador) {
		return new MesaVotacionEntity(identificador, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), LocacionEntity.getDefaultObject(), EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}
	
	public static final MesaVotacionEntity createWithNumeroMesa(final String numeroMesa) {
		return new MesaVotacionEntity(UtilUUID.DEFAULT_UUID, numeroMesa, UtilText.getUtilText().getDefaultValue(), LocacionEntity.getDefaultObject(), EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}
	
	public static final MesaVotacionEntity createWithPotencialElectoral(final String potencialElectoral) {
		return new MesaVotacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), potencialElectoral, LocacionEntity.getDefaultObject(), EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}
	
	public static final MesaVotacionEntity createWithLocacion(final LocacionEntity locacion) {
		return new MesaVotacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), locacion, EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}
	
	public static final MesaVotacionEntity createWithEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado) {
		return new MesaVotacionEntity(UtilUUID.DEFAULT_UUID, UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),LocacionEntity.getDefaultObject() , estadoMesaVotacionCalculado);
	}
	
	public static MesaVotacionEntity getDefaultObject() {
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
	public final String getPotencialElectoral() {
		return potencialElectoral;
	}
	private final void setPotencialElectoral(final String potencialElectoral) {
		this.potencialElectoral = UtilText.getUtilText().getDefaultValue();
	}
	public final LocacionEntity getLocacion() {
		return locacion;
	}
	private final void setLocacion(final LocacionEntity locacion) {
		this.locacion = UtilObject.getDefault(locacion, LocacionEntity.getDefaultObject());
	}
	public final EstadoMesaVotacionCalculadoEntity getEstadoMesaVotacionCalculado() {
		return estadoMesaVotacionCalculado;
	}
	private final void setEstadoMesaVotacionCalculado(final EstadoMesaVotacionCalculadoEntity estadoMesaVotacionCalculado) {
		this.estadoMesaVotacionCalculado = UtilObject.getDefault(estadoMesaVotacionCalculado, EstadoMesaVotacionCalculadoEntity.getDefaultObject());
	}

}
