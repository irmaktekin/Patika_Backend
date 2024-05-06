package Week2.exercises.harmonicaverage;

import java.util.Arrays;
import java.util.Random;

public class HarmonicAverage {
    //Adds random elements to the array
    static int [] addBulkElements(int [] arr){
        for(int i=0;i<arr.length;i++){
            //method call for creating integer between 1 and 10
            arr[i]= generateRandomInteger(1,10);
        }
        System.out.println("Array is created:"+Arrays.toString(arr));
        return arr;
    }
    //Creates random integer between 1,10
    static int generateRandomInteger(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    //Method for harmonic average
    static double harmonicAverage(int [] arr){
        double sum=0;
        double average;
        for (double i:arr) {
            sum+=1/i;
        }
        average= arr.length/sum;
        return average;
    }
}
