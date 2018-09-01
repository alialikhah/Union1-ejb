package Exceptions;

public class MerchantRegisterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void printStackTrace() {
		System.err.println("this is merchant exception and there is a null value");
	}

}
