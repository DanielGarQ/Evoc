package co.edu.uco.evoc.entities;

import java.util.UUID;

public class CandidatoEntity extends PersonaEntity{
	
	private TipoCandidatoEntity tipoCandidato;
	private PartidoEntity partido;
	
	public CandidatoEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido, TipoCandidatoEntity tipoCandidato, PartidoEntity partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	public final TipoCandidatoEntity getTipoCandidato() {
		return tipoCandidato;
	}
	private final void setTipoCandidato(final TipoCandidatoEntity tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}
	public final PartidoEntity getPartido() {
		return partido;
	}
	private final void setPartido(final PartidoEntity partido) {
		this.partido = partido;
	}

}
