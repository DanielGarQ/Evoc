package co.edu.uco.evoc.dto;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class VotanteRegistradoDTO extends PersonaDTO{
	
	private MesaVotacionDTO mesaVotacion;
	private Date fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	
	public VotanteRegistradoDTO() {
		super();
		setMesaVotacion(MesaVotacionDTO.create());
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
	
	public static VotanteRegistradoDTO create() {
		return new VotanteRegistradoDTO();
	}
	
	public final MesaVotacionDTO getMesaVotacion() {
		return mesaVotacion;
	}
	public final VotanteRegistradoDTO setMesaVotacion(final MesaVotacionDTO mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionDTO.create());
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
