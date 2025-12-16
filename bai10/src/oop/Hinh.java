package oop;

public abstract class Hinh {
    private String mauVien;
    private String mauNen;

    public Hinh() {}
    public Hinh(String mauVien, String mauNen) {
        this.mauVien = mauVien;
        this.mauNen = mauNen;
    }

    public String getMauVien() { return mauVien; }
    public void setMauVien(String mauVien) { this.mauVien = mauVien; }
    public String getMauNen() { return mauNen; }
    public void setMauNen(String mauNen) { this.mauNen = mauNen; }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
    public abstract void hienThi();
}
