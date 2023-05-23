package co.edu.uco.evoc.crosscutting.exception;

public final class EvocBusinessException extends EvocException{

	private static final long serialVersionUID = -5203808137334096879L;
	
	private EvocBusinessException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static EvocBusinessException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new EvocBusinessException(technicalMessage, userMessage, rootCause);
	}
	public static EvocBusinessException create(final String userMessage) {
		return new EvocBusinessException(userMessage, userMessage, new Exception());
	}
	public static EvocBusinessException create(final String technicalMessage, final String userMessage) {
		return new EvocBusinessException(technicalMessage, userMessage, new Exception());
	}

}
