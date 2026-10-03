package LoopsInJava;

import java.util.Scanner;

public class reverseprintin {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        System.out.println("The number in reverse order:");
        for (int i = n; i >0 ; i--) {
            System.out.println(i);
        }
    }
}
