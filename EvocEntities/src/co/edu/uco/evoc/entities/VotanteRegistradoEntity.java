package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class VotanteRegistradoEntity extends PersonaEntity{
	
	private static final VotanteRegistradoEntity DEFAULT_OBJECT = new VotanteRegistradoEntity();
	private MesaVotacionEntity mesaVotacion;
	private Date fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	
	private VotanteRegistradoEntity() {
		super();
		setMesaVotacion(MesaVotacionEntity.getDefaultObject());
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}

	public VotanteRegistradoEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido, MesaVotacionEntity mesaVotacion, Date fechaExpedicionIdentificacion,
			boolean validacionDactilar) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}
	
	public static final  VotanteRegistradoEntity createWithMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		return new VotanteRegistradoEntity(mesaVotacion, fechaExpedicionIdentificacion, validacionDactilar);
	}
	
	public static final  VotanteRegistradoEntity createWithFechaExpedicionIdentificacion(final Date fechaExpedicionIdentificacion) {
		return new VotanteRegistradoEntity(MesaVotacionEntity.getDefaultObject(), fechaExpedicionIdentificacion, validacionDactilar);
	}
	
	public static final  VotanteRegistradoEntity createWithValidacionDactilar(final boolean validacionDactilar) {
		return new VotanteRegistradoEntity(MesaVotacionEntity.getDefaultObject(), fechaExpedicionIdentificacion, validacionDactilar);
	}
	
	public static VotanteRegistradoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final MesaVotacionEntity getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionEntity.getDefaultObject());
	}
	public final Date getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	private final void setFechaExpedicionIdentificacion(final Date fechaExpedicionIdentificacion) {
		this.fechaExpedicionIdentificacion = fechaExpedicionIdentificacion;
	}
	public final boolean isValidacionDactilar() {
		return validacionDactilar;
	}
	private final void setValidacionDactilar(final boolean validacionDactilar) {
		this.validacionDactilar = validacionDactilar;
	}

}
