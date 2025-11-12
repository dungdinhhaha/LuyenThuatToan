class NhanVien {
    String hoTen;
    int tuoi;
    String gioiTinh;
    double luongCoBan;
    double diemTB;


    public String getName() {
        return hoTen;
    }

    public void setName(String name) {
        this.hoTen = name;
    }

    public int getAge() {
        return tuoi;
    }

    public void setAge(int age) {
        this.tuoi = age;
    }

    public String getGen() {
        return gioiTinh;
    }

    public void setGen(String gen) {
        this.gioiTinh = gen;
    }

    public long getSalary() {
        return (long) luongCoBan;
    }

    public void setSalary(long salary) {
        this.luongCoBan = luongCoBan;
    }

    public double getAvgMark() {
        return diemTB ;
    }

    public void setAvgMark(double avgMark) {
        this.diemTB = diemTB;
    }
    public NhanVien() {

    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, double luongCoBan, double diemTB) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.luongCoBan = luongCoBan;
        this.diemTB = diemTB;
    }
}
