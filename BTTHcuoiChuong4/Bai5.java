package BTTHcuoiChuong4;

import java.util.*;

public class Bai5 {
    private String maSV;
    private String hoTen;
    private String lop;

    public Bai5(String maSV, String hoTen, String lop) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public static void main(String[] args) {
        Map<String, Bai5> danhSachSinhVien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập danh sách sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line sau khi đọc số
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Mã sinh viên: ");
            String maSV = scanner.nextLine();
            System.out.print("Họ và tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lớp: ");
            String lop = scanner.nextLine();

            Bai5 sinhVien = new Bai5(maSV, hoTen, lop);
            danhSachSinhVien.put(maSV, sinhVien);
        }

        // Hiển thị sinh viên thuộc lớp đã nhập
        System.out.print("\nNhập tên lớp cần tìm: ");
        String lopCanTim = scanner.nextLine();
        System.out.println("Danh sách sinh viên thuộc lớp " + lopCanTim + ":");
        for (Bai5 sinhVien : danhSachSinhVien.values()) {
            if (sinhVien.getLop().equalsIgnoreCase(lopCanTim)) {
                System.out.println("Mã sinh viên: " + sinhVien.getMaSV());
                System.out.println("Họ và tên: " + sinhVien.getHoTen());
                System.out.println("Lớp: " + sinhVien.getLop());
                System.out.println();
            }
        }

        // Hiển thị thông tin sinh viên theo mã sinh viên
        System.out.print("Nhập mã sinh viên cần tìm: ");
        String maSVCanTim = scanner.nextLine();
        Bai5 sinhVienCanTim = danhSachSinhVien.get(maSVCanTim);
        if (sinhVienCanTim != null) {
            System.out.println("Họ và tên: " + sinhVienCanTim.getHoTen());
            System.out.println("Lớp: " + sinhVienCanTim.getLop());
        } else {
            System.out.println("Không tìm thấy sinh viên có mã " + maSVCanTim);
        }

        scanner.close();
    }
}
