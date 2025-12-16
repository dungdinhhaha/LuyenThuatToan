package oop;

public class XeKhach extends XeBonBanh {
    public XeKhach() {}
    public XeKhach(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void chay() {
        System.out.println("Xe khách đang chạy");
    }

    @Override
    public void dungLai() {
        System.out.println("Xe khách đã dừng lại");
    }

    @Override
    public void choNguoi() {
        System.out.println("Xe khách đang chở người");
    }

    public void doXang() {
        System.out.println("Xe khách đang được đổ xăng");
    }

    public void choKhach() {
        System.out.println("Xe khách chở khách");
    }

    @Override
    public void hienThi() {
        System.out.println("Xe khách: màu sơn=" + getMauSon() + ", trọng lượng=" + getTrongLuong());
    }
}
