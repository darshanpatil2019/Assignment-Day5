package core;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factors");
        int num = sc.nextInt();

        for (int i = 2; i <= num; i++) //prime factors start by 2
        {
            while (num % i == 0) //the number should be complete divisible by "i" number
            {
                System.out.println(i);
                num = num / i; // till divisible it is divides
            }
        }
    }
}
