package Week1;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args){
        double a,b,c,u,area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first edge:");
        a = input.nextDouble();
        System.out.println("Enter the second edge:");
        b= input.nextDouble();
        System.out.println("Enter the third edge:");
        c = input.nextDouble();

        // If one of the edge is 0 or negative number, don't calculate the area.
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Edge values cannot be equal to 0 or smaller than 0.");
        }
        //If values are positive, calculate the area.
        else{
            //a+b+c -> 2u
            u = (a+b+c)/2;
            //area formula for the triangle when we have the edge values.
            area = Math.sqrt(u*(u-a)*(u-b)*(u-c));
            System.out.println("Area of the triangle is: "+area);
        }
    }
}
