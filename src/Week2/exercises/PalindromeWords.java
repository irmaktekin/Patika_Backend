package Week2.exercises;

import java.util.Scanner;

public class PalindromeWords {
    static boolean isPalindrome(String word){
        String reversedWord="";
        boolean isPalindrome=false;

        //it starts from the last character and adds to the start
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord +=word.charAt(i);
        }
        // if it is equal to the original string->palindrome
        if(reversedWord.equals(word)){
            isPalindrome =true;
        }
        else{
            isPalindrome=false;
        }
        return isPalindrome;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = input.nextLine();
        //It prints according to the result of the method call
        System.out.println(isPalindrome(word) ? word + " is a palindrome." : word + " is not a palindrome.");
    }
}

