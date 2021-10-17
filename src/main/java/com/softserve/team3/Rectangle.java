package team3.main.java.romanS.appParts.areaCalculations;

public class Rectangle implements Shape {
    private int sideA;
    private int sideB;
    @Override
    public double GetTotalArea() {
        return sideA * sideB;
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
    public int getSideB() {
        return sideB;
    }
    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}
