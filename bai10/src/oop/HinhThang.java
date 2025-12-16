package oop;

public class HinhThang extends HinhTuGiac {
    private double chieuCao;

    public HinhThang() {}
    public HinhThang(String mauVien, String mauNen, double dayLon, double dayNho, double canhBen1, double canhBen2, double chieuCao) {
        super(mauVien, mauNen, dayLon, canhBen1, dayNho, canhBen2);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() { return chieuCao; }
    public void setChieuCao(double chieuCao) { this.chieuCao = chieuCao; }

    @Override
    public double tinhDienTich() {
        // Giả sử canhA và canhC là hai đáy song song
        return 0.5 * (getCanhA() + getCanhC()) * chieuCao;
    }

    @Override
    public void hienThi() {
        System.out.println("Hình thang: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", các cạnh=" + getCanhA() + "," + getCanhB() + "," + getCanhC() + "," + getCanhD() + ", chiều cao=" + chieuCao + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
