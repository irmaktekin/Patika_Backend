package Week1.homeworks;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will be in Fibonacci series:");
        int number = input.nextInt();

        System.out.printf("Fibonacci with %d numbers:\n",number);

        int i=0;
        int firstNumber=0;
        int secondNumber=1;
        System.out.printf("%d %d",firstNumber,secondNumber);

        //Two values come outside the loop, so number-2 is the new count for loop.
        while(i<number-2){
            //calculate the next number
            int c = firstNumber+secondNumber;

            //new first number is the second number
            firstNumber=secondNumber;

            //new second number is the third number
            secondNumber=c;
            System.out.printf(" %d",c);
            //increment i to break loop if number exceed.
            i++;
        }
    }
}
