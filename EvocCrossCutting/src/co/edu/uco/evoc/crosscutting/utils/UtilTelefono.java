package co.edu.uco.evoc.crosscutting.utils;

import java.util.UUID;

public final class UtilTelefono {
	
	private static final UtilTelefono INSTANCE = new UtilTelefono();
	public static final String DEFAULT_TELEFONO = "";
	private static final String UUID_RE = "[+][0-9]{2}([0-9]{3}){2}[0-9]{4}";
	
	private UtilTelefono() {
		super();
	}
	
	public static final UtilTelefono getUtilTelefono() {
		return INSTANCE;
	}
	
	public static final boolean telefonoIsValid(final String uuidValue) {
		return (UtilText.getUtilText().matchPattern(uuidValue, UUID_RE));
	}
	
	public static final String getDefault(final String TelefonoValue) {
		return UtilObject.isNull(TelefonoValue) ? DEFAULT_TELEFONO : TelefonoValue;
	}
}
