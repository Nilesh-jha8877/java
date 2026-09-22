package conditionalStatement;

import java.util.Scanner;

public class GretestOfThreeNo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value a ");
        int a=sc.nextInt();
        System.out.println("enter the value b ");
        int b=sc.nextInt();
        System.out.println("enter the value c ");
        int c=sc.nextInt();
//        if(a>=b && a>=c) System.out.println("a is greatest " + a);
//        else if (b>=a && b>=c) System.out.println("b is greatest"+ b);
//        else if (c>=a && c>=b)System.out.println("c is greatest" +c);
        if(a>b){
            if(a>c) System.out.println("a is greatest");
            else System.out.println("c is greatest");
        }
        else{
            if(b>c) System.out.println("b is greatest ");
            else System.out.println("c is greatest");
        }
    }
}