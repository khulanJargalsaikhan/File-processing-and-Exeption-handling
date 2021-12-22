package Creating_own_Exception;

public class MyFileUtils {
	public int subtract10FromLargerNumber(int number) throws FooRuntimeException {
		if(number < 10) {
			throw new FooRuntimeException("The number passed was smaller than 10");
		}
		return number -10;
	}
	
	
	// Defining own Exception. For the best practice it is better to create in own package. 
	// this is just an example
	public class FooRuntimeException extends Exception {
		public FooRuntimeException(String message) {
			super(message);
		}
	}
	
	
}
