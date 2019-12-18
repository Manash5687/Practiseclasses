package com.javavideo.lesson2;

public class TestClass {
	
	public static void main(String[] args) {
		
	   Impl1 a = new Impl1();
	}
 
}

interface Car {
	
	void moveForward(String str);
}

interface SecureCar {
	
	void showIdicators();

	void blowAirBagInEmergency();

}

abstract class Abs1 implements Car, SecureCar {


	public void showIdicators(String str) {

	}
void blowAirBagInEmergency(){
}
}

class BMW implements Car, SecureCar {

	public void doTask2(){
}

}


