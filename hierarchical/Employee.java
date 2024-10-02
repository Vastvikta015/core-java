package com.hierarchical;

public class Employee extends Person  {

	 double salary;

	    // Constructor for Employee class
	    public Employee(String name, int id, String city, double salary) {
	        super(name, id, city); // Call the constructor of the Person class
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        displayPersonDetails(); // Call method of Person class
	        System.out.println("Salary: " + salary);
	    }
	}
