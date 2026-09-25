package LoopsInJava;

import java.util.Scanner;

public class Apprinting {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        System.out.println("The Ap upto n terms is :");
        for (int i = 2; i <=3*n-1; i=i+3) {
            System.out.println(i);
        }
    }
}
