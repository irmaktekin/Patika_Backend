package Week2.homeworks;

import java.util.Scanner;


public class Pattern {
    /*Three parameters are used:*
    number->for decreasing, increasing the value.
    a->once the number is negative, it will set to 1.
    firstNumber -> holds the initial value for not exceed the number.
     */
    public static void createPattern(int number,int a,int firstNumber){
        System.out.println(number);

        /* if the value is negative before and if the capacity will not exceed
            add 5 to the number, even it is greater than 0.
        */
        if(a!=0){
            if(number+5<=firstNumber){
                createPattern(number+5,a,firstNumber);
            }
        }
        //number is negative and capacity will not be exceeded
        else if(((number)<=0 && (number+5)<=Math.abs(firstNumber))) {
            createPattern(number+5,1,firstNumber);

        }
        //number is equal or greater than 0 and never been negative before.
        else{
            createPattern(number-5,0,firstNumber);
        }
    }
    public static void main(String[] args) {
        //get input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        //method call
        createPattern(number,0,number);
    }
}

