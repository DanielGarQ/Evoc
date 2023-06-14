package co.edu.uco.evoc.api.controller.response;

import java.util.List;
import java.util.ArrayList;

import co.edu.uco.evoc.crosscutting.utils.UtilObject;

public final class Response<T> {
	
	private List<T> data;
	private List<String> messages;
	public Response(final List<T> data,final List<String> messages) {
		setData(data);
		setMessages(messages);
	}
	
	public Response() {
		super();
		setData(new ArrayList<>());
		setMessages(new ArrayList<>());
	}

	public final List<T> getData() {
		return data;
	}

	public final void setData(final List<T> data) {
		this.data = UtilObject.getDefault(data, new ArrayList<>());
	}

	public final List<String> getMessages() {
		return messages;
	}

	public final void setMessages(final List<String> messages) {
		this.messages = UtilObject.getDefault(messages, new ArrayList<>());
	}

}
