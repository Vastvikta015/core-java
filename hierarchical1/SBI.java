package com.hierarchical1;

//SBI class inherits Bank
class SBI extends Bank {

 // Constructor for SBI class
 public SBI() {
     super("State Bank of India", "India");
 }

 // Overriding interest rate method
 @Override
 public double getInterestRate() {
     return 5.5;
 }

 // Method to display SBI-specific details
 public void displaySBIDetails() {
     displayBankDetails();
     System.out.println("Interest Rate: " + getInterestRate() + "%");
 }
}
