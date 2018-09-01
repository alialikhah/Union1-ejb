package Exceptions;

public class MerchantSsnException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MerchantSsnException() {
System.err.println("Ssn Error");
	}
	
	@Override
	public void printStackTrace() {
		System.err.println("Ssn error");
	}
	

}
