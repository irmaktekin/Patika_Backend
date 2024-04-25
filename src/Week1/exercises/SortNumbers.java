package Week1;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args){
        /*The case which the numbers are equal will also handled.*/

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = input.nextInt();

        System.out.println("Enter the second number: ");
        num2 = input.nextInt();

        System.out.println("Enter the third number: ");
        num3 = input.nextInt();

        // Check if all of them is equal
        if(num1==num2 && num2==num3){
            System.out.println(num1+"="+num2+"="+num3);
        }
        //If two of them is equal, check with the third one
        else if(num2==num3){
            if(num3<num1){
                System.out.println(num2+"="+num3+"<"+num1);
            }
            else{
                System.out.println(num1+"<"+num2+"="+num3);
            }
        }
        //If two of them is equal, check with the third one
        else if(num1==num3){
            if(num1<num2){
                System.out.println(num1+"="+num3+"<"+num2);
            }
            else{
                System.out.println(num2+"<"+num1+"="+num3);
            }
        }
        //If two of them is equal, check with the third one
        else if(num1==num2){
            if(num1<num3){
                System.out.println(num1+"="+num2+"<"+num3);
            }
            else{
                System.out.println(num3+"<"+num1+"="+num2);
            }
        }
        /*If no equality occurs,check other cases*/
        else {
            /*if num1 is both smaller than num2 and num3, it means the smallest->num1
            Check the other two number and print the result*/
            if (num1 < num2 && num1<num3) {
                if (num2 < num3) {
                    System.out.println(num1 + "<" + num2 + "<" + num3);
                } else {
                    System.out.println(num1 + "<" + num3 + "<" + num2);
                }
            }
            /*if num2 is both smaller than num1 and num3, it means the smallest->num2
            Check the other two number and print the result*/
            else if(num2<num1 && num2<num3) {
                if (num1 < num3) {
                    System.out.println(num2 + "<" + num1 + "<" + num3);
                } else {
                    System.out.println(num2 + "<" + num3 + "<" + num1);
                }
            }
            /*if num3 is both smaller than num1 and num2, it means the smallest->num3
            Check the other two number and print the result*/
            else if(num3< num1 && num3<num2){
                if (num1 < num2) {
                    System.out.println(num3 + "<" + num1 + "<" + num2);
                } else {
                    System.out.println(num3 + "<" + num2 + "<" + num1);
                }
            }
        }
    }
}
