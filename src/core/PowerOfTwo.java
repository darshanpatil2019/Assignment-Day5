package core;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power for 2");
        int num = sc.nextInt();
        int power = 1;
        int i = 0;

        if (num < 31 && num >= 0) //input number should be less than 31 & greater than 0
        {
            while (i < num) {
                power = 2 * power; //for power of 2
                i++;
            }
        }
        System.out.println("2^" + num + " is = " + " " + power);
    }
}

