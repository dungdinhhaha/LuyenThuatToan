package oop;

public class HinhTamGiac extends Hinh {
    private double canhA, canhB, canhC;

    public HinhTamGiac() {}
    public HinhTamGiac(String mauVien, String mauNen, double canhA, double canhB, double canhC) {
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
    public double tinhChuVi() {
        return canhA + canhB + canhC;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - canhA) * (p - canhB) * (p - canhC));
    }

    @Override
    public void hienThi() {
        System.out.println("Hình tam giác: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", cạnh A=" + canhA + ", cạnh B=" + canhB + ", cạnh C=" + canhC + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
