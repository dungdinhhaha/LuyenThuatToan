import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class NhanvienOOP{


    public static void main(String[] args) {
        List<NhanVienBean> ds = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap so nhan vien: ");
            int n = Integer.parseInt(sc.nextLine().trim());

            for (int i = 0; i < n; i++) {
                System.out.println("\n--- Nhap thong tin nhan vien thu " + (i + 1) + " ---");
                NhanVienBean nv = new NhanVienBean();

                System.out.print("Ho ten: ");
                nv.setHoTen(sc.nextLine());

                System.out.print("Tuoi: ");
                nv.setTuoi(Integer.parseInt(sc.nextLine().trim()));

                System.out.print("Gioi tinh: ");
                nv.setGioiTinh(sc.nextLine());

                System.out.print("Luong co ban: ");
                nv.setLuongCoBan(Double.parseDouble(sc.nextLine().trim()));

                System.out.print("Diem trung binh: ");
                nv.setDiemTB(Double.parseDouble(sc.nextLine().trim()));

                ds.add(nv);
            }
        }

        System.out.println("\n===== DANH SACH NHAN VIEN =====");
        for (int i = 0; i < ds.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, ds.get(i));
        }
    }

    static class NhanVienBean {
        private String hoTen;
        private int tuoi;
        private String gioiTinh;
        private double luongCoBan;
        private double diemTB;

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public int getTuoi() {
            return tuoi;
        }

        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        public String getGioiTinh() {
            return gioiTinh;
        }

        public void setGioiTinh(String gioiTinh) {
            this.gioiTinh = gioiTinh;
        }

        public double getLuongCoBan() {
            return luongCoBan;
        }

        public void setLuongCoBan(double luongCoBan) {
            this.luongCoBan = luongCoBan;
        }

        public double getDiemTB() {
            return diemTB;
        }

        public void setDiemTB(double diemTB) {
            this.diemTB = diemTB;
        }

        @Override
        public String toString() {
            return String.format("%s | Tuoi: %d | Gioi tinh: %s | LCB: %.2f | DTB: %.2f",
                    hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        }
    }
}
