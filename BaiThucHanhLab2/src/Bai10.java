
public class Bai10 {
    public static void main(String[] args){
        java.util.Scanner scanner =new Scanner (System.in);

        //Nhap chuoi va ki tu can tim
        System.out.print("Nhap chuoi: ");
        String str =scanner.nextline();
        System.out.print("Nhap ky tu can tim: ");
        char ch = scanner.next().charAt(0);

        // Dem so lan xuat hien cua ky tu trong chuoi 
        int count =0;
        for (int = 0; i < str length(); i + + ){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        // In ra ket qua 
        System.out.println("So lan xuat hien cua ky tu"+ ch + "trong chuoi la: "+count);

        scanner.close();
    }
    
}