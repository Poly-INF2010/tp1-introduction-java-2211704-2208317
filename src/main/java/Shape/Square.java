package Shape;

import Point.Point2d;

public class Square extends Rectangle {
    /**
     * TODO
     * Return a filled square centered on (0, 0)
     *
     * @param size The size of the sides of the square
     */
    public Square(Double size) {
        super(0.0, 0.0);
        double halfSize = size / 2.0;

        for (double y = -halfSize; y < halfSize; y += increment) {
            for (double x = -halfSize; x <= halfSize; x += increment) {
                add(new Point2d(x, -y));
            }
        }
    }
}
