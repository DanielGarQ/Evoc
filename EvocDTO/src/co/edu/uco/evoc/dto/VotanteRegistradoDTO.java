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
	
	public VotanteRegistradoDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String identificacion,
			String nombre, String apellido, MesaVotacionDTO mesaVotacion, Date fechaExpedicionIdentificacion,
			boolean validacionDactilar) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
	}
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final void setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = mesaVotacion;
	}
	public final Date getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	public final void setFechaExpedicionIdentificacion(final Date fechaExpedicionIdentificacion) {
		this.fechaExpedicionIdentificacion = fechaExpedicionIdentificacion;
	}
	public final boolean isValidacionDactilar() {
		return validacionDactilar;
	}
	public final void setValidacionDactilar(final boolean validacionDactilar) {
		this.validacionDactilar = validacionDactilar;
	}
	
	
	

}
