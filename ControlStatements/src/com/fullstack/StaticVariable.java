package com.fullstack;

public class StaticVariable {
	static int counter=0;

	public static void main(String[] args) {
	System.out.println(StaticVariable.counter);	
	StaticVariable.counter++;
	System.out.println(counter);
	m1();
	System.out.println(counter);
	}
static void m1()
{
System.out.println(counter);
counter++;
}
}
