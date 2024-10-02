package com.hierarchical1;

//RBI class inherits Bank
class RBI extends Bank {

 // Constructor for RBI class
 public RBI() {
     super("Reserve Bank of India", "India");
 }

 // Overriding interest rate method
 @Override
 public double getInterestRate() {
     return 6.5;
 }

 // Method to display RBI-specific details
 public void displayRBIDetails() {
     displayBankDetails();
     System.out.println("Interest Rate: " + getInterestRate() + "%");
 }
}
