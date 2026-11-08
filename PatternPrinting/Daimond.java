package PatternPrintingInJAVA;

import java.util.Scanner;

public class Daimond {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row and column :");
        int r = sc.nextInt();
        int nsp=r-1;
        int nst=1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=nsp;j++){
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("*"+" ");
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }
         nsp=1;
         nst=2*r-3;
        for (int i = 1; i <= r-1; i++) {
            for (int j = 1; j <=nsp;j++){
                System.out.print("  ");
            }
            for (int k = 1; k <=nst; k++) {
                System.out.print("*"+" ");
            }
            nsp+=1;
            nst-=2;
            System.out.println();
        }

    }
}
