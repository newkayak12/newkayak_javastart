package verify.pr07_custom_exception;

public class WrongPasswordException extends Exception {

		public WrongPasswordException() {}
		public WrongPasswordException(String message)	{
			super(message);
		}
}
