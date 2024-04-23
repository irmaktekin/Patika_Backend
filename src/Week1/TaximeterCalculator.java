package Week1;

import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args){
        final int TAXIMETRE_BASE_PRICE=10;
        double perkmprice = 2.20;
        double price;
        Scanner input = new Scanner(System.in);
        System.out.println("How many km does it take to the destination?");
        double km = input.nextDouble();


        if(km<20){
            price = 20;
        }
        else{
            price = TAXIMETRE_BASE_PRICE+perkmprice*km;
        }
        System.out.println(price);
    }
}
