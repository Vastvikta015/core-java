package com.hierarchical1;

public class Bank {

	 String bankName;
	    String country;

	    // Constructor for Bank class
	    public Bank(String bankName, String country) {
	        this.bankName = bankName;
	        this.country = country;
	    }
	    // Method to display bank details
	    public void displayBankDetails() {
	        System.out.println("Bank Name: " + bankName);
	        System.out.println("Country: " + country);
	    }

	    // Method to be overridden by subclasses
	    public double getInterestRate() {
	        return 0.0;
	    }
	}