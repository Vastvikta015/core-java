package com.inheritance;

public class Activa {
    String name;
    float price;
    //constructor to initialize name and price
    public Activa(String name,float price) {
    	this.name=name;
    	this.price=price;
    }
    
    //method to display Activa details
    public void dispalayInfo() {
    	System.out.println("Name:"+name);
    	System.out.println("Price:"+price);
	 
    }
    
}
    
