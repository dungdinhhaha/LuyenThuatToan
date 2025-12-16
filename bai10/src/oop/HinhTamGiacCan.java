package oop;

public class HinhTamGiacCan extends HinhTamGiac {
    public HinhTamGiacCan() {}
    public HinhTamGiacCan(String mauVien, String mauNen, double day, double canhBen) {
        super(mauVien, mauNen, day, canhBen, canhBen);
    }

    @Override
    public void hienThi() {
        System.out.println("Hình tam giác cân: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", đáy=" + getCanhA() + ", cạnh bên=" + getCanhB() + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
