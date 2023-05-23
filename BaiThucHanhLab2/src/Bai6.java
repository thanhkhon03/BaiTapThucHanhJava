import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        int giaiThua = 1;
        int i = 1;
        do {
            giaiThua *= i;
            i++;
        } while (i <= n);
        System.out.println("Giai thừa của " + n + " là: " + giaiThua);

        scanner.close();
    }
}
