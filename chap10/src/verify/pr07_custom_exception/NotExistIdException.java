package verify.pr07_custom_exception;

public class NotExistIdException extends Exception{
	public NotExistIdException() {}
	public NotExistIdException(String message) {
		
		super(message);
	}
}
