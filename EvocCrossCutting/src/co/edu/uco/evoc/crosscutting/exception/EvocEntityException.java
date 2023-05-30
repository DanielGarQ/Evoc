package co.edu.uco.evoc.crosscutting.exception;

public final class EvocEntityException extends EvocException{

	private static final long serialVersionUID = -7619443673832655497L;
	
	private EvocEntityException(String technicalMessage, String userMessage, Throwable rootCause) {
		super(technicalMessage, userMessage, rootCause, ExceptionType.API);
	}
	
	public static EvocEntityException create(final String technicalMessage, final String userMessage, final Throwable rootCause) {
		return new EvocEntityException(technicalMessage, userMessage, rootCause);
	}
	public static EvocEntityException create(final String userMessage) {
		return new EvocEntityException(userMessage, userMessage, new Exception());
	}
	public static EvocEntityException create(final String technicalMessage, final String userMessage) {
		return new EvocEntityException(technicalMessage, userMessage, new Exception());
	}

}
