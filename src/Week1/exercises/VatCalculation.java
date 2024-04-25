package Week1;

import java.util.Scanner;

public class VatCalculation {

    public static void main(String[] args ){
        double vatrate,vatprice;

        //Get the price from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyat giriniz:");
        double price = input.nextDouble();

        //If the price is 0, execute this block.
        if(price ==0){
            System.out.println("Fiyat 0 olamaz!");
        }
        //If the price is negative value execute this block.
        if(price<0){
            System.out.println("Fiyat negatif bir sayı olamaz!");
        }
        else if (price>0 && price<=1000) {
            vatrate =0.18;
            vatprice = price*vatrate;
            System.out.println("Vat Rate: "+ vatrate);
            //Use sum method of the Double class for adding price and vat price
            System.out.println("Price with Vat Rate: "+Double.sum(price,vatprice));
            System.out.println("Vat Amount: "+ (vatprice));
        }
        else{
            vatrate= 0.08;
            vatprice = price*vatrate;
            System.out.println("Vat Rate: "+ vatrate);
            //Use sum method of the Double class for adding price and vatprice
            System.out.println("Price with Vat Rate: "+Double.sum(price,vatprice));
            System.out.println("Vat Amount: "+ (vatprice));
        }

    }
}
