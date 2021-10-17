package team3.main.java.romanS.appParts.areaCalculations;

public class Circle implements Shape {
    private int radius;
    private static final double PI = 3.1415926;

    public double GetTotalArea() {
        return Math.pow(this.radius, 2) * PI;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
