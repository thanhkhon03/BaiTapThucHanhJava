
import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên dương: ");
        int n = scanner.nextInt();

        // Nhập các số nguyên dương vào danh sách liên kết
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số nguyên dương thứ " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > 0) {
                numbers.add(num);
            } else {
                System.out.println("Số nhập vào không phải số nguyên dương, vui lòng nhập lại.");
                i--;
            }
        }

        // Tính trung bình cộng của các số chẵn
        int sum = 0;
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
                count++;
            }
        }

        // Hiển thị kết quả trung bình cộng
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Trung bình cộng của các số chẵn là: " + average);
        } else {
            System.out.println("Không có số chẵn để tính trung bình cộng.");
        }

        scanner.close();
    }
}

