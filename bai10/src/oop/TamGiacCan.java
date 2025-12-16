
package oop;

public class TamGiacCan extends TamGiac {
    public TamGiacCan() {}

    public TamGiacCan(String mauVien, String mauNen, double day, double canhBen) {
        super(mauVien, mauNen, day, canhBen, canhBen);
    }

    @Override
    public void showMe() {
        System.out.println("TamGiacCan: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", day=" + getCanhA() + ", canhBen=" + getCanhB() + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
