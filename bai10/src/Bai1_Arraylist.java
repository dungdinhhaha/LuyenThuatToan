import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1_Arraylist {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử n: ");
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> a = new ArrayList<>(n);

        System.out.println("Nhập các phần tử:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a.add(Integer.parseInt(sc.nextLine().trim()));
        }

        System.out.println("\nDanh sách a:");
        inList(a);

        int demLe = demPhanTuLe(a);
        System.out.println("Số lượng phần tử lẻ: " + demLe);

        int tongDuongLe = tongDuongLe(a);
        System.out.println("Tổng số dương lẻ: " + tongDuongLe);

        System.out.print("\nNhập k cần tìm: ");
        int kFind = Integer.parseInt(sc.nextLine().trim());
        timVaInViTriK(a, kFind);

        ArrayList<Integer> sortAsc = new ArrayList<>(a);
        Collections.sort(sortAsc);
        System.out.println("\nSau khi sắp xếp tăng dần:");
        inList(sortAsc);

        ArrayList<Integer> reversed = new ArrayList<>(a);
        Collections.reverse(reversed);
        System.out.println("\nSau khi đảo thứ tự:");
        inList(reversed);

        System.out.print("\nNhập k cần xóa: ");
        int kDel = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> removed = new ArrayList<>(a);
        removed.removeIf(x -> x == kDel);
        System.out.println("Sau khi xóa tất cả phần tử = " + kDel + ":");
        inList(removed);

        System.out.print("\nNhập vị trí cần chèn: ");
        int pos = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Nhập giá trị cần chèn: ");
        int val = Integer.parseInt(sc.nextLine().trim());
        ArrayList<Integer> inserted = new ArrayList<>(a);
        if (pos < 0) pos = 0;
        if (pos > inserted.size()) pos = inserted.size();
        inserted.add(pos, val);
        System.out.println("Sau khi chèn:");
        inList(inserted);

        int max = Collections.max(a);
        int min = Collections.min(a);
        System.out.println("\nMax = " + max + ", Min = " + min);
    }

    static void inList(ArrayList<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + (i + 1 < a.size() ? " " : ""));
        }
        System.out.println();
    }

    static int demPhanTuLe(ArrayList<Integer> a) {
        int dem = 0;
        for (int x : a) {
            if ((x & 1) != 0) dem++;
        }
        return dem;
    }

    static int tongDuongLe(ArrayList<Integer> a) {
        int s = 0;
        for (int x : a) {
            if (x > 0 && (x & 1) != 0) s += x;
        }
        return s;
    }

    static void timVaInViTriK(ArrayList<Integer> a, int k) {
        boolean found = false;
        System.out.print("Vị trí xuất hiện của " + k + ": ");
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) System.out.print("Không tìm thấy");
        System.out.println();
    }
}

