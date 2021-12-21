package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Ant");
        hashSet.add("Ball");
        hashSet.add("Cat");
        hashSet.add("Apple");
        hashSet.add("Maple");
        hashSet.add("Yacht");
        System.out.println("Original HashSet: " + hashSet);    
        System.out.println("Size of HashSet: " + hashSet.size());
        System.out.println("Removing Ant from HashSet: " + hashSet.remove("Ant"));
        if(hashSet.remove("Hat")) {
        	System.out.println("Hat is removed from the Set");
        } else {
        	System.out.println("Hat is not present in the Set");
        }
        System.out.println("Checking if Cat is present: " + hashSet.contains("Cat"));
        System.out.println("Updated HashSet: " + hashSet);
    }
}
