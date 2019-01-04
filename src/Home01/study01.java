package Home01;

public class study01 {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if ((id.equals("rnzusl0412") || id.equals("onlyth0502") || id.equals("egoing")) 
				&& password.equals("111111")) {
			System.out.println("correct");	
		} else {
			System.out.println("wrong");
		}
	}
}
