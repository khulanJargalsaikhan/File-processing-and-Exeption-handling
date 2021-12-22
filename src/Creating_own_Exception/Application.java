package Creating_own_Exception;

public class Application {

	public static void main(String[] args) {


		MyFileUtils myUtil = new MyFileUtils();
		try {
			System.out.println(myUtil.subtract10FromLargerNumber(9));
		}catch (Exception e){
			e.printStackTrace();
		}

	}

}
