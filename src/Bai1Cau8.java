import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Cau8 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<NhanVien> dsNhanVien = new ArrayList<>();

    public static void main(String[] args) {
        nhap();
        xuat();
    }


    public static void nhap() {
        String tiepTuc = "Yes";
        int i = 0;

        while (!tiepTuc.equals("No")) {
            nhapNhanVien(i + 1);
            i++;

            System.out.print("Bạn có muốn nhập tiếp không? (Yes/No): ");
            tiepTuc = sc.nextLine();
        }
    }


    public static void nhapNhanVien(int i) {
        System.out.println("\n=== Nhập thông tin nhân viên thứ " + i + " ===");

        System.out.print("Họ tên: ");
        String hoTen = sc.nextLine();

        System.out.print("Tuổi: ");
        int tuoi = Integer.parseInt(sc.nextLine());

        System.out.print("Giới tính: ");
        String gioiTinh = sc.nextLine();

        System.out.print("Lương cơ bản: ");
        double luongCoBan = Double.parseDouble(sc.nextLine());

        System.out.print("Điểm trung bình tốt nghiệp: ");
        double diemTB = Double.parseDouble(sc.nextLine());

        // Thêm vào danh sách
        dsNhanVien.add(new NhanVien(hoTen, tuoi, gioiTinh, luongCoBan, diemTB));
    }

    // =================== HÀM XUẤT ===================
    public static void xuat() {
        System.out.println("\n========== DANH SÁCH NHÂN VIÊN ==========");
        for (int i = 0; i < dsNhanVien.size(); i++) {
            xuatNhanVien(i);
        }
    }

    // Hàm xuất nhân viên thứ i
    public static void xuatNhanVien(int i) {
        NhanVien nv = dsNhanVien.get(i);
        System.out.println("\n--- Nhân viên thứ " + (i + 1) + " ---");
        System.out.println("Họ tên: " + nv.hoTen);
        System.out.println("Tuổi: " + nv.tuoi);
        System.out.println("Giới tính: " + nv.gioiTinh);
        System.out.println("Lương cơ bản: " + nv.luongCoBan);
        System.out.println("Điểm trung bình: " + nv.diemTB);
    }
}
