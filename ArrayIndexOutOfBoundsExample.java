package ajp_java;

public class ArrayIndexOutOfBoundsExample {

    public static void main(String[] args) {
        // Define an array with 5 elements
    	
        int[] numbers = {10, 20, 30, 40, 50};

        // Iterate through the array using a loop
        try {
            for (int i = 0; i <= numbers.length; i++) {
            	
                // Accessing the array elements
            	
                System.out.println("Element at index " + i + " is: " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            // Handling the exception
        	
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an element beyond the last index of the array.");
        }
    }
}
