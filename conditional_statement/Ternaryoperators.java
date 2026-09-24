package conditionalStatement;

import java.util.Scanner;

public class Ternaryoperators {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value a ");
        int a=sc.nextInt();
        System.out.println("enter the value b ");
        int b=sc.nextInt();
        System.out.println("enter the value c ");
        int c=sc.nextInt();
        int greatest=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("greatest no is : "+ greatest);
    }
}
