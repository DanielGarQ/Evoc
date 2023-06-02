package co.edu.uco.evoc.crosscutting.utils;

public final class UtilCorreo {
	
	public static final String DEFAULT_CORREO = "";
	private static final String CORREO_RE = "[+][0-9]{2}[0-9]{10}";
	
	private UtilCorreo(){
		super();
	}
	

	public static final boolean correoIsValid(final String correoValue) {
		return (UtilText.getUtilText().matchPattern(correoValue, CORREO_RE));
	}
	
	public static final String getDefault(final String correoValue) {
		return !UtilObject.isNull(correoValue) && correoIsValid(correoValue)? correoValue : DEFAULT_CORREO;
	}
	
	public static final boolean isDefault(final String correoValue) {
		return DEFAULT_CORREO.equals(getDefault(correoValue));
	}
	
}
