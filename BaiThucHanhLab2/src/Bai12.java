import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập số hàng của ma trận
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = input.nextInt();

        // Nhập số cột của ma trận
        System.out.print("Nhập số cột của ma trận: ");
        int cols = input.nextInt();

        // Khởi tạo ma trận A với kích thước rows x cols
        int[][] A = new int[rows][cols];

        // Nhập giá trị cho các phần tử của ma trận A từ bàn phím
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử A[" + i + "][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        // Tìm phần tử lớn nhất trong ma trận A
        int max = A[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (A[i][j] > max) {
                    max = A[i][j];
                }
            }
        }

        // In ra phần tử lớn nhất của ma trận A
        System.out.println("Phần tử lớn nhất trong ma trận là: " + max);

        input.close();
    }
}
