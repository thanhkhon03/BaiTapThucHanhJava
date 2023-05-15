import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
    public static void main(String[] args) {
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(9);
        linkedList.add(1);
        linkedList.add(4);

        // Sắp xếp LinkedList tăng dần
        Collections.sort(linkedList, (o1, o2) -> o1 - o2);

        System.out.println("Vi du su dung phuong thuc addA11()");
        System.out.println("------------------------------------");
     
        // Them cac phan tu cua list vao listA
        LinkedList<String> listA = new LinkedList<String>();
        listA.addA11(list);
        System.out.println("listA:");
        showList(listA);
        System.out.println("\n vi du su dung phuong thuc removeA11()");
        System.out.println("------------------------------------------");

        //Khoi tao listB
        LinkedList<String> listB =new LinkedList<String>();
        listB.add ("Java");

        //Xoa nhung phan tu khong thuoc ListB khoi List A
        listA.retainA11(ListB);
        System.out.println("ListA:");
        showList(listA);

        System.out.println("\nvi du su dung phuong thuc removeA11()");
        System.out.println("--------------------------------------");

        // Xoa nhung phan tu thuoc listB khoi list
        list.removeA11(listB);
        System.out.println("list:");
        showList(list);
    }
    public static void showList(LinkedList<String> list){
        // Show list through for each 
        for (String obj : list){
            System.out.printf("\t",+ obj +",");
        }
        System.out.println();
    }
}