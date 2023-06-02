package co.edu.uco.evoc.crosscutting.utils;

public final class UtilValidacion {
	
	public static final Boolean DEFAULT_VALIDATION = false;
	
	public static final boolean getDefault(final Boolean validacion) {
		return !UtilObject.isNull(validacion) ?  validacion : DEFAULT_VALIDATION;
	}
	
	public static void main(String[] args) {
		System.out.println(UtilValidacion.getDefault(true));
	}

}
