package Week1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String [] args){
        int num1,num2,num3,result;
        // Get three numbers from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a: ");
        num1 = scanner.nextInt();

        System.out.print("Please enter b: ");
        num2 = scanner.nextInt();

        System.out.print("Please enter c: ");
        num3 = scanner.nextInt();

        // calculation for the inputs
        result = num1+num2*num3-num2;

        //Display the result in the console
        System.out.println("Result is: "+result);
    }
}
