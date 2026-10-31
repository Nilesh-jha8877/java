package PatternPrintingInJAVA;

import java.util.Scanner;

public class BasicPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of row :");
        int r=sc.nextInt();
        System.out.println("Enter the no of column  :");
        int c=sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=c; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
