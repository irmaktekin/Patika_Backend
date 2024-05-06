package Week2.homeworks.numbersorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    static Scanner input = new Scanner(System.in);

    //element sorting and printing
    static void sortArray(int[] arr1){
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    //it gets the input, if it is a valid number calls createArray method
    static void getUserInput(){
        System.out.println("Enter the number of element:");
        int arrayLength = input.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Please enter a valid number!");
        }
        else {
            createArray(arrayLength);
        }

    }

    //creates array with the user inputs
    static void createArray(int arrayLength) {
        int arr1[] = new int[arrayLength];
        //add each element from the user to the array
            for (int i = 0; i < arrayLength; i++) {
                System.out.println("Enter the " + (i + 1) + ". element:");
                int element = input.nextInt();
                arr1[i] = element;
            }
            //method call for sorting
            sortArray(arr1);

    }
}


