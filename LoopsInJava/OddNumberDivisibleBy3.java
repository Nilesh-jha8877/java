package LoopsInJava;

import java.util.Scanner;

public class OddNumberDivisibleBy3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        System.out.println("The no upto n term divisible by 3");
        for (int i = 0; i <=n; i++) {
            if (i%2!=0){
                if(i%3==0) System.out.println(i);
            }
        }
    }
}
