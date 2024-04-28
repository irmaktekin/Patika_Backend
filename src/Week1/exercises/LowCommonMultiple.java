package Week1.exercises;

import java.util.Scanner;

public class LowCommonMultiple {
    public static void main(String[] args) {
        int ebob=1,ekok;

        //Input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("Enter num1:");
        int num1=input.nextInt();

        System.out.println("Enter num2:");
        int num2=input.nextInt();

        //Greates Common Divisior of any number with 0 is ->number
        //Least Common Multiple of any number with 0 is-> 0
        if(num2==0){
            ebob=num1;
            ekok=0;
        }
        else{
            int i=1;
            //If the divisior is >= both n1 and n2, check is i both divide number1 and number2 without remainder
            while(i<=num1&&i<=num2){
                if(num1%i==0 && num2%i==0){
                    ebob=i;
                }
                i++;
            }
            //calculate the least common multiple
            ekok = (num1*num2)/ebob;
        }
        //Print results
        System.out.printf("Greates Common Divisior of %d and %d is: %d\n",num1,num2,ebob);
        System.out.printf("Least Common Multiple of %d and %d is: %d\n",num1,num2,ekok);

    }
}

