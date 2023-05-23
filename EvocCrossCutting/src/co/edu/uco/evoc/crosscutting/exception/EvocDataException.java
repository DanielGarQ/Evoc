package co.edu.uco.evoc.crosscutting.exception;

public final class EvocDataException extends EvocException{

	private static final long serialVersionUID = -5203808137334096879L;
	
	private EvocDataException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static EvocDataException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new EvocDataException(technicalMessage, userMessage, rootCause);
	}
	public static EvocDataException create(final String userMessage) {
		return new EvocDataException(userMessage, userMessage, new Exception());
	}
	public static EvocDataException create(final String technicalMessage, final String userMessage) {
		return new EvocDataException(technicalMessage, userMessage, new Exception());
	}

}
