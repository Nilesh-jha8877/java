package LoopsInJava;

import java.util.Scanner;

public class GPprinting {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        int a=1,r=2;
        System.out.println("The GP upto N term is ");
        for (int i = 1; i <=n; i++) {
            System.out.println(a);
           a=a*2;
//            System.out.println(a);
        }
    }
}
