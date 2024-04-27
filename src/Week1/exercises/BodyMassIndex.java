package Week1.exercises;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meter:");
        double height = input.nextDouble();
        System.out.println("Please enter your weight in kg:");
        double weight = input.nextDouble();
        //calculate body mass index.
        System.out.println("Your body mass index is: "+(weight/(height*height)));

    }
}
