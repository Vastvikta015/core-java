package com.hierarchical1;

//SWISS class inherits Bank
class SWISS extends Bank {

 // Constructor for SWISS class
 public SWISS() {
     super("Swiss Bank", "Switzerland");
 }

 // Overriding interest rate method
 @Override
 public double getInterestRate() {
     return 1.0;
 }

 // Method to display SWISS-specific details
 public void displaySWISSDetails() {
     displayBankDetails();
     System.out.println("Interest Rate: " + getInterestRate() + "%");
 }
}
