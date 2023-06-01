package com.fullstack;

public class SequentialStatementDemo {

	public static void main(String[] args) {
//		int age = 14;
//		if(age>=18) {
//			System.out.println("Eligible");
//		}else {
//			System.out.println("not eligible");
//		}

String course ="react";
switch(course) {
case"java": System.out.println("90 hours"); break;
case"react": System.out.println("30 hours"); break;
case"angular": System.out.println("20 hours"); break;

default: System.out.println("this course notrt available");
}
}
}
