package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task4 - find prime numbers
 */
public class Task4 {
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
     * @return int[]
     */
    public static int[] getArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    /**
     * Checking if a number is prime
     *
     * @param n - number
     * @return boolean
     */
    private static boolean isPrime(int n) {
        int flag = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                flag++;
            }
        }
        return (flag == 2);
    }

    /**
     * Print result
     */
    public static void printResult() {
        int[] array = getArray(getN());

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.print(i + ", ");
            }
        }
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        printResult();
    }
}
