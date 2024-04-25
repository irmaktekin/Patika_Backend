package Week1.homeworks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = input.nextInt();

        //0 is divided by zero, but it is not a year, so this condition should be executed.
        if(year==0){
            System.out.println(year+" is not a leap year.");
        }
        //if it is divided by zero without remaining check if it is divided by 400
        else if(year%100==0){
            if(year%400==0){
                System.out.println(year+" is a leap year.");
            }
            else{
                System.out.println(year+" is not a leap year.");
            }
        }
        //if is divided by 4 without any remaining part it is a leap year
        else if(year%4==0){
            System.out.println(year+" is a leap year.");
        }
        //if the statements above is not correct, then it is not a leap year
        else{
            System.out.println(year+" is not a leap year.");
        }
    }
}
