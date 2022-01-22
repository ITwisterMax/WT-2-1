package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task2 - сhecking if a point belongs to an area
 */
public class Task2 {
    /**
     * Get x value
     *
     * @return int
     */
    public static int getX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");

        return scanner.nextInt();
    }

    /**
     * Get y value
     *
     * @return int
     */
    public static int getY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter y: ");

        return scanner.nextInt();
    }

    /**
     * Сhecking if a point belongs to an area
     *
     * @param x - x value
     * @param y - y value
     * @return boolean
     */
    private static boolean checkPoint(int x, int y) {
        boolean isBottomArea = ((x >= -6) && (x <= 6)) && ((y >= -3) && (y <= 0));
        boolean isTopArea = ((x >= -4) && (x <= 4)) && ((y >= 0) && (y <= 5));

        return isBottomArea || isTopArea;
    }

    /**
     * Print result
     */
    public static void printResult() {
        if (checkPoint(getX(), getY())) {
            System.out.print("True");
        }
        else {
            System.out.print("False");
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
