import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Nhập số thứ nhất: ");
        num1 = scanner.nextInt();
        System.out.print("Nhập số thứ hai: ");
        num2 = scanner.nextInt();

        // Tính tổng, hiệu, tích, thương, chia lấy dư
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Tổng: " + sum);
        System.out.println("Hiệu: " + difference);
        System.out.println("Tích: " + product);
        System.out.println("Thương: " + quotient);
        System.out.println("Chia lấy dư: " + remainder);

        // So sánh 2 số
        if (num1 > num2) {
            System.out.println(num1 + " lớn hơn " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nhỏ hơn " + num2);
        } else {
            System.out.println(num1 + " bằng " + num2);
        }
    }
}