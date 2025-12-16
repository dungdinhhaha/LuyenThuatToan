package oop;

public class HinhTron extends Hinh {
    private double banKinh;

    public HinhTron() {}
    public HinhTron(String mauVien, String mauNen, double banKinh) {
        super(mauVien, mauNen);
        this.banKinh = banKinh;
    }

    public double getBanKinh() { return banKinh; }
    public void setBanKinh(double banKinh) { this.banKinh = banKinh; }

    @Override
    public double tinhChuVi() {
        return 2 * Math.PI * banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }

    @Override
    public void hienThi() {
        System.out.println("Hình tròn: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", bán kính=" + banKinh + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
