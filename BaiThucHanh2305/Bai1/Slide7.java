package BaiThucHanh2305.Bai1;

public class Slide7 {
    public static void main(String[] args ) {
        try {
           String s = null;
           System.out.println(s.length());
           System.out.println("Trong khối try");

        } catch (Exception e){
            System.out.println(e);
        }
    }
}

