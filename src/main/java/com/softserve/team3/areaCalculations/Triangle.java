package team3.main.java.romanS.appParts.areaCalculations;

public class Triangle implements Shape{
    private int catetA;
    private int catetB;

    public double GetTotalArea() {
        return (catetA * catetB) / 2;
    }

    public Triangle(int catetA, int catetB) {
        this.catetA = catetA;
        this.catetB = catetB;
    }

    public int getCatetA() {
        return catetA;
    }
    public void setCatetA(int catetA) {
        this.catetA = catetA;
    }
    public int getCatetB() {
        return catetB;
    }
    public void setCatetB(int catetB) {
        this.catetB = catetB;
    }
}
