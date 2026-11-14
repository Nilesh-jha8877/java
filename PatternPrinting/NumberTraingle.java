package PatternPrintingInJAVA;

import java.util.Scanner;

public class NumberTraingle {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row and column :");
        int r=sc.nextInt();
        for (int i = 1; i <=r ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
