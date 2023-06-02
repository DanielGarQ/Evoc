package co.edu.uco.evoc.crosscutting.utils;

public final class UtilTelefono {
	
	public static final String DEFAULT_TELEFONO= "0000000000";
	private static final String TELEFONO_RE = "[+][0-9]{2}[0-9]{10}";
	
	private UtilTelefono(){
		super();
	}
	
	
	public static final boolean telefonoIsValid(final String telefonoValue) {
		return (UtilText.getUtilText().matchPattern(telefonoValue, TELEFONO_RE));
	}
	
	public static final String getDefault(final String telefonoValue) {
		return !UtilObject.isNull(telefonoValue) && telefonoIsValid(telefonoValue) ?  telefonoValue : DEFAULT_TELEFONO;
	}
	
	public static final boolean isDefault(final String telefonoValue) {
		return DEFAULT_TELEFONO.equals(getDefault(telefonoValue));
	}

}
