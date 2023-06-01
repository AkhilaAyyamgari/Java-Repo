package com.oops;

class A1{

	A1(){
		System.out.println("A1()");
	}
	A1(int i){
		System.out.println("A1(int)");
	}

}
class B1 extends A1{

	B1(){
		//super();
		System.out.println("B1()");
	}
}

public class ConstructorInheritance{

	public static void main(String[] args) {
		B1 b= new B1();
	}

}
