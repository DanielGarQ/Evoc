package co.edu.uco.evoc.crosscutting.exception;

public final class EvocApiException extends EvocException{

	private static final long serialVersionUID = 8684272467947407021L;

	private EvocApiException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static EvocApiException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new EvocApiException(technicalMessage, userMessage, rootCause);
	}
	public static EvocApiException create(final String userMessage) {
		return new EvocApiException(userMessage, userMessage, new Exception());
	}
	public static EvocApiException create(final String technicalMessage, final String userMessage) {
		return new EvocApiException(technicalMessage, userMessage, new Exception());
	}

}
