import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Slide17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(7);
        arrayList.add(6);
        arrayList.add(8);

        linkedList.add(7);
        linkedList.add(6);
        linkedList.add(8);

        arrayList.sort(Comparator.reverseOrder());
        Collections.sort(linkedList, Comparator.reverseOrder());

        System.out.println("ArrayList sau khi sắp xếp: ");
        for (int num : arrayList) {
            System.out.println(num);
        }

        System.out.println("LinkedList sau khi sắp xếp: ");
        for (int num : linkedList) {
            System.out.println(num);
        }
    }
}

