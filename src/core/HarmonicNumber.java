package core;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int harmonic;
        double sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        harmonic = sc.nextInt();

        for (int i = 1; i <= harmonic; i++) {
            System.out.println("1/" + i + "+");
            sum = sum + (double) 1 / i; // sum for number
        }
        System.out.println("Sum of Harmonic Numbers is: " + sum);
    }
}
