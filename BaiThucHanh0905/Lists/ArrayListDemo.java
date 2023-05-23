package Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số lượng sinh viên: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự mới sau khi nhập số lượng

            for (int i = 0; i < n; i++) {
                System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                Student student = new Student();
                student.nhapThongTin();
                students.add(student);
            }
        }

        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            student.hienThiThongTin();
            System.out.println("------------------------");
        }

        // Thực hiện các chức năng Thêm, sửa, xoá 
    }
}
