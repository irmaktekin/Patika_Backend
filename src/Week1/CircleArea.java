package Week1;

import java.util.Scanner;

public class CircleArea {
    static final double PI = 3.14;
    public static void main(String[] args ){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the radius:");
        double radius = input.nextDouble();

        System.out.println("Enter the angle:");
        double angle = input.nextDouble();

        double area = (PI * (radius*radius)*angle)/360;
        System.out.println("Area of the circle is:"+area);

    }
}
