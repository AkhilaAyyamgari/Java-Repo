package com.oops;

class LoginUser{
	String username;
	String password;
	long mobileNumber;
	
	public LoginUser(String username, String password) {
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);
//		this.Username = username;
//		this.Password = password;
	}
	public LoginUser(long mobileNumber,String password ) {
		System.out.println("MobileNumber:" + mobileNumber);
		System.out.println("Password:" + password);
//		this.MobileNumber = mobileNumber;
//		this.Password = password;
		
	}
}

public class ConstructorOverloading {

	public static void main(String[] args)  {
		LoginUser R = new LoginUser("Akhila", "akhi123");
		LoginUser R2 = new LoginUser(8125800899l, "akhi123");

	}

}
