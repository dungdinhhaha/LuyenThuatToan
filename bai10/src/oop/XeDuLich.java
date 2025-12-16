package oop;

public class XeDuLich extends XeBonBanh {
    public XeDuLich() {}
    public XeDuLich(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void chay() {
        System.out.println("Xe du lịch đang chạy");
    }

    @Override
    public void dungLai() {
        System.out.println("Xe du lịch đã dừng lại");
    }

    @Override
    public void choNguoi() {
        System.out.println("Xe du lịch đang chở người");
    }

    public void doXang() {
        System.out.println("Xe du lịch đang được đổ xăng");
    }

    public void choSepCongTac() {
        System.out.println("Xe du lịch chở sếp đi công tác");
    }

    @Override
    public void hienThi() {
        System.out.println("Xe du lịch: màu sơn=" + getMauSon() + ", trọng lượng=" + getTrongLuong());
    }
}
