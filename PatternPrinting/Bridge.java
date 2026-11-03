package PatternPrintingInJAVA;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row and column :");
        int r = sc.nextInt();
        for (int l =1; l <=2*r-1 ; l++) {
            System.out.print("*"+" ");
        }
        System.out.println();
        int nsp=1;
        for (int i = 1; i <=r-1; i++) {

            for (int j = 1; j <=r-i;j++){
                System.out.print("*"+" ");
            }
            for (int k = 1; k <=nsp; k++) {
                System.out.print("  ");
            }
            for (int t = 1; t <=r-i;t++){
                System.out.print("*"+" ");
            }
            nsp+=2;

            System.out.println();
        }
    }
}
