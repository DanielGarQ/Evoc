package co.edu.uco.evoc.dto;

import java.util.UUID;

public final class CandidatoDTO extends PersonaDTO {
	
	private TipoCandidatoDTO tipoCandidato;
	private PartidoDTO partido;
	
	public CandidatoDTO() {
		super();
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
	}
	
	public CandidatoDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion, String identificacion,
			String nombre, String apellido, TipoCandidatoDTO tipoCandidato, PartidoDTO partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	public final TipoCandidatoDTO getTipoCandidato() {
		return tipoCandidato;
	}
	public final void setTipoCandidato(final TipoCandidatoDTO tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}
	public final PartidoDTO getPartido() {
		return partido;
	}
	public final void setPartido(final PartidoDTO partido) {
		this.partido = partido;
	}
	
	

}
