package helloworld.java;

import java.util.Scanner;

public class areaofcircle {
    static void main() {
//        double r=9.8;
//        double a=3.14*r*r;
//        System.out.println("Area of circle is =" + a);
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of r = ");
        double r=sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println("the area of circle =" +a);
        sc.close();
    }
}
