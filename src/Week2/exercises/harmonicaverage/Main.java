package Week2.exercises.harmonicaverage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            //Get the array size from the user
            Scanner input = new Scanner(System.in);
            System.out.println("Number of elements in the array:");
            int numberOfElements = input.nextInt();

            //Create array with the size from the user
            int [] arr1 = new int[numberOfElements];
            //call method for adding random elements to the array
            arr1 = HarmonicAverage.addBulkElements(arr1);

            //Print the result of the harmonic average method.
            System.out.printf("Harmonic average is: %.2f " ,HarmonicAverage.harmonicAverage(arr1));
    }
}
