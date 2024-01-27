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
        
        double halfWidth = size / 2.0;
        double halfHeight = size / 2.0;
        for (double y = -halfHeight; y < halfHeight; y += increment) {
            for (double x = -halfWidth; x <= halfWidth; x += increment) {
                add(new Point2d(x, -y));
            }
        }
    }
}
