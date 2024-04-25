package Week1.homeworks;

import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        //Get the input from the user(birth year)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int year = input.nextInt();

        /*Modulus operator is used for finding the remainder from the division with 12*/
        switch(year%12){
            case 0:
                System.out.println("Monkey");
                break;
            case 1:
                System.out.println("Cockerel");
                break;
            case 2:
                System.out.println("Dog");
                break;
            case 3:
                System.out.println("Pig");
                break;
            case 4:
                System.out.println("Mouse");
                break;
            case 5:
                System.out.println("Ox");
                break;
            case 6:
                System.out.println("Tiger");
                break;
            case 7:
                System.out.println("Rabbit");
                break;
            case 8:
                System.out.println("Dragon");
                break;
            case 9:
                System.out.println("Snake");
                break;
            case 10:
                System.out.println("Horse");
                break;
            default:
                System.out.println("Sheep");
                break;
        }
    }
}
