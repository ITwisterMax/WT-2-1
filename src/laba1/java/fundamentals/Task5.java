package laba1.java.fundamentals;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

/**
 * Class Task5 - find min count
 */
public class Task5 {
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
     * Find min count
     *
     * @param array - source array
     * @return int
     */
    private static int numbersCount(int[] array) {
        if (array.length == 1) {
            return 0;
        }

        int[] result = new int[array.length];
        Arrays.fill(result, 1);

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j]) {
                    if (result[i] <= result[j]) {
                        result[i] = result[j] + 1;
                    }
                }
            }
        }

        return array.length - Arrays.stream(result).max().getAsInt();
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        int[] array = getArray(getN());
        System.out.print(numbersCount(array));
    }
}
