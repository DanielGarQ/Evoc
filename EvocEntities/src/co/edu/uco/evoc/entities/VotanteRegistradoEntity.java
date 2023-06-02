package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilFecha;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;
import co.edu.uco.evoc.crosscutting.utils.UtilValidacion;

public class VotanteRegistradoEntity extends PersonaEntity{
	
	private static final VotanteRegistradoEntity DEFAULT_OBJECT = new VotanteRegistradoEntity();
	private MesaVotacionEntity mesaVotacion;
	private String fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	private CartonesPorMesaEntity cartonVotacion;
	
	private VotanteRegistradoEntity() {
		super();
		setMesaVotacion(MesaVotacionEntity.getDefaultObject());
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(CartonesPorMesaEntity.getDefaultObject());
		
	}

	public VotanteRegistradoEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido, MesaVotacionEntity mesaVotacion, String fechaExpedicionIdentificacion,
			boolean validacionDactilar, CartonesPorMesaEntity cartonVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(cartonVotacion);
	}
	
	public static final  VotanteRegistradoEntity createWithMesaVotacion(final MesaVotacionEntity mesaVotacion) {
		return new VotanteRegistradoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), mesaVotacion, UtilFecha.DEFAULT_FECHA, UtilValidacion.DEFAULT_VALIDATION ,CartonesPorMesaEntity.getDefaultObject());
	}
	
	public static final  VotanteRegistradoEntity createWithFechaExpedicionIdentificacion(final String fechaExpedicionIdentificacion) {
		return new VotanteRegistradoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), MesaVotacionEntity.getDefaultObject(), fechaExpedicionIdentificacion, UtilValidacion.DEFAULT_VALIDATION ,CartonesPorMesaEntity.getDefaultObject());
	}
	
	public static final  VotanteRegistradoEntity createWithValidacionDactilar(final boolean validacionDactilar) {
		return new VotanteRegistradoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), MesaVotacionEntity.getDefaultObject(), UtilFecha.DEFAULT_FECHA, validacionDactilar ,CartonesPorMesaEntity.getDefaultObject());
	}
	
	public static final  VotanteRegistradoEntity createWithCartonVotacion(final CartonesPorMesaEntity cartonVotacion) {
		return new VotanteRegistradoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), MesaVotacionEntity.getDefaultObject(), UtilFecha.DEFAULT_FECHA, UtilValidacion.DEFAULT_VALIDATION ,cartonVotacion);
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
	public final String getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	private final void setFechaExpedicionIdentificacion(final String fechaExpedicionIdentificacion) {
		this.fechaExpedicionIdentificacion = fechaExpedicionIdentificacion;
	}
	public final boolean isValidacionDactilar() {
		return validacionDactilar;
	}
	private final void setValidacionDactilar(final boolean validacionDactilar) {
		this.validacionDactilar = validacionDactilar;
	}

	public CartonesPorMesaEntity getCartonVotacion() {
		return cartonVotacion;
	}

	public void setCartonVotacion(CartonesPorMesaEntity cartonVotacion) {
		cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonesPorMesaEntity.getDefaultObject());
	}

}
