
package oop;

public class HinhThoi extends TuGiac {
    private double duongCheo1, duongCheo2;

    public HinhThoi() {}

    public HinhThoi(String mauVien, String mauNen, double canh, double duongCheo1, double duongCheo2) {
        super(mauVien, mauNen, canh, canh, canh, canh);
        this.duongCheo1 = duongCheo1;
        this.duongCheo2 = duongCheo2;
    }

    public double getDuongCheo1() { return duongCheo1; }
    public void setDuongCheo1(double duongCheo1) { this.duongCheo1 = duongCheo1; }
    public double getDuongCheo2() { return duongCheo2; }
    public void setDuongCheo2(double duongCheo2) { this.duongCheo2 = duongCheo2; }

    @Override
    public double getArea() {
        return 0.5 * duongCheo1 * duongCheo2;
    }

    @Override
    public void showMe() {
        System.out.println("HinhThoi: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", canh=" + getCanhA() + ", duongCheo1=" + duongCheo1 + ", duongCheo2=" + duongCheo2 + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
