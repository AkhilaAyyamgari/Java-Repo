package com.fullstack;

public class LocalVariable {

	static void m1() {
	int a=100;
	System.out.println(a);
	}
	
	public static void main(String[] args) {
		int a = 200;
		m1();
		System.out.println(a);
	}

}
