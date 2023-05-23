import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        List<SinhVien> danhSachSinhVien = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Thêm sinh viên vào danh sách
        System.out.println("Nhập thông tin sinh viên (Nhập tên rỗng để kết thúc):");
        while (true) {
            System.out.print("Tên sinh viên: ");
            String ten = scanner.nextLine();
            if (ten.isEmpty()) {
                break;
            }
            System.out.print("Điểm sinh viên: ");
            double diem = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số

            SinhVien sinhVien = new SinhVien(ten, diem);
            danhSachSinhVien.add(sinhVien);
        }

        // Đếm số sinh viên phải thi lại và hiển thị thông tin
        int countThiLai = 0;
        System.out.println("\nSinh viên phải thi lại:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() <= 5) {
                System.out.println(sinhVien);
                countThiLai++;
            }
        }
        System.out.println("Số sinh viên phải thi lại: " + countThiLai);

        // Hiển thị các sinh viên có điểm cao nhất
        double maxDiem = -1;
        System.out.println("\nSinh viên có điểm cao nhất:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() > maxDiem) {
                maxDiem = sinhVien.getDiem();
            }
        }
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() == maxDiem) {
                System.out.println(sinhVien);
            }
        }

        // Tìm kiếm sinh viên theo tên
        System.out.print("\nNhập tên sinh viên cần tìm: ");
        String tenSinhVien = scanner.nextLine();
        System.out.println("\nThông tin sinh viên tìm được:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getTen().equalsIgnoreCase(tenSinhVien)) {
                System.out.println(sinhVien);
            }
        }
        scanner.close();
    }
}

class SinhVien {
    private String ten;
    private double diem;

    public SinhVien(String ten, double diem) {
        this.ten = ten;
        this.diem = diem;
    }

    public String getTen() {
        return ten;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return "Sinh viên: " + ten + ", Điểm: " + diem;
    }
}
