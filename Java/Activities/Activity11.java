package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<Integer, String>();
        colours.put(1, "Red");
        colours.put(2, "Pink");
        colours.put(3, "Blue");
        colours.put(4, "White");
        colours.put(5, "Black");
        System.out.println("The Original map: " + colours);
        colours.remove(4);
        System.out.println("After removing White: " + colours);
        if(colours.containsValue("Pink")) {
            System.out.println("Pink exists in the Map");
        } else {
            System.out.println("Pink does not exist in the Map");
        }
        System.out.println("Number of pairs in the Map is: " + colours.size());
    }
}