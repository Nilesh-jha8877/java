package PatternPrintingInJAVA;

import java.util.Scanner;

public class OddFloydTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  odd no of row and column :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            int a=1;
            for (int j = 1; j <=i;j++){
                    System.out.print(a+" ");
                a=a+2;
            }
            System.out.println();
        }
    }
}
