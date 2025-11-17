import java.io.*;
import java.util.Scanner;

public class Xulyfile {

    // ================== 1. Đọc toàn bộ file và in trên 1 dòng ==================
    public static void bai1(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
            br.close();

            System.out.println("Nội dung file trên 1 dòng:");
            System.out.println(sb.toString().trim());

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
        }
    }

    // ================== 2. Đọc đúng 3 dòng đầu ==================
    public static void bai2(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
            br.close();

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
        }
    }

    // ================== 3. Đếm số lần xuất hiện của 1 từ ==================
    public static void bai3(String path, String tuCanTim) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                if (line.equals(tuCanTim)) {
                    count++;
                }
            }
            br.close();

            System.out.println("Số lần xuất hiện của \"" + tuCanTim + "\": " + count);

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
        }
    }

    // ================== 4. Tính tổng các số ==================
    public static void bai4(String path) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            double sum = 0;

            while ((line = br.readLine()) != null) {
                try {
                    sum += Double.parseDouble(line);
                } catch (NumberFormatException e) {
                    System.out.println("Dòng không phải số: " + line);
                }
            }

            br.close();
            System.out.println("Tổng = " + sum);

        } catch (Exception e) {
            System.out.println("Lỗi đọc file!");
        }
    }

    // ================== 5. Tách chữ cái và số nguyên ra 2 file ==================
    public static void bai5(String input, String fileChu, String fileSo) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(input));
            BufferedWriter bwChu = new BufferedWriter(new FileWriter(fileChu));
            BufferedWriter bwSo = new BufferedWriter(new FileWriter(fileSo));

            String line;

            while ((line = br.readLine()) != null) {
                try {
                    Integer.parseInt(line);
                    // Nếu parseInt không lỗi → là số
                    bwSo.write(line);
                    bwSo.newLine();
                } catch (NumberFormatException e) {
                    // Nếu lỗi → là chữ cái
                    bwChu.write(line);
                    bwChu.newLine();
                }
            }

            br.close();
            bwChu.close();
            bwSo.close();

            System.out.println("Đã tách file thành công.");

        } catch (Exception e) {
            System.out.println("Lỗi xử lý file!");
        }
    }

    // ================== 6. Kiểm tra đường dẫn là file hay thư mục ==================
    public static void bai6(String path) {
        File f = new File(path);

        if (!f.exists()) {
            System.out.println("Đường dẫn không tồn tại.");
            return;
        }

        if (f.isFile()) System.out.println("Đây là FILE.");
        else if (f.isDirectory()) System.out.println("Đây là THƯ MỤC.");
    }

    // ================== 7. Xóa file ==================
    public static void bai7(String path) {
        File f = new File(path);

        if (f.exists() && f.isFile()) {
            if (f.delete()) System.out.println("Xóa file thành công.");
            else System.out.println("Xóa file thất bại.");
        } else {
            System.out.println("File không tồn tại!");
        }
    }

    // ================== 8. Đổi tên file hoặc thư mục ==================
    public static void bai8(String oldPath, String newPath) {
        File fOld = new File(oldPath);
        File fNew = new File(newPath);

        if (!fOld.exists()) {
            System.out.println("Đường dẫn cũ không tồn tại!");
            return;
        }

        if (fOld.renameTo(fNew)) {
            System.out.println("Đổi tên thành công.");
        } else {
            System.out.println("Đổi tên thất bại.");
        }
    }

    // ================== MAIN TEST ==================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập đường dẫn file: ");
        String path = sc.nextLine();

        // Bạn có thể gọi từng bài để test
        // bai1(path);
        // bai2(path);
        // bai3(path, "Nguyen");
        // bai4(path);
        // bai5(path, "chu.txt", "so.txt");
        // bai6(path);
        // bai7(path);
        // bai8(path, "newname.txt");
    }
}
