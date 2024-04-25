package Week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double n1, n2;
        double result;
        //the number that will be selected by the user
        int operationNo;

        //Get the input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        n1 =input.nextDouble();

        System.out.println("Please enter the second number: ");
        n2 =input.nextDouble();

        //Display 4 option that user can select
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("What is your choice: ");

        operationNo =input.nextInt();

        // do the operations according to the number user select
        switch(operationNo){
            case 1:
                result = n1+n2;
                System.out.println(result);
                break;
            case 2:
                result = n1-n2;
                System.out.println(result);
                break;
            case 3:
                result = n1*n2;
                System.out.println(result);
                break;
            case 4:
                /* If user selects division, check if the second number is zero.*/
                    if(n2==0){
                        System.out.println("Cannot divide by zero.");
                    }
                    else{
                        result = n1/n2;
                        System.out.println(result);
                    }
            default:
                System.out.println("This number not included in options.");
        }
    }
}
