package conditionalStatement;

import java.util.Scanner;

public class Absolutevalue {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value :");
        int n=sc.nextInt();
        if(n<0){
            n=-n;
        }
        System.out.println(n);
    }
}
