
package oop;

public class TuGiac extends Shape {
    private double canhA, canhB, canhC, canhD;

    public TuGiac() {}

    public TuGiac(String mauVien, String mauNen, double canhA, double canhB, double canhC, double canhD) {
        super(mauVien, mauNen);
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
        this.canhD = canhD;
    }

    public double getCanhA() { return canhA; }
    public void setCanhA(double canhA) { this.canhA = canhA; }
    public double getCanhB() { return canhB; }
    public void setCanhB(double canhB) { this.canhB = canhB; }
    public double getCanhC() { return canhC; }
    public void setCanhC(double canhC) { this.canhC = canhC; }
    public double getCanhD() { return canhD; }
    public void setCanhD(double canhD) { this.canhD = canhD; }

    @Override
    public double getPerimeter() {
        return canhA + canhB + canhC + canhD;
    }

    @Override
    public double getArea() {
        // Mặc định: chưa cài đặt, lớp con sẽ override
        return 0;
    }

    @Override
    public void showMe() {
        System.out.println("TuGiac: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", cacCanh=" + canhA + "," + canhB + "," + canhC + "," + canhD + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
