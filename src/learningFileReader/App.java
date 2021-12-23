package learningFileReader;

//We can create own auto closable class
// this is an example
class MyClass implements AutoCloseable{
	
	@Override
	public void close() throws Exception {
		
		// Write your code or database or network that needs to be close automatically
		System.out.println("Closing!");
	}
	
}




public class App {
	
	public static void main(String[] args) {
		
		try(MyClass var = new MyClass();){
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
