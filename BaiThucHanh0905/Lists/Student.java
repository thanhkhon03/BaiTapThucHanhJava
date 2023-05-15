package Lists;

import java.util.Scanner;

public class Student {
    private String fullName;
    private int age;

    public void nhapThongTin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        fullName = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        age = scanner.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
    }

    public void themMoiThongTin(String name, int newAge) {
        fullName = name;
        age = newAge;
    }

    public void suaThongTin(String newName, int newAge) {
        fullName = newName;
        age = newAge;
    }
}

