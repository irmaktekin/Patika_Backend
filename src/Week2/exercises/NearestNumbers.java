package Week2.exercises;

import java.util.Scanner;

public class NearestNumbers {
    static int min= Integer.MIN_VALUE;
    static int max=Integer.MAX_VALUE;

    public static void main(String[] args) {
        int arr1 [] = {2,10,44,23,86,23};
        //method call
        findNearestValues(arr1);
    }
    static void findNearestValues(int [] arr1) {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();


        for (int i = 0; i < arr1.length; i++) {
            //if number is larger, and the element is larger than the min
            if (arr1[i] < number && arr1[i] > min) {
                min = arr1[i];
            }
            else if (arr1[i] > number && arr1[i] < max) {
                max = arr1[i];
            }
        }
        //If the input is smallest or largest
        if (min == Integer.MIN_VALUE) {
            System.out.println("No smaller number found.");
        } else {
            System.out.println("Nearest smaller:" + min);
        }
        if (max == Integer.MAX_VALUE) {
            System.out.println("No larger number found.");
        } else {
            System.out.println("Nearest larger:" + max);
        }
    }
}
