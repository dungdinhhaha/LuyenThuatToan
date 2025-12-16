
package oop;

public class TamGiacVuong extends TamGiac {
    public TamGiacVuong() {}

    public TamGiacVuong(String mauVien, String mauNen, double canhA, double canhB) {
        super(mauVien, mauNen, canhA, canhB, Math.sqrt(canhA * canhA + canhB * canhB));
    }

    @Override
    public void showMe() {
        System.out.println("TamGiacVuong: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", canhA=" + getCanhA() + ", canhB=" + getCanhB() + ", canhC=" + getCanhC() + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
