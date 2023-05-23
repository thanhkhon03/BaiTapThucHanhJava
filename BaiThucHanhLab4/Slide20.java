import java.util.ArrayList;

public class Slide20 {
    public static void main(String[] args) {
        // Khởi tạo một ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        // Thêm phần tử vào ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Lấy kích thước của ArrayList
        int size = arrayList.size();
        System.out.println("Kích thước của ArrayList: " + size);

        // Truy cập phần tử trong ArrayList
        String element = arrayList.get(1);
        System.out.println("Phần tử tại vị trí 1: " + element);

        // Xóa phần tử khỏi ArrayList
        arrayList.remove(0);
        System.out.println("ArrayList sau khi xóa phần tử đầu tiên: " + arrayList);

        // Kiểm tra xem một phần tử có tồn tại trong ArrayList hay không
        boolean contains = arrayList.contains("Banana");
        System.out.println("Có phần tử \"Banana\" trong ArrayList: " + contains);

        // Kiểm tra xem ArrayList có rỗng hay không
        boolean isEmpty = arrayList.isEmpty();
        System.out.println("ArrayList rỗng: " + isEmpty);

        // Xóa toàn bộ phần tử trong ArrayList
        arrayList.clear();
        System.out.println("ArrayList sau khi xóa tất cả phần tử: " + arrayList);
    }
}
