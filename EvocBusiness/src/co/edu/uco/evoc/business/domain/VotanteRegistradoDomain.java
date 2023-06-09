package co.edu.uco.evoc.business.domain;

import java.util.UUID;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public class VotanteRegistradoDomain extends PersonaDomain {
	
	private static final VotanteRegistradoDomain DEFAULT_OBJECT = new VotanteRegistradoDomain();
	private MesaVotacionDomain mesaVotacion;
	private String fechaExpedicionIdentificacion;
	private boolean validacionDactilar;
	private CartonesPorMesaDomain cartonVotacion;
	
	private VotanteRegistradoDomain() {
		super();
		setMesaVotacion(MesaVotacionDomain.getDefaultObject());
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(CartonesPorMesaDomain.getDefaultObject());
		
	}

	public VotanteRegistradoDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String identificacion,
			String nombre, String apellido, MesaVotacionDomain mesaVotacion, String fechaExpedicionIdentificacion,
			boolean validacionDactilar, CartonesPorMesaDomain cartonVotacion) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setMesaVotacion(mesaVotacion);
		setFechaExpedicionIdentificacion(fechaExpedicionIdentificacion);
		setValidacionDactilar(validacionDactilar);
		setCartonVotacion(cartonVotacion);
	}
	
	public static VotanteRegistradoDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}
	
	public final MesaVotacionDomain getMesaVotacion() {
		return mesaVotacion;
	}
	private final void setMesaVotacion(final MesaVotacionDomain mesaVotacion) {
		this.mesaVotacion = UtilObject.getDefault(mesaVotacion, MesaVotacionDomain.getDefaultObject());
	}
	public final String getFechaExpedicionIdentificacion() {
		return fechaExpedicionIdentificacion;
	}
	private final void setFechaExpedicionIdentificacion(final String fechaExpedicionIdentificacion) {
		this.fechaExpedicionIdentificacion = fechaExpedicionIdentificacion;
	}
	public final boolean isValidacionDactilar() {
		return validacionDactilar;
	}
	private final void setValidacionDactilar(final boolean validacionDactilar) {
		this.validacionDactilar = validacionDactilar;
	}

	public CartonesPorMesaDomain getCartonVotacion() {
		return cartonVotacion;
	}

	public void setCartonVotacion(CartonesPorMesaDomain cartonVotacion) {
		this.cartonVotacion = UtilObject.getDefault(cartonVotacion, CartonesPorMesaDomain.getDefaultObject());
	}

}

