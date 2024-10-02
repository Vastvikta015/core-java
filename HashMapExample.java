package ajp_java;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); 


        // Associate values with keys
        map.put("Vastvikta", 90);
        map.put("Riya", 85);
        map.put("Siya", 95);

        System.out.println("Map: " + map);
    }
}
