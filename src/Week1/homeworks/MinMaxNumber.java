package Week1.homeworks;

import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers you will enter:");
        int count = input.nextInt();
        //assign min to max and max to min for to be able to assign new min and max
        int max=Integer.MIN_VALUE;int min=Integer.MAX_VALUE;
        int i=1;
        //loop n times(n is user input)
        while(i<=count){
            //get input from the user
            System.out.printf("Enter number %d:\n",i);
            int number = input.nextInt();
            //if number is greater than max value, then the new max will be the new number.
            if(number>max){
                max=number;
            }
            //if number is smaller than min value, then the new min value will be the new number.
            if(number<min){
                min=number;
            }
            i++;
        }
        System.out.println("Max value:"+max);
        System.out.println("Min value:"+min);
    }

}
