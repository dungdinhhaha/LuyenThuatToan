
package oop;

public class TamGiac extends Shape {
    private double canhA, canhB, canhC;

    public TamGiac() {}

    public TamGiac(String mauVien, String mauNen, double canhA, double canhB, double canhC) {
        super(mauVien, mauNen);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double getCanhA() { return canhA; }
    public void setCanhA(double canhA) { this.canhA = canhA; }
    public double getCanhB() { return canhB; }
    public void setCanhB(double canhB) { this.canhB = canhB; }
    public double getCanhC() { return canhC; }
    public void setCanhC(double canhC) { this.canhC = canhC; }

    @Override
    public double getPerimeter() {
        return canhA + canhB + canhC;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    @Override
    public void showMe() {
        System.out.println("TamGiac: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", canhA=" + canhA + ", canhB=" + canhB + ", canhC=" + canhC + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
