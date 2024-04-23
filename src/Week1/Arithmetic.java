package Week1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String [] args){
        int a,b,c,result;
        // Get three numbers from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a: ");
        a = scanner.nextInt();

        System.out.print("Please enter b: ");
        b = scanner.nextInt();

        System.out.print("Please enter c: ");
        c = scanner.nextInt();

        // calculation for the inputs
        result = a+b*c-b;

        //Display the result in the console
        System.out.println("Result is: "+result);
    }
}
