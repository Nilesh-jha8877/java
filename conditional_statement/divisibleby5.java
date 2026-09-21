package conditionalStatement;

import java.util.Scanner;

public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no = ");
        int x=sc.nextInt();
        String divisible=(x%5==0?"yes":"no");
        System.out.print(divisible);
    }
}