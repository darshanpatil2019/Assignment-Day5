package core;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend value");
        int dividend = sc.nextInt();
        System.out.println("Enter the divisor value");
        int divisor = sc.nextInt();

        int Quotient , Remainder;

        Quotient = dividend / divisor;
        Remainder = dividend % divisor;

        System.out.println("Quotient is: " + Quotient);
        System.out.println("Remainder is: " + Remainder);
    }
}
