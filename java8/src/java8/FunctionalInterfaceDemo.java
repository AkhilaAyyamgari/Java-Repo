package java8;
@FunctionalInterface
interface Login{
	boolean authenticate(String username, String password);
}



public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Login auth = (String username, String password) -> username.contentEquals("akhila")&& password.contentEquals("saarvi");
          System.out.println(auth.authenticate("akhila", "saarvi"));
          
	}

}
