package Week1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String [] args){
        // Get three numbers from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // calculation for the inputs
        int result = num1+num2*num3-num2;
        //Display the result in the console
        System.out.println(result);
    }
}
