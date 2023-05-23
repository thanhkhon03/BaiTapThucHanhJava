package BTTHcuoiChuong4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập dãy số
            System.out.print("Nhập vào dãy số (nhập 0 để kết thúc): ");
            int input = scanner.nextInt();
            while (input != 0) {
                numbers.add(input);
                input = scanner.nextInt();
            }

            // Tìm số nguyên lớn nhất
            int max = Collections.max(numbers);
            System.out.println("Số nguyên lớn nhất trong dãy số là: " + max);

            // Nhập số nguyên để xoá các phần tử có giá trị bằng số đó
            System.out.print("Nhập số nguyên để xoá các phần tử có giá trị bằng số đó: ");
            int numToDelete = scanner.nextInt();
            numbers.removeIf(n -> n == numToDelete);

            // Sắp xếp và in dãy số
            Collections.sort(numbers);
            System.out.println("Dãy số sau khi sắp xếp:");
            for (int number : numbers) {
                System.out.print(number + " ");
            }
        } finally {
            scanner.close(); // Đóng Scanner sau khi sử dụng xong
        }
    }
}
