package co.edu.uco.evoc.entities;

import java.util.UUID;

import co.edu.uco.evoc.crosscutting.utils.UtilCorreo;
import co.edu.uco.evoc.crosscutting.utils.UtilFecha;
import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilTelefono;
import co.edu.uco.evoc.crosscutting.utils.UtilText;
import co.edu.uco.evoc.crosscutting.utils.UtilUUID;

public class RegistradorEntity extends PersonaEntity {
	
	private static final RegistradorEntity DEFAULT_OBJECT = new RegistradorEntity();
	private TipoRegistradorEntity tipoRegistrador;
	private RegistraduriaEntity registraduria;
	private String telefono;
	private String correo;
	private String fechaInicialCargo;
	private String fechaFinalCargo;
	private EstadoRegistradorEntity estadoRegistrador;
	
	private RegistradorEntity() {
		super();
		setTipoRegistrador(TipoRegistradorEntity.getDefaultObject());
		setRegistraduria(RegistraduriaEntity.getDefaultObject());
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(EstadoRegistradorEntity.getdefaultObject());
	}
	
	public RegistradorEntity(UUID identificador, TipoIdentificacionEntity tipoIdentificacion, String identificacion,
			String nombre, String apellido,TipoRegistradorEntity tipoRegistrador, RegistraduriaEntity registraduria, String telefono,
			String correo, String fechaInicialCargo, String fechaFinalCargo, EstadoRegistradorEntity estadoRegistrador) {
		super(identificador, tipoIdentificacion, identificacion, nombre, apellido);
		setTipoRegistrador(tipoRegistrador);
		setRegistraduria(registraduria);
		setTelefono(telefono);
		setCorreo(correo);
		setFechaInicialCargo(fechaInicialCargo);
		setFechaFinalCargo(fechaFinalCargo);
		setEstadoRegistrador(estadoRegistrador);
	}
	
	public static final  RegistradorEntity createWithTipoRegistrador(final TipoRegistradorEntity tipoRegistrador) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),tipoRegistrador, RegistraduriaEntity.getDefaultObject(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO, UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithTipoRegistraduria(final RegistraduriaEntity registraduria) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), registraduria,UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO, UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithTelefono(final String telefono) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), RegistraduriaEntity.getDefaultObject(),telefono, UtilCorreo.DEFAULT_CORREO, UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithCorreo(final String correo) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), RegistraduriaEntity.getDefaultObject(),UtilTelefono.DEFAULT_TELEFONO, correo, UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithFechaInicialcargo(final String fechaInicialCargo) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), RegistraduriaEntity.getDefaultObject(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO , fechaInicialCargo, UtilFecha.DEFAULT_FECHA, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithFechaFinalcargo(final String fechaFinalCargo) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), RegistraduriaEntity.getDefaultObject(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO , UtilFecha.DEFAULT_FECHA, fechaFinalCargo, EstadoRegistradorEntity.getdefaultObject());
	}
	
	public static final  RegistradorEntity createWithEstadoRegistrador(final EstadoRegistradorEntity estadoRegistrador) {
		return new RegistradorEntity(UtilUUID.DEFAULT_UUID, TipoIdentificacionEntity.getDefaultObject(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(), UtilText.getUtilText().getDefaultValue(),TipoRegistradorEntity.getDefaultObject(), RegistraduriaEntity.getDefaultObject(),UtilTelefono.DEFAULT_TELEFONO, UtilCorreo.DEFAULT_CORREO , UtilFecha.DEFAULT_FECHA, UtilFecha.DEFAULT_FECHA, estadoRegistrador);
	}
	
	public static RegistradorEntity getDefaultobject() {
		return DEFAULT_OBJECT;
	}
	
	public final TipoRegistradorEntity getTipoRegistrador() {
		return tipoRegistrador;
	}
	private final void setTipoRegistrador(final TipoRegistradorEntity tipoRegistrador) {
		this.tipoRegistrador = UtilObject.getDefault(tipoRegistrador, TipoRegistradorEntity.getDefaultObject());
	}
	public final RegistraduriaEntity getRegistraduria() {
		return registraduria;
	}
	private final void setRegistraduria(final RegistraduriaEntity registraduria) {
		this.registraduria = UtilObject.getDefault(registraduria, RegistraduriaEntity.getDefaultObject());
	}
	public final String getTelefono() {
		return telefono;
	}
	private final void setTelefono(final String telefono) {
		this.telefono = telefono;
	}
	public final String getCorreo() {
		return correo;
	}
	private final void setCorreo(final String correo) {
		this.correo = correo;
	}
	public final String getFechaInicialCargo() {
		return fechaInicialCargo;
	}
	private final void setFechaInicialCargo(final String fechaInicialCargo) {
		this.fechaInicialCargo = fechaInicialCargo;
	}
	public final String getFechaFinalCargo() {
		return fechaFinalCargo;
	}
	private final void setFechaFinalCargo(final String fechaFinalCargo) {
		this.fechaFinalCargo = fechaFinalCargo;
	}
	public final EstadoRegistradorEntity getEstadoRegistrador() {
		return estadoRegistrador;
	}
	private final void setEstadoRegistrador(final EstadoRegistradorEntity estadoRegistrador) {
		this.estadoRegistrador = UtilObject.getDefault(estadoRegistrador, EstadoRegistradorEntity.getdefaultObject());
	}

}
