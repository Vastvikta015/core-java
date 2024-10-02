package com.hierarchical1;

public class Main {

	public static void main(String[] args) {
        // Create RBI object
        RBI rbi = new RBI();
        System.out.println("RBI Details:");
        rbi.displayRBIDetails();

        // Create SBI object
        SBI sbi = new SBI();
        System.out.println("\nSBI Details:");
        sbi.displaySBIDetails();

        // Create SWISS object
        SWISS swiss = new SWISS();
        System.out.println("\nSWISS Bank Details:");
        swiss.displaySWISSDetails();
    }
}
