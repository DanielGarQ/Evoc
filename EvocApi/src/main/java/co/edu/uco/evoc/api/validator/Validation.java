package co.edu.uco.evoc.api.validator;

public interface Validation<T> {
	
	Result execute(T data);

}
