package Exceptions;

public class PanooRoleBackException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void printStackTrace() {
		System.err.println("***************************ROLE BACK EXCEPTION IS EQUIRED*********************");
	}
	
	public PanooRoleBackException() {
		System.err.println("***************************ROLE BACK EXCEPTION IS EQUIRED*********************");
	}

	
	@Override
	public String getMessage() {
		return "***************************ROLE BACK EXCEPTION IS EQUIRED*********************";
	}
	
	
	
	
	
	

}
