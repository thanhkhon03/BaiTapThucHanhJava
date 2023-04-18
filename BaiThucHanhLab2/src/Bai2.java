import java.util.Scanner;

import javax.lang.model.util.ElementScanner6; Scanner;
public class Bai2 {
    Public /**
     * @param args
     */
    static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print (" Nhập vào một số ");
            int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + "là số chẵn");
    }else{
        System.out.println(n+ "là số lẻ");
    }
    }
}