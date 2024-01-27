package Letter;

import Point.Point2d;
import Shape.*;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;
    final static Double CirclemaxWidth = maxWidth + 12;
    final static Double zero = 0.0;
    final static Double diagonalForN = 0.39;
    final static Double diagonalForA = 0.25;
    final static Double horizontal = 90 * Math.PI / 180;
    final static Double adjustUpE = 4.0;
    final static Double adjustDownE = 5.0;




    /**
     * TODO
     * Create the letter A graphically
     *
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A() {
        BaseShape letterA = new BaseShape();

        Rectangle middleLine = new Rectangle(halfStripeThickness, halfMaxWidth);
        middleLine.rotate(middleLine.getCoords(), horizontal);
        middleLine.translate(middleLine.getCoords(), new Point2d(stripeThickness, zero));
        letterA.add(middleLine);

        Rectangle diagonalRectangle = new Rectangle(halfStripeThickness, maxHeight + halfStripeThickness);
        diagonalRectangle.rotate(diagonalRectangle.getCoords(), diagonalForA);
        letterA.add(diagonalRectangle);

        Rectangle SecDiagonalRectangle = new Rectangle(halfStripeThickness, maxHeight + halfStripeThickness);
        SecDiagonalRectangle.rotate(SecDiagonalRectangle.getCoords(), -diagonalForA);
        SecDiagonalRectangle.translate(SecDiagonalRectangle.getCoords(), new Point2d(halfMaxWidth + halfStripeThickness, zero));
        letterA.add(SecDiagonalRectangle);

        return letterA;
    }

    /**
     * TODO
     * Create the letter B graphically
     *
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        Ellipse upCircle = new Ellipse(CirclemaxWidth,CirclemaxWidth);
        Ellipse downCircle = new Ellipse(CirclemaxWidth,CirclemaxWidth);

        upCircle.translate(upCircle.getCoords(), new Point2d(halfMaxWidth, halfMaxHeight / 2));
        downCircle.translate(downCircle.getCoords(), new Point2d(halfMaxWidth, -halfMaxHeight / 2));

        letterB.add(new Rectangle(stripeThickness, maxHeight));
        letterB.add(upCircle);
        letterB.add(downCircle);

        return letterB;
    }

    /**
     * TODO
     * Create the letter C graphically
     *
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new Ellipse(maxWidth, maxHeight);

        Rectangle gap = new Rectangle(stripeThickness, halfMaxHeight);
        gap.translate(gap.getCoords(),new Point2d(halfMaxWidth, zero));
        letterC.remove(gap);

        return letterC;
    }

    /**
     * TODO
     * Create the letter E graphically
     *
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape letterE = new BaseShape();

        letterE.add(new Rectangle(halfStripeThickness, maxHeight));

        Rectangle middleLine = new Rectangle(halfStripeThickness, maxWidth);
        middleLine.rotate(middleLine.getCoords(), horizontal);
        middleLine.translate(middleLine.getCoords(), new Point2d(halfMaxWidth, zero));
        letterE.add(middleLine);

        Rectangle lowerLine = middleLine.clone();
        lowerLine.translate(lowerLine.getCoords(), new Point2d(zero, halfMaxHeight - adjustUpE));
        letterE.add(lowerLine);

        Rectangle upLine = middleLine.clone();
        upLine.translate(upLine.getCoords(), new Point2d(zero, -halfMaxHeight + adjustDownE));
        letterE.add(upLine);

        return letterE;
    }

    /**
     * TODO
     * Create the letter H graphically
     *
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {
        BaseShape letterH = new BaseShape();

        letterH.add(new Rectangle(halfStripeThickness, maxHeight));

        Rectangle rightRectangle = new Rectangle(halfStripeThickness, maxHeight);
        rightRectangle.translate(rightRectangle.getCoords(), new Point2d(maxWidth, zero));
        letterH.add(rightRectangle);

        Rectangle middleLine = new Rectangle(halfStripeThickness, maxWidth);
        middleLine.rotate(middleLine.getCoords(), horizontal);
        middleLine.translate(middleLine.getCoords(), new Point2d(halfMaxWidth, zero));
        letterH.add(middleLine);

        return letterH;
    }

    /**
     * TODO
     * Create the letter N graphically
     *
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle rightRectangle = new Rectangle(halfStripeThickness, maxHeight);
        rightRectangle.translate(rightRectangle.getCoords(), new Point2d(maxWidth, zero));
        letterN.add(rightRectangle);

        Rectangle diagonalRectangle = new Rectangle(halfStripeThickness, maxHeight + halfStripeThickness);
        diagonalRectangle.rotate(diagonalRectangle.getCoords(), -diagonalForN);
        diagonalRectangle.translate(diagonalRectangle.getCoords(), new Point2d(halfMaxWidth, zero));
        letterN.add(diagonalRectangle);

        letterN.add(new Rectangle(halfStripeThickness, maxHeight));

        return letterN;
    }

    /**
     * TODO
     * Create the letter O graphically
     *
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        return new Ellipse(maxWidth, maxHeight);
    }

}
