package Week1.exercises;

import java.util.Scanner;

public class DivisibleByTwelve {
    public static void main(String[] args) {
        /*count->holds the value for the number of elements which will be included to average.
        0 will be excluded in this scenario.*/
        int number,count=0; double sum=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = input.nextInt();

        for(int i=1;i<=number;i++){
            /*If it is divisible by 12, add that number to the sum and
              increment count.
             */
            if(i%12==0){
                sum+=i;
                count++;
            }
        }
        if(count==0){
            System.out.println("There is no number divisible by 12.");
        }
        else{
            //Average calculation
            double average = sum/count;
            System.out.printf("Average is %.2f:",average);
        }
    }
}
