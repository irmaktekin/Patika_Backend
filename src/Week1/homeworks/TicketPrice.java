package Week1.homeworks;

import java.util.Scanner;

public class TicketPrice {
    /*Price per km declared as static and final because it is a constant value.*/
    public static final float PRICE_PER_KM = 0.10f;
    public static void main(String[] args) {
        float km,roundtripdiscount,price=0;
        int age;
        int flightType;

        /*Get input from the user*/
        Scanner input = new Scanner(System.in);
        System.out.println("How many km's will you take?");
        km = input.nextFloat();

        System.out.println("How old are you?");
        age=input.nextInt();

        System.out.println("Enter the flight type:(1=>Oneway,2=>Roundtrip)");
        flightType = input.nextInt();

        price =(km * PRICE_PER_KM);
        float ageDiscount;

        //If km or age is negative print->"Hatalı veri"
        if(km<=0||age<=0){
            System.out.println("Hatalı veri girdiniz");
        }
        //If trip type is not 1 or 2->"Hatalı veri"
        else if(flightType!=1 && flightType!=2){
            System.out.println(flightType);
            System.out.println("Hatalı veri girdiniz");
        }
        
        //if flight type 2, first apply %20 discount.
        else if (flightType == 2) {
            //different discounts according to ages
            if (age < 12) {
                /*discount for the age*/
                ageDiscount=price*0.5f;
                price-=ageDiscount;

                /*calculate roundtrip discount price*/
                roundtripdiscount=(price*0.4f);

                /*calcculate price with roundtrip discount
                * multiply with 2 because it is a roundtrip(2 ticket)*/
                price=(price-roundtripdiscount)*2;
                System.out.println("Total price:"+price);

            } else if (age >= 12 && age <= 24) {
                ageDiscount=price*0.10f;
                price-=ageDiscount;
                roundtripdiscount=(price*0.20f);
                price=(price-roundtripdiscount)*2;
                System.out.println("Total price:"+price);
            } else if (age > 65) {
                ageDiscount=price*0.30f;
                price-=ageDiscount;
                roundtripdiscount=(price*0.4f);
                price=(price-roundtripdiscount)*2;
                System.out.println("Total price:"+price);
            }
            else{
                /*roundtrip discount will be applied, but not age discount will be applied.
                 * age 25<=age<=65*/
                roundtripdiscount=(price*0.4f);
                price=(price-roundtripdiscount)*2;
                System.out.println("Total price:"+price);
            }
        }
        //if flight 1, discount will change according to age.
        else{
            if (age < 12) {
                ageDiscount = price * 0.50f;
                price-=ageDiscount;
                System.out.println("Total price:"+price);
            } else if (age >= 12 && age <= 24) {
                ageDiscount = price * (0.10f);
                price-=ageDiscount;
                System.out.println("Total price:"+price);
            } else if (age > 65) {
                ageDiscount = price * (0.30f);
                price-=ageDiscount;
                System.out.println("Total price:"+price);
            }
            /*It is not roundtrip and also no discount for that age range so the price remain same.
             age 25<=age<=65*/
            else{
                System.out.println("Total price:"+price);
            }
        }
    }
}

