package LoopsInJava;

import java.util.Scanner;

public class CompositeNumber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        for (int i =2; i < n-1; i++) {
            if (n%i==0)
                System.out.println("The given no is composite :" + n);
            else System.out.println("The given no is not composite :" + n);
            break;

        }
    }
}
