package co.edu.uco.evoc.business.domain;

import java.util.Date;
import java.util.UUID;

public class VotanteRegistradoDomain extends PersonaDomain {
	
	private MesaVotacionDomain mesaVotacion;
	private Date fechaExpedicionIdentificacion;
	private boolean validacionDactilar;

	public VotanteRegistradoDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido, MesaVotacionDomain mesaVotacion, Date fechaExpedicionIdentificacion,
			boolean validacionDactilar) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
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

