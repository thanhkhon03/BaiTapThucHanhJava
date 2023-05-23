import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi và ký tự cần tìm
        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự cần tìm: ");
        char ch = scanner.next().charAt(0);

        // Đếm số lần xuất hiện của ký tự trong chuỗi
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("Số lần xuất hiện của ký tự " + ch + " trong chuỗi là: " + count);

        scanner.close();
    }
}
