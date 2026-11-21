package PatternPrintingInJAVA;

import java.util.Scanner;

public class StarCross {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  odd no of row and column :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=r;j++){
                if (i==j||i+j==r+1)
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
