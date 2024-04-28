package Week1.homeworks;

import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        //User input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of digits:");
        int number = input.nextInt();
        int numSpaces=number-1;

        //While loop for the line numbers(For ex;If user enter 10, it will display 10 different line.)
        numSpaces=0;
        for(int i=number;i>0;i--){
            for (int j = 0; j <= numSpaces; j++)
                System.out.print(" ");
            //print * number times(n->3, ***)
            for(int j=1;j<number;j++) {
                System.out.print("* ");
            }
            //increment space, because the other line will 1 additional space from the previous line
            numSpaces++;
            //It is for enter a new line.
            System.out.println();
            //decrement number so the other line will 1 * less.(**)
            number-=1;
        }
    }
}
