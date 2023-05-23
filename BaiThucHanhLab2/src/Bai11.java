import java.util.Arrays;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = input.nextInt();

        // Khởi tạo mảng A với n phần tử
        int[] A = new int[n];

        // Nhập giá trị cho các phần tử của mảng A từ bàn phím
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            A[i] = input.nextInt();
        }

        // Sắp xếp mảng A theo thứ tự tăng dần
        Arrays.sort(A);

        // In ra màn hình mảng A ban đầu
        System.out.println("Mảng ban đầu: " + Arrays.toString(A));

        // In ra màn hình mảng A đã được sắp xếp tăng dần
        System.out.println("Mảng đã được sắp xếp tăng dần: " + Arrays.toString(A));

        input.close();
    }
}
