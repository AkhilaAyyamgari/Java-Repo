package com.abstraction;
class Calc{
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void sub(int x, int y) {
		System.out.println(x-y);
	}
}
class SciCalc extends Calc{
	void Square(int x) {
		System.out.println(x * x);
	}
	void Cube(int y) {
		System.out.println(y * y * y);
	}
}
public class Inheritance {

	public static void main(String[] args) {
	SciCalc sc = new SciCalc();
	sc.Cube(2);
	sc.add(5, 9);
	
	}

}
