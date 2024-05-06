package Week2.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatedNumbers {
    //create array with user input
    public static int[] createArray(){
        Scanner input = new Scanner(System.in);
        int numberOfElements = input.nextInt();
        int arr1[] = new int[numberOfElements];
        //add each element from the user to the array
        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("Enter the " + (i + 1) + ". element:");
            int element = input.nextInt();
            arr1[i] = element;
        }
        return arr1;
    }
    //finds the repeated odd numbers
    public static void getRepeatedEvenNumbers(int[] myArray){
        int [] repeatedNumbers= new int[myArray.length];

        for(int i=0;i<myArray.length;i++){
            for(int j=1;j< myArray.length;j++){
                if(i!=j &&myArray[i]==myArray[j] && myArray[i]%2==0){
                    repeatedNumbers[i] = myArray[i];
                }
            }
        }
        System.out.println(Arrays.toString(repeatedNumbers));;

    }

    public static void main(String[] args) {
        //It gets the value from createArray method and send the value to getRepeatedOddNumbers.
        RepeatedNumbers.getRepeatedEvenNumbers(createArray());
    }

}
