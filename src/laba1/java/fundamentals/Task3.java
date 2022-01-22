package laba1.java.fundamentals;

import java.util.Scanner;

/**
 * Class Task3 - calculate function result
 */
public class Task3 {
    /**
     * Get start point value
     *
     * @return int
     */
    public static double getStartPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");

        return scanner.nextDouble();
    }

    /**
     * Get stop point value
     *
     * @return double
     */
    public static double getStopPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter b: ");

        return scanner.nextDouble();
    }

    /**
     * Get step
     *
     * @return double
     */
    public static double getStep() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter h: ");

        return scanner.nextDouble();
    }

    /**
     * Get function result
     *
     * @param a - start point value
     * @param b - stop point value
     * @param h - step value
     */
    private static void calculateResult(double a, double b, double h) {
        if (((a < b) && (h > 0)) || ((a > b) && (h < 0))) {
            double x = a;
            if (h > 0) {
                while (x < b) {
                    System.out.format("%3.3f\t\t%5.5f\n", x, Math.tan(x));
                    x += h;
                }
            }
            else {
                while (x > b) {
                    System.out.format("%3.3f\t\t%5.5f\n", x, Math.tan(x));
                    x += h;
                }
            }
        }
        else {
            System.out.format("%3.3f\t\t%5.5f\n", a, Math.tan(a));
        }
        System.out.format("%3.3f\t\t%5.5f\n", b, Math.tan(b));
    }

    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        calculateResult(getStartPoint(), getStopPoint(), getStep());
    }
}
