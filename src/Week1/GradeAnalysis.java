package Week1;

import java.util.Scanner;

public class GradeAnalysis {
    public static void main(String[] args ){
        /*Lesson count will hold the value for the number of lessons which has a grade between 0 and 100.
          It will be incremented if it is a valid grade. sumGrade will be hold the grades which is between
          0 and 100.*/

        int lessonCount=0, sumGrade=0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Math grade:");
        int mathGrade = input.nextInt();

        System.out.println("Enter the Physic grade:");
        int physicGrade = input.nextInt();

        System.out.println("Enter the Turkish grade:");
        int turkishGrade = input.nextInt();

        System.out.println("Enter the Chemistry grade:");
        int chemGrade = input.nextInt();

        /*For all lessons, if grade is between 0 and 100(inclusive),
        the grade will be added to the sumGrade variable.*/

        if(chemGrade >=0 && chemGrade<=100){
            sumGrade+=chemGrade;
            lessonCount++;
        }
        if(turkishGrade >=0 && turkishGrade<=100){
            sumGrade+=turkishGrade;
            lessonCount++;
        }
        if(physicGrade >=0 && physicGrade<=100){
            sumGrade+=physicGrade;
            lessonCount++;
        }
        if(mathGrade >=0 && mathGrade<=100){
            sumGrade+=mathGrade;
            lessonCount++;
        }
        /*calculate the average, check the average and display a result according to it.*/
        average = (double)sumGrade/lessonCount;

        if(average<=55){
            System.out.println("You failed.");
        }
        else{
            System.out.println("You passed.");
        }
        /*Display the average to the user.*/
        System.out.printf("Average is: %.2f",average);
    }
}
