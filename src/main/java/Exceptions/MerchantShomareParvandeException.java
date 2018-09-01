package Exceptions;

public class MerchantShomareParvandeException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MerchantShomareParvandeException() {
		System.err.println("shomare parvande error");
	}
	
@Override
public void printStackTrace() {
	System.err.println("shomare parvande error");
}
	
	

}
