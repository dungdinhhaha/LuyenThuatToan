package oop;

public class HinhTamGiacVuong extends HinhTamGiac {
    public HinhTamGiacVuong() {}
    public HinhTamGiacVuong(String mauVien, String mauNen, double canhA, double canhB) {
        super(mauVien, mauNen, canhA, canhB, Math.sqrt(canhA * canhA + canhB * canhB));
    }

    @Override
    public void hienThi() {
        System.out.println("Hình tam giác vuông: màu viền=" + getMauVien() + ", màu nền=" + getMauNen() + ", cạnh góc vuông A=" + getCanhA() + ", cạnh góc vuông B=" + getCanhB() + ", cạnh huyền=" + getCanhC() + ", chu vi=" + tinhChuVi() + ", diện tích=" + tinhDienTich());
    }
}
