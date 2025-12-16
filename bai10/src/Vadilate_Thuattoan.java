import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Vadilate_Thuattoan {

    public static void main(String[] args) {

        String filePath = "input.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String phoneNumber = br.readLine().trim(); // đọc dòng đầu tiên

            System.out.println("Số đọc từ file: " + phoneNumber);

            // --- BẮT ĐẦU VALIDATE ---
            if (phoneNumber.length() != 10) {
                System.out.println("Số điện thoại không hợp lệ: Phải có đúng 10 chữ số.");
                return;
            }

            if (!phoneNumber.startsWith("0")) {
                System.out.println("Số điện thoại không hợp lệ: Phải bắt đầu bằng chữ số 0.");
                return;
            }

            for (char c : phoneNumber.toCharArray()) {
                if (!Character.isDigit(c)) {
                    System.out.println("Số điện thoại không hợp lệ: Chỉ được chứa chữ số.");
                    return;
                }
            }

            System.out.println("Số điện thoại hợp lệ.");

        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
