package Week2.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {

        int countWrongInput=0;
        int randomNumber =(int) (Math.random()*100);
        int guessedNumbers [] = new int[3];

        //user can guess 3 incorrect value
        while(countWrongInput<3){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = input.nextInt();

            //If the number is not specific range, get input again
            if(number>100 || number<0){
                System.out.println("Please enter a number between 0-100");
                number = input.nextInt();
            }
            //If the number is correct exit
            else if(number==randomNumber){
                System.out.println("You win!");
                break;

            }
            else{
                //If the number is larger than the entered value
                if(number<randomNumber){
                    System.out.println("It is a larger number than your guess.");
                }
                //If the number is smaller than the entered value
                else{
                    System.out.println("It is a smaller number than your guess.");
                }
                // add wrong input to the array for printing
                guessedNumbers[countWrongInput]=number;
                //decrease the total remained attempt value
                countWrongInput++;
            }
        }

        //print the user's guess and the correct number
        System.out.println("Guessed Numbers: "+Arrays.toString(guessedNumbers));
        System.out.println("The number was: "+randomNumber);

    }
}
