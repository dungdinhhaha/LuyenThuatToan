package oop;

public class HinhThoi extends HinhTuGiac {
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
    public double tinhDienTich() {
        return 0.5 * duongCheo1 * duongCheo2;
    }

    @Override
    public void hienThi() {
        System.out.println("Hình thoi: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", cạnh=" + getCanhA() + ", đường chéo 1=" + duongCheo1 + ", đường chéo 2=" + duongCheo2 + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
