package conditionalStatement;

import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of rectangle = ");
        double x=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle = ");
        double y=sc.nextDouble();
        double area=x*y;
        double perimeter=2*(x+y);
        String result=(area>perimeter?"area":"perimeter");
        System.out.print(" greater is  "+ result);
    }
}
