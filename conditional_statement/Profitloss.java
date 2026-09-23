package conditionalStatement;

import java.util.Scanner;

public class Profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the coast price");
        int cp=sc.nextInt();
        System.out.println("enter the selling price");
        int sp=sc.nextInt();
        if (sp > cp) {
            System.out.println("There is profit "+(sp-cp));
        } else if (cp>sp) {
            System.out.println("There is loss "+(cp-sp));
        }
        else System.out.println("no profit no loss");
    }
}
