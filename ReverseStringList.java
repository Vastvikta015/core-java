package ajp_java;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseStringList {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();

        // Add strings to the list
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("How");
        stringList.add("Are");
        stringList.add("You");

        // Reverse the list using Collections.reverse()
        Collections.reverse(stringList);

        // Print the reversed list
        System.out.println("Reversed list: " + stringList);
    }
}