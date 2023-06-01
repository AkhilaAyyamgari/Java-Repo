package com.abstraction;
interface A{
	void m1();
	void m2();
	void m3();
	void m4();
	}
abstract class AImpl implements A{
	public void m1() {
		System.out.println("m1()");
	}
	public void m2() {
		System.out.println("m2()");
	}
}
class AImplHelper extends AImpl{

	public void m3() {
		System.out.println("m3()");
		}
	 public void m4() {
	    System.out.println("m4()");	
	}
	
}
public class AbstractionClassDemo {

	public static void main(String[] args) {
     A aa = new AImplHelper();
	 aa.m1();
	 aa.m2();
	 aa.m3();
	 aa.m4();
	}
}