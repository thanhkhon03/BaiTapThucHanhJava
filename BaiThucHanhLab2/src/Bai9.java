import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập chuỗi bất kỳ: ");
            String inputString = scanner.nextLine();

            int countUpperCase = 0;
            int countLowerCase = 0;
            int countNumber = 0;

            for (int i = 0; i < inputString.length(); i++) {
                char ch = inputString.charAt(i);
                if (Character.isUpperCase(ch)) {
                    countUpperCase++;
                } else if (Character.isLowerCase(ch)) {
                    countLowerCase++;
                } else if (Character.isDigit(ch)) {
                    countNumber++;
                }
            }

            System.out.println("Số ký tự hoa trong chuỗi: " + countUpperCase);
            System.out.println("Số ký tự thường trong chuỗi: " + countLowerCase);
            System.out.println("Số chữ số trong chuỗi: " + countNumber);
        }
    }
}