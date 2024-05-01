package Week2.homeworks;

import java.util.Scanner;


public class Pattern {
    static int firstNumber;
    static int isNegative=0;
    /*
    isNegative->once the number is negative, it will set to 1.
     */

    public static void createPattern(int number){
        System.out.println(number);

        /* if the value is negative before and if the capacity will not exceed
            add 5 to the number, even it is greater than 0.
        */
        if(isNegative!=0){
            if(number+5<=firstNumber){
                createPattern(number+5);
            }
        }
        //number is negative and capacity will not be exceeded
        else if(((number)<=0)) {
            isNegative=1;
            createPattern(number+5);

        }
        //number is equal or greater than 0 and never been negative before.
        else{
            createPattern(number-5);
        }
    }
    public static void main(String[] args) {
        //get input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        firstNumber = input.nextInt();
        //method call
        createPattern(firstNumber);
    }
}

