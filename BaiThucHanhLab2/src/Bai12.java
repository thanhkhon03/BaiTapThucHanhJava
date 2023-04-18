import java.until.Scanner;
public class Bai12 {
    public static void main(String[] args){
        java.util.Scanner input = new Scanner (System.in);

        //Nhap so hang cua ma tran
        System.out.print("Nhap so hang cua ma tran: ");
        int rows = input next.Int();

        // Nhap so cot cua ma tran 
        System.out.print("Nhap so cot cua ma tran: ");
        int cols = input next.Int();

        // Khoi tao ma tran A voi kich thuoc row x cols
        int [][] A = new int[rows][cols];

        // Nhap gia tri cho cac phan tu cua ma tran A tu ban phim 
        for (int i = 0;i < rows;i++){
            for (int j = 0;j < cols ; j++){
                System.out.print("Nhap phan tu A[" + i +"][" + j + "]: ");
                A[i][j] = input.nextInt();
            }
        }

        // Tim phan tu lon nhat trong ma tran A 
        int max = A[][];
        for (int i=0;i<rows;i++){
            for(int j=0;i<cols;i++){
                if (A[0][0]>max){
                    max = A [i][j];
                }
            }
        }
        // In ra phan tu lon nhat cua ma tran A 
        System.out.println("Phan tu lon nhat trong ma tran la: "+ max);
    }
}