import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Vadilate_Thuattoan {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Xử lý file và thư mục ===");
            System.out.println("1. Đọc toàn bộ file và hiển thị trên một dòng");
            System.out.println("2. Đọc đúng 3 dòng đầu tiên của file");
            System.out.println("3. Đếm số lần xuất hiện của một từ trong file (mỗi dòng một từ)");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = SCANNER.nextLine().trim();
            switch (choice) {
                case "1":
                    handleReadAllOnOneLine();
                    break;
                case "2":
                    handleReadFirstThreeLines();
                    break;
                case "3":
                    handleCountWordOccurrences();
                    break;
                case "0":
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static Path requestExistingPath() {
        while (true) {
            System.out.print("Nhập đường dẫn đến file: ");
            String pathInput = SCANNER.nextLine().trim();
            if (pathInput.isEmpty()) {
                System.out.println("Đường dẫn không được để trống.");
                continue;
            }

            Path path = Paths.get(pathInput);
            if (Files.exists(path) && Files.isRegularFile(path)) {
                return path;
            }
            System.out.println("File không tồn tại hoặc không phải là file thông thường. Vui lòng nhập lại.");
        }
    }

    private static void handleReadAllOnOneLine() {
        Path path = requestExistingPath();
        try {
            List<String> lines = Files.readAllLines(path);
            String joined = String.join(" ", lines);
            System.out.println("Nội dung file trên một dòng:");
            System.out.println(joined);
        } catch (IOException e) {
            System.out.println("Không thể đọc file: " + e.getMessage());
        }
    }

    private static void handleReadFirstThreeLines() {
        Path path = requestExistingPath();
        try {
            List<String> lines = Files.readAllLines(path);
            int limit = Math.min(3, lines.size());
            if (limit == 0) {
                System.out.println("File rỗng.");
                return;
            }
            System.out.println("Ba dòng đầu tiên (hoặc ít hơn nếu file ngắn hơn):");
            for (int i = 0; i < limit; i++) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("Không thể đọc file: " + e.getMessage());
        }
    }

    private static void handleCountWordOccurrences() {
        Path path = requestExistingPath();
        System.out.print("Nhập từ cần đếm: ");
        String keyword = SCANNER.nextLine();
        if (keyword.isEmpty()) {
            System.out.println("Từ cần đếm không được để trống.");
            return;
        }

        try {
            long count = Files.lines(path)
                    .filter(line -> line.equals(keyword))
                    .count();
            System.out.printf("Số lần xuất hiện của từ \"%s\" là: %d%n", keyword, count);
        } catch (IOException e) {
            System.out.println("Không thể đọc file: " + e.getMessage());
        }
    }
}
