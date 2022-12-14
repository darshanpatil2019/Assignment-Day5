package core;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        //Variables

        int headCount = 0;
        int tailCount = 0;
        int counter = 1;
        int flips = 0;
        double headPercentage;
        double tailPercentage;
        System.out.println("How many times you want to flip the coin");
        Scanner sc = new Scanner(System.in);
        flips = sc.nextInt(); //input

        if (flips < 0) {
            System.out.println("Enter the correct number of flips counts");
        } else {
            while (counter <= flips) {
                double randomNum = Math.random(); //Random Function
                if (randomNum < 0.5) {
                    headCount++; //if we get "Head" then HeadCount will increment
                    System.out.println(counter + " " + randomNum);
                } else {
                    tailCount++; //if we get "Tail" then TailCount will increment
                    System.out.println(counter + " " + randomNum);
                }
                counter++;
            }

            headPercentage = (headCount * 100) / flips; // calculate Head Percentage
            System.out.println("Head Percentage:" + headPercentage);
            tailPercentage = (tailCount * 100) / flips; // // calculate Tail Percentage
            System.out.println("Tail Percentage: " + tailPercentage);

        }
    }
}

