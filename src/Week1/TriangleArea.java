package Week1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge:");
        int a = input.nextInt();
        System.out.println("Enter the second edge:");
        int b= input.nextInt();
        System.out.println("Enter the third edge:");
        int c = input.nextInt();

        double u = (a+b+c)/2;
        double area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Area of the triangle is: "+area);
    }
}
