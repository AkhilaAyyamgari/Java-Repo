package com.oops;
class User{
	private String username;
	private String address;
	private String accno;
	public User(String username, String address, String accno) {
		super();
		this.username = username;
		this.address = address;
		this.accno = accno;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.username + "\t" + this.address + "\t" + this.accno;
	}	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		User user = new User("Akhila", "Hyderabad","UBI12345665");
		System.out.println(user);
//		System.out.println("Hello");
	}
}


