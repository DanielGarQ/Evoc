package co.edu.uco.evoc.dto;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class VotanteRegistradoDTO extends PersonaDTO{
	
	private MesaVotacionDTO mesaVotacion;
	private String fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	private CartonesPorMesaDTO cartonVotacion;
	
	public VotanteRegistradoDTO() {
		super();
		setMesaVotacion(MesaVotacionDTO.create());
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(CartonesPorMesaDTO.create());
	}
	
	public VotanteRegistradoDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final MesaVotacionDTO mesaVotacion, final String fechaExpedicionIdentificacion,
			final boolean validacionDactilar, CartonesPorMesaDTO cartonVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(cartonVotacion);
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
	public final String getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	public final VotanteRegistradoDTO setFechaExpedicionIdentificacion(final String fechaExpedicionIdentificacion) {
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

	public CartonesPorMesaDTO getCartonVotacion() {
		return cartonVotacion;
	}

	public VotanteRegistradoDTO setCartonVotacion(CartonesPorMesaDTO cartonVotacion) {
		this.cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonesPorMesaDTO.create());
		return this;
	}


}
