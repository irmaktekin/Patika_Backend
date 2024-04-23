package Week1;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args){
        double perapple=3.67;
        double pertomatoe=1.11;
        double perpear= 2.14;
        double perbanana=0.95;
        double peraubergine=5.00;
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

        double totalprice = apple*perapple+pear*perpear+tomatoes*pertomatoe+banana*perbanana+aubergine*peraubergine;
        System.out.println("Total price is: "+ totalprice);



    }
}
