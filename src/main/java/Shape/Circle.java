package Shape;

import Point.Point2d;

public class Circle extends Ellipse {
    /**
     * TODO
     * Create a filled circle that is centered on (0, 0)
     *
     * @param radius Radius of the Circle
     */
    public Circle(Double radius) {
        super(0.0, 0.0);
        double halfRadius = radius / 2;
        double angleIncrement = 360;

        for (int angle = 0; angle < angleIncrement; angle++) {
            double x = halfRadius * Math.cos(angle);
            double y = halfRadius * Math.sin(angle);
            add(new Point2d(x, y));
        }
    }
}
