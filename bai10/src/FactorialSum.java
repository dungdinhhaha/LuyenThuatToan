import java.util.Scanner;

public class FactorialSum {

public static long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập n: ");
    int n = sc.nextInt();
    
    double sum = 0.0;
    for (int i = 1; i <= n; i++) {
        int term = 2 * i; // 2!, 4!, 6!, ...
        sum += 1.0 / factorial(term);
    }
    
    System.out.println("Tổng S = " + sum);
}


}



