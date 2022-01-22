package laba1.classes.task9.util;

import java.util.ArrayList;

/**
 * Class Basket
 */
public class Basket
{
    /**
     * Balls inside the basket
     */
    private ArrayList<Ball> balls;

    /**
     * Balls sum weight
     */
    private double weight;

    /**
     * Create new basket
     */
    public Basket() {
        this.balls = new ArrayList<>();
    }

    /**
     * Create new basket and add new balls
     *
     * @param balls - balls
     */
    public Basket(ArrayList<Ball> balls)
    {
        this.balls = new ArrayList<>();
        for (Ball ball: balls) {
            addBall(ball);
        }
    }

    /**
     * Add new ball
     *
     * @param ball - ball
     */
    public void addBall(Ball ball)
    {
        this.balls.add(ball);
        this.weight += ball.weight;
    }

    /**
     * Get balls with specifical color
     *
     * @param color - ball color
     * @return int
     */
    public int getColorCount(Color color) {
        int ballsCount = 0;

        for (Ball  ball: balls) {
            if (ball.color == color) {
                ballsCount++;
            }
        }

        return ballsCount;
    }

    /**
     * Get balls sum weight
     *
     * @return double
     */
    public double getWeight() {
        return this.weight;
    }
}