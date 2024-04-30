package Week2.homeworks;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int number, int division){
        int result = number%division;
        //if number 2-> it is always prime
        if((number==2)||(division==number)){
            return true;
        }
        //if the remainder 0 or number 1, it is not prime
        else if(number==1 || result==0){
            return false;
        }
        //continue to call itself
        else{
            return isPrime(number,division+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        //method call
        boolean result = (isPrime(number,2));
        //print
        System.out.println("The number is " + (result? "prime" : "not-prime"));

    }
}

