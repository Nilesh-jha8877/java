package LoopsInJava;

import java.util.Scanner;

public class PrintReverseAp {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        System.out.println("The AP upto n term in reverse way");
        for (int i = n; i >0 ; i=i-4) {
            System.out.println(i);
        }
    }
}
