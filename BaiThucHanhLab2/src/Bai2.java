import java.util.Scanner; 
public class Bai2 {
    public /**
     * @param args
     */
    static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print (" Nhập vào một số ");
                int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + "là số chẵn");
   }else{
            System.out.println(n+ "là số lẻ");
   }
        }
    }
}