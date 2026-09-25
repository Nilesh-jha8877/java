package LoopsInJava;

import java.util.Scanner;

public class AtoPowerB {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a  :");
        int a=sc.nextInt();
        System.out.print("Enter the value of b  :");
        int b=sc.nextInt();
        int p=1;
        for (int i =1; i<=b; i++) {
            p*=a;
        }
        System.out.print("The value of a to power b is   :"+ p);
    }
}
