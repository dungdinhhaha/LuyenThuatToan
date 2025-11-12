import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá 1 chai sữa (a): ");
        int a = sc.nextInt();

        System.out.print("Nhập giá bán lại 1 vỏ chai (b): ");
        int b = sc.nextInt();

        System.out.print("Nhập số tiền Nam có (c): ");
        int c = sc.nextInt();

        tinhSoChaiSua(a, b, c);
    }

    public static void tinhSoChaiSua(int a, int b, int c) {
        int soChai = 0;

        while (c >= a) {
            c -= a;
            soChai++;
            c += b;   
        }

        System.out.println("Nam đã uống tổng cộng: " + soChai + " chai sữa.");
        System.out.println("Số tiền còn lại: " + c + " VND.");
    }
}
