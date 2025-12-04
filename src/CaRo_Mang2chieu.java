import java.util.Scanner;

public class CaRo_Mang2chieu {
    static int kichThuocBanCo = 15;
    static char[][] banCo = new char[kichThuocBanCo + 1][kichThuocBanCo + 1];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chào mừng đến với cờ caro");
        boolean daCoNguoiChienThang = false;

        for (int i = 1; i <= kichThuocBanCo; i++) {
            for (int j = 1; j <= kichThuocBanCo; j++) {
                banCo[i][j] = '-';
            }
        }

        inBanCo();

        while (!daCoNguoiChienThang) {
            moiNguoiXDanh();

            if (nguoiXDaThang()) {
                System.out.println("X đã chiến thắng!");
                daCoNguoiChienThang = true;
            } else {
                moiNguoiODanh();
                if (nguoiODaThang()) {
                    System.out.println("O đã chiến thắng!");
                    daCoNguoiChienThang = true;
                }
            }
        }
    }

    private static void moiNguoiODanh() {
        boolean done = false;
        do {
            System.out.println("Moi nhap toa do hang cho O:");
            int row = sc.nextInt();
            sc = new Scanner(System.in);

            System.out.println("Moi nhap toa do cot cho O:");
            int col = sc.nextInt();
            sc = new Scanner(System.in);

            if (row < 1 || row > kichThuocBanCo || col < 1 || col > kichThuocBanCo) {
                System.out.println("Vị trí không đúng kích thước bàn cờ!");
                continue;
            }

            if (banCo[row][col] == 'X' || banCo[row][col] == 'O') {
                System.out.println("Đã có người đánh vị trí này!");
                continue;
            }

            banCo[row][col] = 'O';
            done = true;
            inBanCo();

        } while (!done);
    }

    private static boolean nguoiODaThang() {
        return kiemTraThang('O');
    }

    private static boolean nguoiXDaThang() {
        return kiemTraThang('X');
    }

    private static boolean kiemTraThang(char p) {
        return thangHangNgang(p) || thangHangDoc(p) || thangCheoChinh(p) || thangCheoPhu(p);
    }

    private static boolean thangHangNgang(char p) {
        for (int row = 1; row <= kichThuocBanCo; row++) {
            for (int col = 1; col <= kichThuocBanCo - 4; col++) {
                if (banCo[row][col] == p && banCo[row][col + 1] == p && banCo[row][col + 2] == p
                        && banCo[row][col + 3] == p && banCo[row][col + 4] == p) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean thangHangDoc(char p) {
        for (int col = 1; col <= kichThuocBanCo; col++) {
            for (int row = 1; row <= kichThuocBanCo - 4; row++) {
                if (banCo[row][col] == p && banCo[row + 1][col] == p && banCo[row + 2][col] == p
                        && banCo[row + 3][col] == p && banCo[row + 4][col] == p) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean thangCheoChinh(char p) {
        for (int row = 1; row <= kichThuocBanCo - 4; row++) {
            for (int col = 1; col <= kichThuocBanCo - 4; col++) {
                if (banCo[row][col] == p && banCo[row + 1][col + 1] == p && banCo[row + 2][col + 2] == p
                        && banCo[row + 3][col + 3] == p && banCo[row + 4][col + 4] == p) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean thangCheoPhu(char p) {
        for (int row = 1; row <= kichThuocBanCo - 4; row++) {
            for (int col = 5; col <= kichThuocBanCo; col++) {
                if (banCo[row][col] == p && banCo[row + 1][col - 1] == p && banCo[row + 2][col - 2] == p
                        && banCo[row + 3][col - 3] == p && banCo[row + 4][col - 4] == p) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean nguoiXDaThangHangNgang() {
        return thangHangNgang('X');
    }

    private static boolean nguoiXDaThangHangDoc() {
        return thangHangDoc('X');
    }

    private static boolean nguoiXDaThangDuongCheoChinh() {
        return thangCheoChinh('X');
    }

    private static boolean nguoiXDaThangDuongCheoPhu() {
        return thangCheoPhu('X');
    }

    private static void inBanCo() {
        for (int row = 1; row <= kichThuocBanCo; row++) {
            for (int col = 1; col <= kichThuocBanCo; col++) {
                System.out.print(banCo[row][col] + "|");
            }
            System.out.println();
        }
    }

    private static void moiNguoiXDanh() {
        boolean done = false;

        do {
            System.out.println("Moi nhap toa do hang cho X:");
            int row = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println("Moi nhap toa do cot cho X:");
            int col = sc.nextInt();
            sc = new Scanner(System.in);

            if (row < 1 || row > kichThuocBanCo || col < 1 || col > kichThuocBanCo) {
                System.out.println("Vị trí không đúng kích thước bàn cờ!");
                continue;
            }

            if (banCo[row][col] == 'X' || banCo[row][col] == 'O') {
                System.out.println("Đã có người đánh vị trí này!");
                continue;
            }

            banCo[row][col] = 'X';
            done = true;
            inBanCo();

        } while (!done);
    }
}
