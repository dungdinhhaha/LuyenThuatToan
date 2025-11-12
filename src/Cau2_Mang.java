import java.util.Arrays;
import java.util.Scanner;

public class Cau2_Mang {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số nhân viên n: ");
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] hoTen = new String[n];
        int[] tuoi = new int[n];
        String[] gioiTinh = new String[n];
        double[] luongCoBan = new double[n];
        double[] diemTB = new double[n];

        int i = 0;
        do {
            System.out.println("\nNhân viên " + (i + 1));
            System.out.print("Họ tên: ");
            hoTen[i] = sc.nextLine();
            System.out.print("Tuổi: ");
            tuoi[i] = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Giới tính: ");
            gioiTinh[i] = sc.nextLine();
            System.out.print("Lương cơ bản: ");
            luongCoBan[i] = Double.parseDouble(sc.nextLine().trim());
            System.out.print("Điểm trung bình: ");
            diemTB[i] = Double.parseDouble(sc.nextLine().trim());
            i++;
        } while (i < n);

        int[] top = timTop2DiemTB(diemTB);
        System.out.println("\nTop 1 điểm TB: " + hoTen[top[0]] + " (" + diemTB[top[0]] + ")");
        System.out.println("Top 2 điểm TB: " + hoTen[top[1]] + " (" + diemTB[top[1]] + ")");

        System.out.print("\nTìm theo họ tên (chính xác): ");
        String nameExact = sc.nextLine();
        int idxExact = timTheoHoTenChinhXac(hoTen, nameExact);
        if (idxExact >= 0) {
            inNhanVien(idxExact, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        } else {
            System.out.println("Không tìm thấy.");
        }

        System.out.print("\nTìm theo họ tên (không cần chính xác): ");
        String nameLike = sc.nextLine();
        int[] found = timTheoHoTenGanDung(hoTen, nameLike);
        if (found.length == 0) {
            System.out.println("Không tìm thấy.");
        } else {
            for (int id : found) {
                inNhanVien(id, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
            }
        }

        sapXepTheoTuoiTangDan(hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        System.out.println("\nDanh sách sau khi sắp xếp theo tuổi tăng dần:");
        for (int j = 0; j < n; j++) {
            inNhanVien(j, hoTen, tuoi, gioiTinh, luongCoBan, diemTB);
        }
    }

    static void inNhanVien(int i, String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        System.out.println((i + 1) + ". " + hoTen[i] + " | Tuổi: " + tuoi[i] + " | Giới tính: " + gioiTinh[i]
                + " | LCB: " + luongCoBan[i] + " | ĐTB: " + diemTB[i]);
    }

    static int[] timTop2DiemTB(double[] diemTB) {
        int n = diemTB.length;
        int maxIdx = 0;
        for (int i = 1; i < n; i++) {
            if (diemTB[i] > diemTB[maxIdx]) {
                maxIdx = i;
            }
        }
        int secondIdx = (maxIdx == 0) ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (i != maxIdx && diemTB[i] > diemTB[secondIdx]) {
                secondIdx = i;
            }
        }
        return new int[]{maxIdx, secondIdx};
    }

    static int timTheoHoTenChinhXac(String[] hoTen, String name) {
        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].equals(name)) {
                return i;
            }
        }
        return -1;
    }

    static int[] timTheoHoTenGanDung(String[] hoTen, String keyword) {
        String kw = keyword.toLowerCase();
        int count = 0;
        for (String s : hoTen) {
            if (s.toLowerCase().contains(kw)) {
                count++;
            }
        }
        int[] idx = new int[count];
        int j = 0;
        for (int i = 0; i < hoTen.length; i++) {
            if (hoTen[i].toLowerCase().contains(kw)) {
                idx[j++] = i;
            }
        }
        return idx;
    }

    static void swap(String[] a, int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void swap(double[] a, int i, int j) {
        double t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    static void sapXepTheoTuoiTangDan(String[] hoTen, int[] tuoi, String[] gioiTinh, double[] luongCoBan, double[] diemTB) {
        int n = tuoi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tuoi[i] > tuoi[j]) {
                    swap(tuoi, i, j);
                    swap(hoTen, i, j);
                    swap(gioiTinh, i, j);
                    swap(luongCoBan, i, j);
                    swap(diemTB, i, j);
                }
            }
        }
    }
}

