package Week1.exercises;

import java.util.Scanner;

public class EventSuggestion {
    public static void main(String[] args) {

        /*the temperature will be stored in this variable*/
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weather temperature?");
        temp=input.nextInt();

        /*If temperature is greater than 5*/
        if(temp<5){
            System.out.println("Skating");
        }
        /*If it is smaller or equal to 5*/
        else {
            /*If temperature is between 5 and 15*/
            if (temp >= 5 && temp <= 15) {
                System.out.println("Cinema");
            }
            /*If temperature is between 15 and 25*/
            else if (temp > 15 && temp <= 25) {
                System.out.println("Picnic");
            }
            /*If temperature is greater than 25*/
            else {
                System.out.println("Swimming");
            }
        }
    }
}
