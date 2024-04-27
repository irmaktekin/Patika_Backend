package Week1.exercises;

import java.util.Scanner;

public class SumUntilOddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a;
        int sum=0;

        //loop until a odd number is entered
        do {
            a = input.nextInt();
            // if it is divisible by 4, add to the sum
            if(a%4==0){
                sum+=a;
            }
        }while(a%2!=1);
        //Print the result
        System.out.println("Sum is: "+sum);
    }
}
