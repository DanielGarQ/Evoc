package co.edu.uco.evoc.api.validator;

import java.util.List;
import java.util.ArrayList;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;
import co.edu.uco.evoc.crosscutting.utils.UtilText;

public final class Result {
	
private List<String> messages;
	
	private Result(final List<String> messages) {
		setMessages(messages);
	}
	
	public static Result create() {
		return new Result(new ArrayList<>());
	}
	
	public static Result create(final List<String> messages) {
		return new Result(new ArrayList<>());
	}

	private final void setMessages(final List<String> messages) {
		this.messages = UtilObject.getDefault(messages, new ArrayList<>());
	}
	
	public void addMessage(String message) {
		if(!UtilText.getUtilText().isEmpty(message)) {
			messages.add(UtilText.getUtilText().applyTrim(message));
		}
	}
	
	public final void addMessages(final List<String> messages) {
		getMessages().addAll(UtilObject.getDefault(messages, new ArrayList<>()));
	}

	public final boolean isValid() {
		return messages.isEmpty();
	}

	public final List<String> getMessages() {
		return messages;
	}
	

}
