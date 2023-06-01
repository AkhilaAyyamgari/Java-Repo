package com.abstraction;
class Engine{
 public String toString() {
	 System.out.println("Engine");
	 return "";
 }
}
class Tyres{
	 public String toString() {
		 System.out.println("Tyres");
		 return "";
	 }	
}
class Steering{
	 public String toString() {
		 System.out.println("Steering");
		 return "";
	 }
}
class Vehicle{
	Engine e = new Engine();
	Tyres t = new Tyres();
	Steering s = new Steering();
}
public class AggregationDemo {
 public static void main(String[] args) {
	 Vehicle vehicle = new Vehicle();
	 System.out.println(vehicle.e);
	 System.out.println(vehicle.t);
	 System.out.println(vehicle.s);
 }
}
