package assessment;

public class NegativeIntException extends Exception {

	public NegativeIntException(String message) {
		super(message);
	}
	public NegativeIntException() {
		super("Negative Input");
	}
}
