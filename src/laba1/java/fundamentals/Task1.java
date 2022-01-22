package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task1 - calculate function result
 */
public class Task1 {
    /**
     * Get x value
     *
     * @return double
     */
    public static double getX() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x: ");

        return scanner.nextDouble();
    }

    /**
     * Get y value
     *
     * @return double
     */
    public static double getY() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter y: ");

        return scanner.nextDouble();
    }

    /**
     * Get function result
     *
     * @param x - x value
     * @param y - y value
     * @return double
     */
    private static double calculateResult(double x, double y) {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - (2 * x) / (1 + Math.pow(x * y, 2)));

        return numerator / denominator + x;
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        System.out.print("Function result: " + calculateResult(getX(), getY()));
    }
}
