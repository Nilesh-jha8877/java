package LoopsInJava;

import java.util.Scanner;

public class REverseAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no  :");
        int n=sc.nextInt();
        int originalnumber=n;
        int sum=0;
        int r=0;
        while(n!=0){
            sum+=(n%10);
            r*=10;
            r=r+(n%10);
            n/=10;
        }
        System.out.println("The sum of " + originalnumber +" is :"+ sum);
        System.out.println("The reverse of didits of "+ originalnumber +" is :"+r);
    }
}
