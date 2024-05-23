package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        int [] numberArray  = {15,23,32,46,54,67,70,81,92,100};
        Scanner input = new Scanner(System.in);

        //It will get the input for 5 times.
        int i=0;
        while(i<5){
            System.out.print("Enter the index:" );
            int index = input.nextInt();

            try{
                int result = getElement(numberArray,index);
                System.out.println(result);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            finally {
                i++;
            }
        }
    }
    //method for getting the element from the array
    static int getElement(int[] numberArray,int index){
        return numberArray[index];
    }
}

