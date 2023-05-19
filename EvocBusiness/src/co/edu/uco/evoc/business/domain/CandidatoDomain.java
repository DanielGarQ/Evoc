package co.edu.uco.evoc.business.domain;

import java.util.UUID;

public class CandidatoDomain extends PersonaDomain{
	
	private TipoCandidatoDomain tipoCandidato;
	private PartidoDomain partido;
	
	public CandidatoDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido, TipoCandidatoDomain tipoCandidato, PartidoDomain partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	public final TipoCandidatoDomain getTipoCandidato() {
		return tipoCandidato;
	}
	private final void setTipoCandidato(final TipoCandidatoDomain tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}
	public final PartidoDomain getPartido() {
		return partido;
	}
	private final void setPartido(final PartidoDomain partido) {
		this.partido = partido;
	}

}
