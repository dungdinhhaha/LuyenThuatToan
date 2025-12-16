
package oop;

public class XeTai extends XeBonBanh {
    public XeTai() {}
    public XeTai(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void chay() {
        System.out.println("Xe tải đang chạy");
    }

    @Override
    public void dungLai() {
        System.out.println("Xe tải đã dừng lại");
    }

    @Override
    public void choNguoi() {
        System.out.println("Xe tải đang chở người");
    }

    public void doXang() {
        System.out.println("Xe tải đang được đổ xăng");
    }

    public void choHangHoa() {
        System.out.println("Xe tải chở hàng hóa");
    }

    @Override
    public void hienThi() {
        System.out.println("XeTai: mauSon=" + getMauSon() + ", trongLuong=" + getTrongLuong());
    }
}
