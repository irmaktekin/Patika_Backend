package Week1;

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args ){

        //Create scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Math grade:");

        // Get the input from the user
        int mathGrade = input.nextInt();
        System.out.println("Please enter your Physic grade:");

        int physicGrade = input.nextInt();
        System.out.println("Please enter your Chemistry grade:");

        int chemistryGrade = input.nextInt();
        System.out.println("Please enter your Turkish grade:");

        int turkishGrade = input.nextInt();
        System.out.println("Please enter your Music grade:");

        int musicGrade = input.nextInt();
        System.out.println("Please enter your History grade:");

        int historyGrade = input.nextInt();

        // Find the average grade
        double averageGrade = (mathGrade+physicGrade+chemistryGrade+turkishGrade+musicGrade+historyGrade)/6;
        System.out.println(averageGrade);

        String result = (averageGrade>60) ?("Sınıfı Geçti.") : ("Sınıfta Kaldı.");
        System.out.println(result);




    }
}


