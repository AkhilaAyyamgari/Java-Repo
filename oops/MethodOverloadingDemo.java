package com.oops;

class Employee{
	void authenticate(String username, String password) {
		if(username.contentEquals("Akhila") && password.contentEquals("akhi123")) {
			System.out.println("Authentication success");
		}else {
			System.out.println("Auth Failure!!!");
		}
	}
	void authenticate(int otp) {
		if(otp == 1234) {
			System.out.println("Authentication success");
		}else {
			System.out.println("Auth Failure!!!");
	}
	}
	void authenticate(String email, int otp) {
		if(email.contentEquals("akhi@gmail.com") && otp == 123456) {
			System.out.println("Authentication success");
		}else {
			System.out.println("Auth Failure!!!");
	}
	}
}
public class MethodOverloadingDemo {
  public static void main(String[] args) {
	  Employee emp = new Employee();
	  emp.authenticate("Akhil", "akhi123");
	  emp.authenticate("akhi@gmail.com", 123456);
	  emp.authenticate(1234);
  }
}
