package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task6 - create new matrix from array
 */
public class Task6 {
    /**
     * Get array size
     *
     * @return int
     */
    public static int getN() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");

        return scanner.nextInt();
    }

    /**
     * Get array
     *
     * @param n - array size
     * @return double[]
     */
    public static double[] getArray(int n) {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    /**
     * Print result matrix
     */
    private static void printMatrix(){
        double[] array = getArray(getN());

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        printMatrix();
    }
}
