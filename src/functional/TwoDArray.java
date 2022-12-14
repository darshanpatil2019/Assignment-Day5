package functional;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values for m and n: ");
        int m = sc.nextInt(); //input for array
        int n = sc.nextInt(); //input for array
        int array[][] = new int[m][n]; // 2D array
        takeInput(m, n, array); //method calling
    }

    static void takeInput(int m, int n, int[][] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for the 2D arrays of dimensions: " + m + " x " + n);
        for (int i = 0; i < m; i++) { //loop for array 'm'
            for (int j = 0; j < n; j++) { // loop for array 'n'
                array[i][j] = sc.nextInt(); //print combine 'm & n'
            }
        }
        printArray(array);
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) { //iterations for array 'm'
            for (int j = 0; j < array[i].length; j++) { //iterations for array 'n'
                System.out.println(array[i][j] + " ");
            }
            System.out.println();

        }
    }
}
