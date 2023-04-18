import java.until.Arrays;
import java.until.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        
    
        int n = input.nextInt();

        // Khoi tao mang A voi n phan tu 
        int[] A = new int [n];

        // Nhap gia tri cho cac phan tu cua mang A tu ban phim 
        for (int i = 0;i < n; i++){
            System.out.print("Nhap phan tu thu" +(i + 1) + "cua mang");
            A[i] = input.nextInt();
        }
        
        // Sap xep mang A theo thu tu tang dan
        Arrays.sort(A);

        // In ra man hinh mang A ban dau 
        System.out.println("mang so ban dau: "+ Arrays.toString(A));

        // In ra man hinh mang A da sap xep tang dan
        System.out.println("Mang da sap xep tang dan: " + Arrays.toString(A));

        
    }
    
}