package Week1.homeworks;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of digits:");
        int number = input.nextInt();
        //While loop for the line numbers(For ex;If user enter 10, it will display 10 different line.)
            int i=0;
                while(i<number){
                    //For loop for print * in a line
                    for(int j=1;j<number*2;j++) {
                        System.out.print("*");
                    }
                    //It is for enter a new line, and continue to print with *
                    System.out.println();
                    //If the first line have 19 *, next line will be have 17 *.
                    number-=1;
                }
    }
}
