package co.edu.uco.evoc.entities;

import java.util.Date;
import java.util.UUID;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public class VotanteRegistradoEntity extends PersonaEntity{
	
	private static final VotanteRegistradoEntity DEFAULT_OBJECT = new VotanteRegistradoEntity();
	private MesaVotacionEntity mesaVotacion;
	private Date fechaExpedicionIdentificacion;
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
			String nombre, String apellido, MesaVotacionEntity mesaVotacion, Date fechaExpedicionIdentificacion,
			boolean validacionDactilar, CartonesPorMesaEntity cartonVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(cartonVotacion);
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

	public CartonesPorMesaEntity getCartonVotacion() {
		return cartonVotacion;
	}

	public void setCartonVotacion(CartonesPorMesaEntity cartonVotacion) {
		cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonesPorMesaEntity.getDefaultObject());
	}

}
