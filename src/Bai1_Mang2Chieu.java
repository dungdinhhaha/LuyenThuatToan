import java.util.Scanner;

public class Bai1_Mang2Chieu {
    static final int MAX_SIZE = 30;
    static final char EMPTY = '.';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập kích thước bàn cờ (5 - 30): ");
        int n = readIntInRange(sc, 5, MAX_SIZE);
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = EMPTY;
            }
        }

        char current = 'X';
        int moves = 0;
        printBoard(board);
        while (true) {
            System.out.println("Lượt của " + current + " (nhập hàng cột 1.." + n + "):");
            int r = readIntInRange(sc, 1, n) - 1;
            int c = readIntInRange(sc, 1, n) - 1;
            if (board[r][c] != EMPTY) {
                System.out.println("Ô đã được đánh. Chọn ô khác.");
                continue;
            }
            board[r][c] = current;
            moves++;
            printBoard(board);

            if (isWin(board, r, c, current)) {
                System.out.println("Người chơi " + current + " THẮNG!");
                break;
            }
            if (moves == n * n) {
                System.out.println("HÒA!");
                break;
            }
            current = (current == 'X') ? 'O' : 'X';
        }
    }

    static int readIntInRange(Scanner sc, int lo, int hi) {
        while (true) {
            String s = sc.nextLine().trim();
            try {
                int v = Integer.parseInt(s);
                if (v >= lo && v <= hi) return v;
            } catch (Exception ignored) {}
            System.out.print("Giá trị không hợp lệ. Nhập lại (" + lo + "-" + hi + "): ");
        }
    }

    static void printBoard(char[][] b) {
        int n = b.length;
        System.out.print("   ");
        for (int j = 1; j <= n; j++) {
            System.out.printf("%2d", j);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d ", i + 1);
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean isWin(char[][] b, int r, int c, char p) {
        return countLine(b, r, c, p, 0, 1) >= 5     // ngang
            || countLine(b, r, c, p, 1, 0) >= 5     // dọc
            || countLine(b, r, c, p, 1, 1) >= 5     // chéo chính
            || countLine(b, r, c, p, 1, -1) >= 5;   // chéo phụ
    }

    static int countLine(char[][] b, int r, int c, char p, int dr, int dc) {
        int n = b.length;
        int cnt = 1;
        int i = r + dr, j = c + dc;
        while (i >= 0 && i < n && j >= 0 && j < n && b[i][j] == p) {
            cnt++; i += dr; j += dc;
        }
        i = r - dr; j = c - dc;
        while (i >= 0 && i < n && j >= 0 && j < n && b[i][j] == p) {
            cnt++; i -= dr; j -= dc;
        }
        return cnt;
    }
}

