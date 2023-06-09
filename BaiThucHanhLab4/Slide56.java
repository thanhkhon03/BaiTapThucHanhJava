import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        // Khởi tạo một HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Thêm các phần tử vào HashSet
        hashSet.add("Mercedes");
        hashSet.add("Nissan");
        hashSet.add("Huyndai");
        hashSet.add("Toyota");

        // Hiển thị HashSet ban đầu
        System.out.println("HashSet ban đầu: " + hashSet);

        try (// Nhập phần tử cần xóa từ bàn phím
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập phần tử cần xóa: ");
            String element = scanner.nextLine();

            // Xóa phần tử khỏi HashSet
            boolean removed = hashSet.remove(element);

            // Hiển thị kết quả
            if (removed) {
                System.out.println("Phần tử " + element + " đã được xóa khỏi HashSet.");
            } else {
                System.out.println("Phần tử " + element + " không tồn tại trong HashSet.");
            }
        }
        // Hiển thị HashSet sau khi xóa
        System.out.println("HashSet sau khi xóa: " + hashSet);
    }
}
