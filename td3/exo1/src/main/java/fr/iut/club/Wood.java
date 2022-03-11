package fr.iut.club;
<<<<<<< HEAD
=======

>>>>>>> 9525667439a0e99c0b6ed0393cac56604eb7d092
import fr.iut.Ball;

import java.awt.geom.Point2D;
/**
 * Simple putter club implementation.
 */
public class Wood implements Club {
    /**
     * inner constant used to compute new position after shoot
     */
    private final static int DISTANCE_MAX = 100;
    public void shoot(final double force, final double direction, final Ball ball) {
        double x = ball.getPosition().getX();
        double y = ball.getPosition().getY();
        x += (force * DISTANCE_MAX) * Math.sin(direction);
        y += (force * DISTANCE_MAX) * Math.cos(direction);
        ball.setPosition(new Point2D.Double(x, y));  }
}