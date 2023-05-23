import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        while (sum <= 100) {
            System.out.println("Nhập vào một số nguyên:");
            num = scanner.nextInt();
            sum += num;
        }
        System.out.println("Tổng các số đã nhập: " + sum);

        scanner.close();
    }
}
