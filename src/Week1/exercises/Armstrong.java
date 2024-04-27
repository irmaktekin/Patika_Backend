package Week1.exercises;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int sum=0;

        while(number!=0){
            //the last digit which remains from the divided by 10
            int lastDigit = number%10;
            //add digit to the sum
            sum+=lastDigit;
            //extract the last digit from the number
            number/=10;
        }
        System.out.println("Sum is: "+ sum);
    }
}

