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
	
	public CandidatoDTO(final UUID identificador, final TipoIdentificacionDTO tipoIdentificacion, final String identificacion,
			final String nombre, final String apellido, final TipoCandidatoDTO tipoCandidato, final PartidoDTO partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	
	public static CandidatoDTO create() {
		return new CandidatoDTO();
	}
	
	public final TipoCandidatoDTO getTipoCandidato() {
		return tipoCandidato;
	}
	public final CandidatoDTO setTipoCandidato(final TipoCandidatoDTO tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
		return this;
	}
	public final PartidoDTO getPartido() {
		return partido;
	}
	public final CandidatoDTO setPartido(final PartidoDTO partido) {
		this.partido = partido;
		return this;
	}

	

}
