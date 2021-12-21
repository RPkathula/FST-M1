package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Ant");
        myList.add("Ball");
        myList.add("Dog");
        myList.add(3, "Cat");
        myList.add(1, "XmasTree");
        
        System.out.println("List of Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is 'Dog' exists in list: " + myList.contains("Dog"));
        System.out.println("Size of ArrayList: " + myList.size());
        
        myList.remove("Cat");
        
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}