package com.abstraction;

public class Honda1 implements Bike1,Car1{

	@Override
	public void avg1() {
		 System.out.println("From Car1 interface");
		
	}

	@Override
	public void run() {
		System.out.println("Inside run method");
		
	}

	@Override
	public void avg() {
		 System.out.println("Inside avg method");
		
	}

	@Override
	public void engine() {
		 System.out.println("Inside engine method");
	}
	public static void main(String[] args) {
		// Using Car1 reference
        Car1 car = new Honda1();
        car.avg1();
        
        // Using Bike1 reference
        Bike1 bike = new Honda1();
        bike.run();
        bike.avg();
        bike.engine();
        
        // Using Honda1 reference
        Honda1 honda = new Honda1();
        honda.run();
        honda.avg();
        honda.engine();
        honda.avg1();
	}
}

	 
