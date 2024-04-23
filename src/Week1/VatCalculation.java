package Week1;

import java.util.Scanner;

public class VatCalculation {

    public static void main(String[] args ){
        double vatrate;
        double vatprice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the price:");
        double price = input.nextDouble();


        if (price>0 && price<1000) {
            vatrate =0.18;
            vatprice = price*vatrate;
            System.out.println("Vat rate:"+ vatrate);
            System.out.println("Price with vat rate:"+ price+vatprice);
            System.out.println("Vat rate price:"+ (vatprice));

        }
        else{
            vatrate= 0.08;
            vatprice = price*vatrate;
            System.out.println("Vat rate:"+ vatrate);
            System.out.println("Price with vat rate:"+ price+vatprice);
            System.out.println("Vat rate price:"+ (vatprice));

        }

    }
}
