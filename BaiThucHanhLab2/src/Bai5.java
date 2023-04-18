import java.until.Scanner;

public class Bai5 {
    public static void main (String[] args){
        java.util.Scanner scanner = new Scanner (System.int);
        int sum =0;
        int num ;
        
        while (sum <=100){
            System.out.println("Nhap vao mot so nguyen:");
            num = scanner.nextInt();
            sum += num ;

        }
        System.out.println("Tong cac so da nhap:" +sum);
    }
    
}