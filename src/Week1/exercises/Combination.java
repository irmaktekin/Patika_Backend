package Week1.exercises;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        /*Holds the numerator and denominator values*/
        double numerator=1,denominator=1;

        //Get inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b=input.nextInt();

        /*If the second number is greater than 1,not valid.*/
        if(b>a){
            System.out.println("Please enter a number smaller than member number");
        }
        /*In every case, if second number is 0, result is 1.*/
        else if(b==0){
            System.out.printf("C(%d,%d) = 1%n", a, b);
        }
        /*In every case, if second number is 1, result is the number itself.*/
        else if(b==1){
            System.out.println(a);
        }
        else{
            /* Example Case => C(10,4)=10*9.8.7/4.3.2.1
            * It will start from the 10, it is decremented by 1 and multiplied with the previous
            * value until it equals to (10-4);
            * (denominator=10*9);
            * */
            for(int j=a;j>a-b;j--){
                numerator*=j;
            }
            /* It will start from the 1 and incremented until it is equal to 4.*/
            for(int i=1;i<=b;i++){
                denominator*=i;
            }
            /*Formula for combination -> numerator/denominator;*/
            System.out.printf("C(%d,%d) = %.2f", a, b, numerator/denominator);
        }
    }
}
