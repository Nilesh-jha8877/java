package LoopsInJava;

import java.util.Scanner;

public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        int sum=0;
        while (n!=0) {
            sum = sum + n % 10;
            n=n/10;
        }
        if (sum<0) sum=-sum;
        System.out.println("The sum of digits of given number is :"+ sum);

    }
}
