package ajp_java;

import java.util.HashMap;

public class HashMapExample1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the map is empty
        boolean isEmpty = map.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);

        // Add some elements to the map
        map.put("Alice", 90);
        map.put("Bob", 85);

        // Check if the map is empty again
        isEmpty = map.isEmpty();
        System.out.println("Is the map empty? " + isEmpty);
    }
}
