import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        // Khởi tạo một ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Nhập các phần tử từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử trong ArrayList: ");
        int n = scanner.nextInt();

        System.out.println("Nhập các phần tử vào ArrayList:");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            arrayList.add(element);
        }

        // Tìm phần tử lớn nhất trong ArrayList
        int max = arrayList.get(0);
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        }

        // Hiển thị phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong ArrayList là: " + max);
    }
}
