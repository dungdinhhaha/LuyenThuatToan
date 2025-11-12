import java.util.Scanner;
import java.util.regex.Pattern;

public class Vadilate_Bieu_Thuc {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Pattern CMND_PATTERN = Pattern.compile("\\d{9}|\\d{12}");
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Xử lý validate dữ liệu ===");
            System.out.println("9. Kiểm tra số điện thoại hợp lệ (thuật toán thường)");
            System.out.println("10. Liệt kê CMND không hợp lệ (regex, phân tách bằng dấu phẩy)");
            System.out.println("11. Liệt kê email không hợp lệ (regex, phân tách bằng dấu chấm phẩy)");
            System.out.println("12. Phân loại chuỗi: số tự nhiên / số nguyên / số thực / không phải số");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = SCANNER.nextLine().trim();
            switch (choice) {
                case "9":
                    handleValidatePhone();
                    break;
                case "10":
                    handleValidateCmndList();
                    break;
                case "11":
                    handleValidateEmailList();
                    break;
                case "12":
                    handleDetectNumberType();
                    break;
                case "0":
                    System.out.println("Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void handleValidatePhone() {
        System.out.print("Nhập số điện thoại: ");
        String phone = SCANNER.nextLine().trim();
        if (isValidPhoneNumber(phone)) {
            System.out.println("Số điện thoại hợp lệ.");
        } else {
            System.out.println("Số điện thoại không hợp lệ.");
        }
    }

    private static boolean isValidPhoneNumber(String phone) {
        if (phone.length() != 10) {
            return false;
        }
        if (phone.charAt(0) != '0') {
            return false;
        }
        for (int i = 1; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static void handleValidateCmndList() {
        System.out.print("Nhập danh sách CMND (ngăn cách bởi dấu phẩy): ");
        String input = SCANNER.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        String[] tokens = input.split(",");
        boolean foundInvalid = false;
        for (String token : tokens) {
            String cmnd = token.trim();
            if (cmnd.isEmpty() || !CMND_PATTERN.matcher(cmnd).matches()) {
                if (!foundInvalid) {
                    System.out.println("Các CMND không hợp lệ:");
                    foundInvalid = true;
                }
                System.out.println(cmnd.isEmpty() ? "(trống)" : cmnd);
            }
        }
        if (!foundInvalid) {
            System.out.println("Tất cả CMND đều hợp lệ.");
        }
    }

    private static void handleValidateEmailList() {
        System.out.print("Nhập danh sách email (ngăn cách bởi dấu chấm phẩy): ");
        String input = SCANNER.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }

        String[] emails = input.split(";");
        boolean foundInvalid = false;
        for (String token : emails) {
            String email = token.trim();
            if (email.isEmpty() || !EMAIL_PATTERN.matcher(email).matches()) {
                if (!foundInvalid) {
                    System.out.println("Các email không hợp lệ:");
                    foundInvalid = true;
                }
                System.out.println(email.isEmpty() ? "(trống)" : email);
            }
        }
        if (!foundInvalid) {
            System.out.println("Tất cả email đều hợp lệ.");
        }
    }

    private static void handleDetectNumberType() {
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = SCANNER.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("Chuỗi trống không phải là một số.");
            return;
        }

        if (isNaturalNumber(input)) {
            System.out.println("Chuỗi là số tự nhiên.");
        } else if (isInteger(input)) {
            System.out.println("Chuỗi là số nguyên.");
        } else if (isRealNumber(input)) {
            System.out.println("Chuỗi là số thực.");
        } else {
            System.out.println("Chuỗi không phải là một số.");
        }
    }

    private static boolean isNaturalNumber(String value) {
        if (value.equals("0")) {
            return true;
        }
        if (value.isEmpty() || value.charAt(0) == '0') {
            return false;
        }
        for (char ch : value.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isInteger(String value) {
        if (value.startsWith("+") || value.startsWith("-")) {
            if (value.length() == 1) {
                return false;
            }
            value = value.substring(1);
        }
        if (value.isEmpty()) {
            return false;
        }
        for (char ch : value.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRealNumber(String value) {
        boolean dotSeen = false;
        boolean digitSeen = false;
        int start = 0;
        if (value.startsWith("+") || value.startsWith("-")) {
            start = 1;
        }
        for (int i = start; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isDigit(ch)) {
                digitSeen = true;
            } else if (ch == '.') {
                if (dotSeen) {
                    return false;
                }
                dotSeen = true;
            } else {
                return false;
            }
        }

        return digitSeen && dotSeen;
    }
}

