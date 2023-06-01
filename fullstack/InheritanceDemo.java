package com.fullstack;

import com.fullstack.Admin;
import com.fullstack.AuthenticationSystem;
import com.fullstack.Register;

class AuthenticationSystem{
	public void login(String username, String password) {
		if(username.contentEquals("akhila") && password.contentEquals("akhi123")) {
		System.out.println("Login Success");	
		}else {
			System.out.println("Login Failure");
		}
	}
}
class Register extends AuthenticationSystem{
	
}
class Admin extends AuthenticationSystem{
	
}
public class InheritanceDemo
{
public static void main() {
	Register c1 = new Register();
	c1.login("akhila", "akhi123");
    Admin a1 = new Admin();
    a1.login("Saarvi", "saru123");
}
}
