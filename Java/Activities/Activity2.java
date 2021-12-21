package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 40, 11, 89, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        
        int searchNum = 10;
        int fixedSum = 30;
        
        System.out.println("Result is " + result(numArr, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == fixedSum;
    }
}