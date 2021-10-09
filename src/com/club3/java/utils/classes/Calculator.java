package com.club3.java.utils.classes;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Calculator {

    public double getTotalArea(Triangle triangle) {
        return (triangle.triangleBase * triangle.triangleHeight) / 2;
    }

    public double getTotalArea(Square square) {
        return square.side * square.side;
    }

    public double getTotalArea(Rectangle rectangle) {
        return rectangle.width * rectangle.height;
    }

    public double getTotalArea(Circle circle) {
        return 3.14111111 * (circle.radius * circle.radius);
    }

    public double getTotalArea(Rectangle rectangle, Rectangle rectangle1, Circle circle, Square square, Triangle triangle) {
        return (rectangle.height * rectangle.width) + (rectangle1.width * rectangle1.height) + (3.14 * (circle.radius * circle.radius))
                + (square.side * square.side) + ((triangle.triangleBase * triangle.triangleHeight) / 2);
    }

    public double getTotalArea(Rectangle rectangle, Rectangle rectangle1) throws NumberFormatException {
        double total = (rectangle.height * rectangle.width) + (rectangle1.width * rectangle1.height);
        DecimalFormat df = new DecimalFormat("#,##");
        df.setRoundingMode(RoundingMode.UP);
        double s = Double.parseDouble(df.format(total));
        return s;
    }

    public double getTotalArea() {
        return 0.0;
    }
}
