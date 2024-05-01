package Week2.exercises;

import java.util.Scanner;

public class PalindromeNumber {
    public static String reverseNumber(int numberLength,String number){
        String reverseString="";
        //It loops for each char in the string, and create new string which is the reversed version
        for(int i=0;i<numberLength;i++){
            char chr =number.charAt(i);
            reverseString=chr+reverseString;
        }
        //return the reverse version of the string
        return reverseString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        //Number is get from the user as a string.
        String number = input.nextLine();
        //It finds the string length
        int numberLength= number.length();

        //Method call for finding the reverse of the number
        String result =reverseNumber(numberLength,number);
        //if the number and the reverse number is equal-> palindrome
        System.out.println("The number is " + (result.equals(number)? "palindrome" : "not-palindrome"));

    }

}
