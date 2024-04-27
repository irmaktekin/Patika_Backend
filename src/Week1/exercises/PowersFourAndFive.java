package Week1.exercises;

import java.rmi.MarshalException;
import java.util.Scanner;

public class PowersFourAndFive {
    public static void main(String[] args) {
        /*Get the input*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();

        //If the number is 0 or negative execute here.
        if(number<=0){
            System.out.println("Invalid number");
        }
        else{
            //Iterate until the number is reached
            for(int i=0;i<=number;i++){
                //If it is power of 4 and in the range print here.
                if(Math.pow(4,i)<=number) {
                    System.out.printf((int)Math.pow(4,i)+"="+"%d^%d\n",4,i);
                }
                //If it is power of 5 and in the range print here.
                else if(Math.pow(5,i)<=number){
                    System.out.printf(Math.pow(5,i)+"="+"%d^%d\n",4,i);
                }
            }
        }
    }
}
