package conditionalStatement;

import java.util.Scanner;

public class oddEven {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no = ");
        int x=sc.nextInt();
        if(x%2==0) System.out.println("Even number");
         else System.out.println("odd number");

    }
}
