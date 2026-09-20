package conditionalStatement;

import java.util.Scanner;

public class checkInteger {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value ");
        double n=sc.nextDouble();
        int x=(int)n;
        if(x-n>0){
            System.out.println("not an integer");
        }
        else System.out.println("is an integer");
    }
}
