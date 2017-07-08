package domain.exception;

public class InvalidCantException extends Exception{
	public InvalidCantException() {
        super("The cant cannot be less than or equal to zero");
    }
}
