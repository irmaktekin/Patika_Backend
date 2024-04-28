package Week1.exercises;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Get input
        System.out.println("Enter an integer value:");
        int num1 = input.nextInt();

        System.out.println("Enter an float value:");
        double num2 = input.nextFloat();

        //casting and print the result
        System.out.println("num1:"+(double)num1);
        System.out.println("num2:"+(int)num2);

    }
}
