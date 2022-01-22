package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task7 - gnome sort
 */
public class Task7 {
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
     * Gnome sort
     *
     * @param array - source array
     */
    private static void gnomeSort(double[] array)
    {
        int i = 1, j = i + 1;

        while (i < array.length) {
            if (array[i - 1] < array[i]) {
                i = j;
                j++;
            }
            else {
                double temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                i--;
                if (i == 0) {
                    i = j;
                    j++;
                }
            }
        }
    }

    /**
     * Print result array
     *
     * @param array - sorted array
     */
    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        double[] array = getArray(getN());
        gnomeSort(array);
        printArray(array);
    }
}
