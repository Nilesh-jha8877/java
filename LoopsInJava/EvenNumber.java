package LoopsInJava;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no  :");
        int n=sc.nextInt();
        System.out.println("The even no of following range is :");
        for (int i = 0; i <=n; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
