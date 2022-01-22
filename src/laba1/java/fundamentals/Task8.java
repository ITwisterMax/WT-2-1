package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task8 - find positions
 */
public class Task8 {
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
     * Create one result array
     *
     * @param array1 - first array
     * @param array2 - second array
     * @return double[]
     */
    private static double[] createArray(double[] array1, double[] array2) {
        double[] result = new double[array1.length + array2.length];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        return result;
    }

    /**
     * Print positions
     *
     * @param sourceArray - source array
     * @param sortedArray - sorted array (array1 + array2)
     */
    public static void printPositions(double[] sourceArray, double[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            for (int j = 0; j < sourceArray.length; j++) {
                if (sortedArray[i] == sourceArray[j]) {
                    System.out.print(i + ", ");
                    break;
                }
            }
        }
    }

    /**
     * Find positions
     */
    private static void findPositions() {
        double[] array1 = getArray(getN());
        double[] array2 = getArray(getN());

        double[] resultArray = createArray(array1, array2);
        gnomeSort(resultArray);

        printPositions(array2, resultArray);
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        findPositions();
    }
}
