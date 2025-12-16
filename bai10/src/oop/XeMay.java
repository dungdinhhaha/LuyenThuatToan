package oop;

public class XeMay extends XeHaiBanh {
    public XeMay() {}
    public XeMay(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void chay() {
        System.out.println("Xe máy đang chạy");
    }

    @Override
    public void dungLai() {
        System.out.println("Xe máy đã dừng lại");
    }

    @Override
    public void choNguoi() {
        System.out.println("Xe máy đang chở người");
    }

    public void doXang() {
        System.out.println("Xe máy đang được đổ xăng");
    }

    @Override
    public void hienThi() {
        System.out.println("Xe máy: màu sơn=" + getMauSon() + ", trọng lượng=" + getTrongLuong() + ", có chân chống=" + isCoChanChong());
    }
}
