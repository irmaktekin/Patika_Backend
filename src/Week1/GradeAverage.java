package Week2;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args ){
        int lessonCount=0;
        int sumGrade=0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the math grade:");
        int mathGrade = input.nextInt();

        System.out.println("Enter the physic grade:");
        int physicGrade = input.nextInt();

        System.out.println("Enter the turkish grade:");
        int turkishGrade = input.nextInt();

        System.out.println("Enter the chemistry grade:");
        int chemGrade = input.nextInt();

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

        System.out.println("Average is:"+sumGrade/lessonCount);






    }
}
