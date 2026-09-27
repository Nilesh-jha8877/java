package LoopsInJava;

import java.util.Scanner;

public class CountDigitOfNumnber {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        if (n==0) n=1;
        int count=0;
        while (n!=0){
             n=n/10;
                count++;
        }
        System.out.println("The no of digit in given number is :"+count);
    }
}
