package com.oops;
class Authenticate{
public void Login(String username, String password) {
	if(username.contentEquals("Akhi") && password.contentEquals("akhi123")) {
		System.out.println("Login Success");
	}else {
		System.out.println("login Failure");
	}
}
}
class Register extends Authenticate {
	
}
class Admin extends Authenticate{
	
}
public class Multiple {

	public static void main(String[] args) {
	
          Register r1 = new Register();
          r1.Login("Akhi", "akhi123");
	}

}
