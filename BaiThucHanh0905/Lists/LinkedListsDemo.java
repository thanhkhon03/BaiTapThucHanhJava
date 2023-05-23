package Lists;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListsDemo {
    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự mới sau khi nhập số lượng

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            Student student = new Student();
            student.nhapThongTin();
            students.add(student);
        }

        System.out.println("\nDanh sách sinh viên:");
        for (Student student : students) {
            student.hienThiThongTin();
            System.out.println("------------------------");
        }

        // Thực hiện các chức năng Thêm, sửa, xoá 
    }
}

