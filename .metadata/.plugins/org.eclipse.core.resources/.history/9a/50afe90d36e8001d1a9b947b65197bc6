package co.edu.uco.evoc.dto;

import java.util.Date;
import java.util.UUID;

public final class VotanteRegistradoDTO extends PersonaDTO{
	
	private MesaVotacionDTO mesaVotacion;
	private Date fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	
	public VotanteRegistradoDTO() {
		super();
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}
	
	public VotanteRegistradoDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final MesaVotacionDTO mesaVotacion, final Date fechaExpedicionIdentificacion,
			final boolean validacionDactilar) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final VotanteRegistradoDTO setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
		return this;
	}
	public final Date getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	public final VotanteRegistradoDTO setFechaExpedicionIdentificacion(final Date fechaExpedicionIdentificacion) {
		this.fechaExpedicionIdentificacion = fechaExpedicionIdentificacion;
		return this;
	}
	public final boolean isValidacionDactilar() {
		return validacionDactilar;
	}
	public final VotanteRegistradoDTO setValidacionDactilar(final boolean validacionDactilar) {
		this.validacionDactilar = validacionDactilar;
		return this;
	}


}
