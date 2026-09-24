package conditionalStatement;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first side of triangle = ");
        int x=sc.nextInt();
        System.out.print("Enter the second side of triangle = ");
        int y=sc.nextInt();
        System.out.print("Enter the third  side of triangle  = ");
        int z=sc.nextInt();
        if((x+y>z)&&(y+z>x)&&(z+x>y)){
            System.out.println("Triangle is possible");
        }
        else System.out.println("Triangle is not possible");
    }
}