import java.util.Scanner;

public class Nhanvien_Cau5 {

    public static void main(String[] args) {
        NhanVien nhanVien1 = new NhanVien();
       // nhap(nhanVien1);
       // xuat(nhanVien1);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        NhanVien[] dsNhanVien = new NhanVien[n];
        for(int i =0 ; i <=n;i++){
            System.out.println("\n--- Nhập thông tin nhân viên thứ " + (i + 1) + " ---");
            dsNhanVien[i] = new NhanVien();
            nhap(dsNhanVien[i]);
                    }
        // Xuất thông tin tất cả nhân viên
        System.out.println("\n=== DANH SÁCH NHÂN VIÊN ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nNhân viên thứ " + (i + 1) + ":");
            xuat(dsNhanVien[i]);
        }
    }

    private static void xuat(NhanVien nhanVien1) {
        System.out.println("Tên nhân viên là: " + nhanVien1.getName());
        System.out.println("Tuổi nhân viên là: " + nhanVien1.getAge());
        System.out.println("Giới tính nhân viên là: " + nhanVien1.getGen());
        System.out.println("Lương nhân viên là: " + nhanVien1.getSalary());
        System.out.println("ĐTB ĐH nhân viên là: " + nhanVien1.getSalary());
    }

    private static void nhap(NhanVien nhanVien) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của nhân viên: ");
        nhanVien.setName(sc.nextLine());

        System.out.print("Nhập tuổi của nhân viên: ");
        nhanVien.setAge( sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập giới tính của nhân viên: ");
        nhanVien.setGen(sc.nextLine());

        System.out.print("Nhập lương của nhân viên: ");
        nhanVien.setSalary(sc.nextLong());
        System.out.print("Nhập ĐTB ĐH của nhân viên: ");
        nhanVien.setAvgMark(sc.nextDouble());
    }
}
