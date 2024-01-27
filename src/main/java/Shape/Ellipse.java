package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /**
     * TODO
     * Create a filled Ellipse that is centered on (0, 0)
     *
     * @param widthDiameter  Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        super();
        double halfWidth = widthDiameter / 2;
        double halfHeight = heightDiameter / 2;
        double angleIncrement = 360;

        for (double angle = 0; angle < angleIncrement; angle++) {
            double x = halfWidth * Math.cos(angle);
            double y = halfHeight * Math.sin(angle);
            add(new Point2d(x, y));
        }
    }

    /**
     * TODO
     * Create a filled Ellipse that is centered on (0,0)
     *
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this(dimensions.X(), dimensions.Y());
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     *
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        super(coords);
    }

    /**
     * TODO
     *
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {
        return new Ellipse(cloneCoords());
    }
}
