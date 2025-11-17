import java.util.Scanner;

public class Vadilate_Thuattoan {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
           
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = SCANNER.nextLine().trim();
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
    
    }


}
