package oop;

public abstract class Xe {
    private String mauSon;
    private double trongLuong;

    public Xe() {}
    public Xe(String mauSon, double trongLuong) {
        this.mauSon = mauSon;
        this.trongLuong = trongLuong;
    }

    public String getMauSon() { return mauSon; }
    public void setMauSon(String mauSon) { this.mauSon = mauSon; }
    public double getTrongLuong() { return trongLuong; }
    public void setTrongLuong(double trongLuong) { this.trongLuong = trongLuong; }

    public abstract void chay();
    public abstract void dungLai();
    public abstract void choNguoi();
    public abstract void hienThi();
}
