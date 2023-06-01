package com.fullstack;


class Login{

	String username;
	String password;
	long mobileNumber;
	public Login(String username, String password) {

		System.out.println("Username: "+ username);
		System.out.println("Password: "+ password);
		this.username = username;
		this.password = password;

	}
	public Login(long mobileNumber, String password) {

		System.out.println("mobileNumber: "+ mobileNumber);
		System.out.println("Password: "+ password);
		this.mobileNumber = mobileNumber;
		this.password = password;
	}


}

public class ConstructorOverLoading1 {

	public static void main(String[] args) {

		Login l= new Login("kiran","abc");
		Login l2= new Login(9010101010l,"bhscb");

	}

}
