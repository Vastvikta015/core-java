package com.Project;

import java.util.Scanner;

public class CheckNthBit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position (starting from 0):");
        int n = scanner.nextInt();

        // Check if the nth bit is set
        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit is set.");
        } else {
            System.out.println("The " + n + "th bit is not set.");
            scanner.close();
        }
    }
}