package com.hierarchical;

public class Person {
	  String name;
	    int id;
	    String city;

	    // Constructor for Person class
	    public Person(String name, int id, String city) {
	        this.name = name;
	        this.id = id;
	        this.city = city;
	    }
	    // Method to display person details
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("City: " + city);
	    }
	}
