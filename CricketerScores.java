package ajp_java;

import java.util.HashMap;
import java.util.Scanner;

public class CricketerScores {
    public static void main(String[] args) {
        HashMap<String, Integer> cricketerScores = new HashMap<>();

        // Add cricketer names and scores
        cricketerScores.put("Virat Kohli", 12000);
        cricketerScores.put("Rohit Sharma", 11000);
        cricketerScores.put("Rishabh Pant", 9000);

        // Get user input for the cricketer name to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cricketer's name: ");
        String cricketerName = scanner.nextLine();

        // Search for the cricketer and display his score
        Integer score = cricketerScores.get(cricketerName);
        if (score != null) {
            System.out.println("Score of " + cricketerName + ": " + score);
        } else {
            System.out.println("Cricketer not found.");
        }
    }
}