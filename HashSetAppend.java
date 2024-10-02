package ajp_java;

import java.util.HashSet;

public class HashSetAppend {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Add elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Append "Grapes" to the end of the HashSet
        fruits.add("Grapes");

        System.out.println("Fruits in the HashSet: " + fruits);
    }
}