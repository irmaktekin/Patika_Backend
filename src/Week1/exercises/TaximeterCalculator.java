package Week1.exercises;

import java.util.Scanner;

public class TaximeterCalculator {
    //because it cannot be changed during the program, they declared as a constant value.
    static final int TAXIMETRE_BASE_PRICE=10;
    static final double PER_KM_PRICE = 2.20;
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("How many km does it take to the destination?");
        double km = input.nextDouble();
        double totalprice = TAXIMETRE_BASE_PRICE+PER_KM_PRICE*km;

        //If total price is smaller than 20, the price will be 20.
        if(totalprice<20){
            totalprice = 20;
            System.out.println(totalprice);
        }
        //Otherwise, price per km will multiply with the km and added to the base price.
        else{
            System.out.println(totalprice);
        }
    }
}
