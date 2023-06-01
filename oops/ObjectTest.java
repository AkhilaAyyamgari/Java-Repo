package com.oops;

class Object {
	String username;
	String password;
	String email;
	public Object(String username, String password, String email) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}

public class ObjectTest {

	public static void main(String[] args) {
		Object obj = new Object("Akhila", "akhi123","akhi@gmail.com");
		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.email);

	}

}
