package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class CandidatoEntity extends PersonaEntity{
	
	private static final CandidatoEntity DEFAULT_OBJECT = new CandidatoEntity();
	private TipoCandidatoEntity tipoCandidato;
	private PartidoEntity partido;
	
	private CandidatoEntity() {
		super();
		setTipoCandidato(TipoCandidatoEntity.getDefaultObject());
		setPartido(PartidoEntity.getDefaultObject());
	}
	
	public CandidatoEntity(final UUID identificador, final TipoIdentificacionEntity tipoIdentificacion, final String identificacion,
			final String nombre,final String apellido, final TipoCandidatoEntity tipoCandidato, final PartidoEntity partido) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoCandidato(tipoCandidato);
		setPartido(partido);
		
	}
	
	public static final  CandidatoEntity createWithTipoCandidato(final TipoCandidatoEntity tipoCandidato) {
		return new CandidatoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), tipoCandidato, PartidoEntity.getDefaultObject());
	}
	
	public static final  CandidatoEntity createWithPartido(final PartidoEntity partido) {
		return new CandidatoEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), TipoCandidatoEntity.getDefaultObject(), partido);
	}
	
	
	public static CandidatoEntity getDefaultObject() {
		return DEFAULT_OBJECT;
	}

	public final TipoCandidatoEntity getTipoCandidato() {
		return tipoCandidato;
	}
	private final void setTipoCandidato(final TipoCandidatoEntity tipoCandidato) {
		this.tipoCandidato = UtilObject.getDefault(tipoCandidato, TipoCandidatoEntity.getDefaultObject());
	}
	public final PartidoEntity getPartido() {
		return partido;
	}
	private final void setPartido(final PartidoEntity partido) {
		this.partido = UtilObject.getDefault(partido, PartidoEntity.getDefaultObject());
	}

}
