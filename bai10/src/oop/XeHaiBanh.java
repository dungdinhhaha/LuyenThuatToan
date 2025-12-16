package oop;

public abstract class XeHaiBanh extends Xe {
    private boolean coChanChong = true;

    public XeHaiBanh() {}
    public XeHaiBanh(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    public boolean isCoChanChong() { return coChanChong; }
    public void setCoChanChong(boolean coChanChong) { this.coChanChong = coChanChong; }
}
