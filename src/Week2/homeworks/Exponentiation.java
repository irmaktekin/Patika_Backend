package Week2.homeworks;

import java.util.Scanner;

public class Exponentiation {
    public static int exponential(int base, int exp){
        /*if exp 0 result will be 1 for every base.*/
        if(exp==0){
            return 1;
        }
        /* decrement exponent and call the method again */
        return base*exponential(base,exp-1);
    }
    public static void main(String[] args) {
        //Get the input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base:");

        int base = input.nextInt();
        System.out.println("Enter the exponent:");
        int exp = input.nextInt();

       //Method call
        System.out.println("Result is:"+exponential(base,exp));

    }
}
