import java.until.Scanner;
public class Bai6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen duong n: ");
        int n = sc.nextInt();
        sc close();

        int giaiThua = 1;
        int i = 1;
        do{
            giaiThua *=i;
            i++;

        } while(i<=n);
        System.out.println("Giai thua cua "+ n + "la:"+ giaiThua);
    }
    
}