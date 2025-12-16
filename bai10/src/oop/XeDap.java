package oop;

public class XeDap extends XeHaiBanh {
    public XeDap() {}
    public XeDap(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void chay() {
        System.out.println("Xe đạp đang chạy");
    }

    @Override
    public void dungLai() {
        System.out.println("Xe đạp đã dừng lại");
    }

    @Override
    public void choNguoi() {
        System.out.println("Xe đạp đang chở người");
    }

    public void doXang() {
        System.out.println("Xe đạp không thể đổ xăng");
    }

    @Override
    public void hienThi() {
        System.out.println("Xe đạp: màu sơn=" + getMauSon() + ", trọng lượng=" + getTrongLuong() + ", có chân chống=" + isCoChanChong());
    }
}
