package Week1.exercises;

import java.util.Scanner;

public class ExponentialNumber
{
    public static void main(String[] args) {

        /*Math.pow(base,exponent)* will handle the all exponent types, but in this program we need to
        handle it for loop, so the floating exponents or negative ones will be not handled/
         */

        /*Get input from the user.*/
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base number:");
        int base = input.nextInt();

        System.out.println("Enter the exponent number:");
        int exponent = input.nextInt();
        int result=1 ;
        double fractionPart= exponent - (int) exponent;

        //If exponent is 0, result will be 1.
        if(exponent==0){
            result=1;
            System.out.println(result);
        }
        else if(exponent<0){
            System.out.println("Number can not be negative value.");
        }
        else{
            //multiply the base exponent number of times(2^3 = 2*2*2)
            for(int i=1;i<=exponent;i++){
                result *=base;
            }
            System.out.println(result);
        }
    }

}
