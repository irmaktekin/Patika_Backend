package Week1.exercises;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        //Get the input from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();

        int numSpaces=number-1;

        //first half of the diamon
        for (int i = 0; i < number; i++)
        {
            //Adds space to the beginning of line
            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");
            //print *
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            //Start to new line, and decrement space, because the other line will 1 space less.
            System.out.print("\n");
            numSpaces--;
        }

        //second half of the diamond
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

