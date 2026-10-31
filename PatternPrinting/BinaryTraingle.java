package PatternPrintingInJAVA;

import java.util.Scanner;

public class BinaryTraingle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  odd no of row and column :");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <=i;j++){
                if ((i+j)%2==0) {
                    System.out.print(1 +" ");
                }
                else
                    System.out.print(0 +" ");
            }
            System.out.println();
        }
    }
}
