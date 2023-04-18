import java.util.Scanner;
public class Bai8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong dãy: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0;i < n; i++){
            System.out.printf("Nhập phần tử thứ %d: ",i + 1);
            int number =scanner.nextInt();
            sum +=number;

        }
        double average = (double)sum /n;
        System.out.println("Trung bình cộng của dãy số là: %.2f", average);
        scanner.close();


    }
}