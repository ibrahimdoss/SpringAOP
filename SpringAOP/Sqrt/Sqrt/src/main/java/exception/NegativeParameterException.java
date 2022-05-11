package exception;

public class NegativeParameterException extends Exception{
	
	private static String message = "Negative parameter passed: ";
	
	public NegativeParameterException(double number) {
		super(message + number);
	}
	
	//negatif sayı gecilirse diye var.

}
