package LoopsInJava;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no  :");
        int n=sc.nextInt();
        System.out.print("The factorial of given no " +n +" is :");
        int fact=1;
        while (n!=0){
            fact=fact*n;
            n--;
        }
        System.out.print(+ fact );
    }
}
