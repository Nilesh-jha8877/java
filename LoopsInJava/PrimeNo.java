package LoopsInJava;

import java.util.Scanner;

public class PrimeNo {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        boolean flag=true;
        for (int i = 2; i <n-1 ; i++) {
            if (n%i==0)
                flag=false;
        }
        if (n==1) System.out.println("This is prime number");
        else if (flag==false) System.out.println("This is composite");
        else System.out.println("Prime number");
    }
}
