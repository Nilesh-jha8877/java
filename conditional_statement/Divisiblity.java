package conditionalStatement;

import java.util.Scanner;

public class Divisiblity {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0) System.out.println("number is divisible by 5 and 3 both :");
        else if(n%5==0) System.out.println("number is divisible by 5 ");
        else if (n%3==0) System.out.println("nunber divisible by 3");
        else System.out.println("nunber is not divisible by three");

        }
    }

