import java.util.Scanner;

public class Bai1_Mang {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Nhập số phần tử của mảng n: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
        
        System.out.print("\nNhập phần tử k cần tìm: ");
        int k = sc.nextInt();
        timViTriK(a, k);
        
        System.out.print("\nNhập giá trị k cần xóa: ");
        int kXoa = sc.nextInt();
        int[] aSauXoa = xoaPhanTuK(a, kXoa);
        System.out.println("Mảng sau khi xóa các phần tử có giá trị " + kXoa + ":");
        inMang(aSauXoa);
        
        System.out.println("\n=== Tìm giá trị lớn nhì ===");
        timLonNhiCach1(a);
        timLonNhiCach2(a);
    }
    
    public static void inMang(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void timViTriK(int[] a, int k) {
        System.out.print("Phần tử " + k + " xuất hiện tại các vị trí: ");
        boolean timThay = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                System.out.print(i + " ");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.print("Không tìm thấy!");
        }
        System.out.println();
    }
    
    public static int[] xoaPhanTuK(int[] a, int k) {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != k) {
                dem++;
            }
        }
        
        int[] mangMoi = new int[dem];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != k) {
                mangMoi[index] = a[i];
                index++;
            }
        }
        return mangMoi;
    }
    
    public static void timLonNhiCach1(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        int lonNhi = Integer.MIN_VALUE;
        boolean timThay = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < max && a[i] > lonNhi) {
                lonNhi = a[i];
                timThay = true;
            }
        }
        
        if (timThay) {
            System.out.println("Cách 1 (2 vòng for): Giá trị lớn nhì = " + lonNhi);
        } else {
            System.out.println("Cách 1 (2 vòng for): Không có giá trị lớn nhì (tất cả phần tử bằng nhau)");
        }
    }
    
    public static void timLonNhiCach2(int[] a) {
        int max = a[0];
        int lonNhi = Integer.MIN_VALUE;
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                lonNhi = max;
                max = a[i];
            } else if (a[i] > lonNhi && a[i] < max) {
                lonNhi = a[i];
            }
        }
        
        if (lonNhi != Integer.MIN_VALUE) {
            System.out.println("Cách 2 (1 vòng for): Giá trị lớn nhì = " + lonNhi);
        } else {
            System.out.println("Cách 2 (1 vòng for): Không có giá trị lớn nhì (tất cả phần tử bằng nhau)");
        }
    }
}