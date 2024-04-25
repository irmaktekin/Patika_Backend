package Week1.homeworks;

import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        //Get the input from the user(birth year)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        String zodiac;
        int year = input.nextInt();

        /*Modulus operator is used for finding the remainder from the division with 12*/
        zodiac = switch(year%12){
            case 0->"Monkey";
            case 1->"Cockerel";
            case 2->"Dog";
            case 3->"Pig";
            case 4->"Mouse";
            case 5->"Ox";
            case 6->"Tiger";
            case 7->"Rabbit";
            case 8->"Dragon";
            case 9->"Snake";
            case 10->"Horse";
            case 11->"Sheep";
            default->"Invalid number for the zodiac.";
        };
        System.out.println(zodiac);
    }
}
