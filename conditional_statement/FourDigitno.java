package conditionalStatement;

import java.util.Scanner;

public class FourDigitno {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no = ");
        int x= sc.nextInt();
        if(999<x && x<10000)
            System.out.println("yes four digit no");
    else System.out.println("no it is not a four didit no");
    }


}
