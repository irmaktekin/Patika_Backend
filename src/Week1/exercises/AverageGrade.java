package Week1;

import java.util.Scanner;

public class AverageGrade {

    public static void main(String[] args ){
        double mathGrade, physicGrade, chemistryGrade, turkishGrade, musicGrade,historyGrade;
        double gradeSum, averageGrade;

        //Create scanner object
        Scanner input = new Scanner(System.in);

        // Get the input from the user
        System.out.println("Please enter your Math grade:");
        mathGrade = input.nextDouble();

        System.out.println("Please enter your Physic grade:");
        physicGrade = input.nextDouble();

        System.out.println("Please enter your Chemistry grade:");
        chemistryGrade = input.nextDouble();

        System.out.println("Please enter your Turkish grade:");
        turkishGrade = input.nextDouble();

        System.out.println("Please enter your Music grade:");
        musicGrade = input.nextDouble();

        System.out.println("Please enter your History grade:");
        historyGrade = input.nextDouble();

        //Assigning sum of the grades to a variable
        gradeSum = mathGrade+physicGrade+chemistryGrade+turkishGrade+musicGrade+historyGrade;

        // Find the average grade
        averageGrade = gradeSum/6;
        System.out.println(averageGrade);

        // If the grade is 60 or higher, it prints -> "Sınıfı Geçti."
        // If the grade is smaller than 60, it prints -> "Sınıfta Kaldı."
        String result = (averageGrade>=60) ?("Sınıfı Geçti.") : ("Sınıfta Kaldı.");
        System.out.println(result);

    }
}


