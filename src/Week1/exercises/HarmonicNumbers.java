package Week1.exercises;

import java.util.Scanner;

public class HarmonicNumbers
{
    public static void main(String[] args) {
        //Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        float result=0;

        //(1/1+1/2+.....1/i)
        for(double i=1;i<=number;i++){
            result += (1/i);
        }
        //Print the result
        System.out.printf("Result is %.1f",result);
    }
}
