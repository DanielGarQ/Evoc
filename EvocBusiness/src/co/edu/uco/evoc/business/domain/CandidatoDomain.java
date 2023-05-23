package co.edu.uco.evoc.business.domain;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public class CandidatoDomain extends PersonaDomain{
	
	private static final CandidatoDomain DEFAULT_OBJECT = new CandidatoDomain();
	private TipoCandidatoDomain tipoCandidato;
	private PartidoDomain partido;
	
	private CandidatoDomain() {
		super();
		setTipoCandidato(TipoCandidatoDomain.getDefaultObject());
		setPartido(PartidoDomain.getDefaultObject());
	}
	
	public CandidatoDomain(final UUID identificador, final TipoIdentificacionDomain tipoIdentificacion, final String identificacion,
			final String nombre,final String apellido, final TipoCandidatoDomain tipoCandidato, final PartidoDomain partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	
	public static CandidatoDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final TipoCandidatoDomain getTipoCandidato() {
		return tipoCandidato;
	}
	private final void setTipoCandidato(final TipoCandidatoDomain tipoCandidato) {
		this.tipoCandidato = UtilObject.getDefault(tipoCandidato, TipoCandidatoDomain.getDefaultObject());
	}
	public final PartidoDomain getPartido() {
		return partido;
	}
	private final void setPartido(final PartidoDomain partido) {
		this.partido = UtilObject.getDefault(partido, PartidoDomain.getDefaultObject());
	}

}
