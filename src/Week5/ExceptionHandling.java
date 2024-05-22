package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        int [] numberArray  = {1,2,3,4,5,6,7,8,9,10};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index:" );
        int index = input.nextInt();

        try{
            int result = getElement(numberArray,index);
            System.out.println(result);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static int getElement(int[] numberArray,int index){
        return numberArray[index];
    }
}

