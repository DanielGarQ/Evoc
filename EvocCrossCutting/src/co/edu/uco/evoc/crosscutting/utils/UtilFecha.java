package co.edu.uco.evoc.crosscutting.utils;


public final class UtilFecha {
	
	public static final String DEFAULT_FECHA= "2023-06-01 05:12:26";
	private static final String FECHA_RE = "[0-9]{4}[-][0-1][0-9][-][0-3][0-9][\" \"][0-9]{2}[:][0-9]{2}[:][0-9]{2}";
	
	private UtilFecha(){
		super();
	}
	
	
	public static final boolean fechaIsValid(final String fechaValue) {
		return (UtilText.getUtilText().matchPattern(fechaValue, FECHA_RE));
	}
	
	public static final String getDefault(final String fechaValue) {
		return !UtilObject.isNull(fechaValue) && fechaIsValid(fechaValue) ?  fechaValue : DEFAULT_FECHA;
	}
	
	public static final boolean isDefault(final String telefonoValue) {
		return DEFAULT_FECHA.equals(getDefault(telefonoValue));
	}
	

}
