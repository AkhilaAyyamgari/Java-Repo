package com.fullstack;

public class controlStatements {

	public static void main(String[] args) {
	String product="electronics";
		switch(product) {
	case "electronics" : System.out.println("You selected Electronics"); break;	
	case "Mobiles" : System.out.println("You selected Mobiles"); break;	
	case "Cameras" : System.out.println("You selected Cameras"); break;	
	case "Grocery" : System.out.println("You selected Grocery"); break;	
	default: System.out.println("you selected is n/a");
	}
	}
}

