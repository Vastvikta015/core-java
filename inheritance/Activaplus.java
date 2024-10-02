package com.inheritance;

public class Activaplus  extends Activa{
     //constructor for Activaplus
	public Activaplus(String name, float price) {
		super(name,price);//call the parent class constructor
	}
	
	
	public static void main(String[] args) {
		 // Creating an object of the parent class Activa
        Activa activa = new Activa("Activa 5G", 60000);
        activa.dispalayInfo();

        System.out.println();
        
        // Creating an object of the child class ActivaPlus
        Activaplus activaplus = new Activaplus("Activa 6G", 70000);
        activaplus.dispalayInfo();	
	}
}
	
	


