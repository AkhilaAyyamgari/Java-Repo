package com.abstraction;

interface ACRemotePanel{
	 void powerOnOff();
	 void timer(int minutes);
	 void increaseTemp();
	 void decreaseTemp();
	 void sleepMode();
}
class MotherBoard1 implements ACRemotePanel{
	 static boolean powerOnOffStatus = false;
	
	public void powerOnOff() {
		// TODO Auto-generated method stub
		  if(powerOnOffStatus == false) {
			  powerOnOffStatus = true;
			  System.out.println("ac turned on");
		  }
		  else {
			  powerOnOffStatus = false;
			  System.out.println("ac turned off");
		  }
	}
	public void timer(int minutes) {
		// TODO Auto-generated method stub
		
	}
	
	public void increaseTemp() {
		// TODO Auto-generated method stub
		
	}
	public void decreaseTemp() {
		// TODO Auto-generated method stub
		
	}
	public void sleepMode() {
		// TODO Auto-generated method stub
		
	}
	
	
}
public class AbstractionDemo {
	
	public static void main(String[] args) {
		
		ACRemotePanel panel = new MotherBoard1();
		panel.powerOnOff();
		panel.powerOnOff();
		panel.powerOnOff();
		
		
	}
}