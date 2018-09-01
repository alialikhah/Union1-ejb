package Exceptions;

public class MerchantShopNameException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MerchantShopNameException() {
		System.err.println("ShopNAme Error");
	}
  
	
	@Override
	public void printStackTrace() {
		System.err.println("ShopNAme Error");
	}
	
	

}
