package laba1.classes.task9.main;

import laba1.classes.task9.util.Basket;
import laba1.classes.task9.util.Ball;
import laba1.classes.task9.util.Color;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Main
 */
public class Main {
    /**
     * Main function
     *
     * @param args - arguments
     */
    public static void main(String[] args) {
        // Get group of balls
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.5),
                new Ball(Color.RED, 0.7),
                new Ball(Color.RED, 0.3),
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.YELLOW, 0.4)
        ));

        // Create new basket with balls
        Basket basket = new Basket(balls);

        System.out.print("Balls with blue color: ");
        System.out.println(basket.getColorCount(Color.BLUE));

        System.out.print("Balls sum weight: ");
        System.out.println(basket.getWeight());
    }
}
