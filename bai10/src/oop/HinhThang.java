
package oop;

public class HinhThang extends TuGiac {
    private double chieuCao;

    public HinhThang() {}

    public HinhThang(String mauVien, String mauNen, double canhA, double canhB, double canhC, double canhD, double chieuCao) {
        super(mauVien, mauNen, canhA, canhB, canhC, canhD);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() { return chieuCao; }
    public void setChieuCao(double chieuCao) { this.chieuCao = chieuCao; }

    @Override
    public double getArea() {
        // Giả sử canhA và canhC là hai đáy song song
        return 0.5 * (getCanhA() + getCanhC()) * chieuCao;
    }

    @Override
    public void showMe() {
        System.out.println("HinhThang: mauVien=" + getBorderColor() + ", mauNen=" + getFillColor() + ", cacCanh=" + getCanhA() + "," + getCanhB() + "," + getCanhC() + "," + getCanhD() + ", chieuCao=" + chieuCao + ", chuVi=" + getPerimeter() + ", dienTich=" + getArea());
    }
}
