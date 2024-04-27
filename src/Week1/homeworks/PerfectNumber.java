package Week1.homeworks;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        //Get input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        int sum=0;

        //if the number is divided by i without remainder, add to the sum
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        //if sum is equal to number-> perfect number
        if(sum==number){
            System.out.println("It is a perfect number!");
        }
        else{
            System.out.println("It is not a perfect number!");
        }
    }
}
