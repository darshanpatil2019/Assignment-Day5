package core;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        beforeSwap(num1, num2); //method
        afterSwap(num1, num2); //method
    }

    static void beforeSwap(int num1, int num2) {
        System.out.println("Before Swapping: " + num1 + " " + num2 + " ");
    }

    static void afterSwap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping: " + num1 + " " + num2 + " ");
    }
}
