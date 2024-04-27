package Week1.exercises;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args){
        double perapple=3.67, pertomatoe=1.11, perpear= 2.14, perbanana=0.95, peraubergine=5.00;

        Scanner input = new Scanner(System.in);
        System.out.println("How many kg would you like to buy from apple?");
        double apple = input.nextDouble();
        System.out.println("How many kg would you like to buy from pear?");
        double pear = input.nextDouble();
        System.out.println("How many kg would you like to buy from tomatoes?");
        double tomatoes = input.nextDouble();
        System.out.println("How many kg would you like to buy from banana?");
        double banana = input.nextDouble();
        System.out.println("How many kg would you like to buy from aubergine?");
        double aubergine = input.nextDouble();

        // multiply per price with the item and sum up all.
        double totalprice = apple*perapple+pear*perpear+tomatoes*pertomatoe+banana*perbanana+aubergine*peraubergine;
        //format the output for showing only 2 decimal.
        System.out.printf("Total price is: %.2f",totalprice);
    }
}
