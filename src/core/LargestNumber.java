package core;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Three Numbers to find the Largest Number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max;

        if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        } else {
            max = num1;
        }
        System.out.println("The Largest Number is: " + max);
    }
}
