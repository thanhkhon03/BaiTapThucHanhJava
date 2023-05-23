import java.util.Scanner;

public class Bai3 {
  
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String ten=sc.nextLine();

        System.out.println("Nhap nam sinh cua ban");
        int namSinh =sc.nextInt();

        int tuoi = 2023 - namSinh ;

        if(tuoi < 16){
            System.out.print("Ban"+ ten +"dang o do tuoi vi thanh nien.");          
        }else if (tuoi >=16  ){
            System.out.println("Ban"+ ten +"dang o do tuoi truong thanh.");           
        }else{
            System.out.println("Ban"+ ten +"da gia.");
        }
        sc.close();
    }
}