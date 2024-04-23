package Week1;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in meter:");
        double height = input.nextDouble();
        System.out.println("Please enter your weight:");
        double weight = input.nextDouble();
        System.out.println("Your body mass index is: "+(weight/height*height));


    }
}
