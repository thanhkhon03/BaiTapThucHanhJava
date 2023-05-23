import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Slide19 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(3);

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(3);

        // Sắp xếp ArrayList giảm dần
        arrayList.sort((o1, o2) -> o2 - o1);

        // Sắp xếp LinkedList tăng dần
        Collections.sort(linkedList, (o1, o2) -> o1 - o2);

        System.out.println("ArrayList sau khi sắp xếp: ");
        ListIterator<Integer> arrayListIterator = arrayList.listIterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("LinkedList sau khi sắp xếp: ");
        ListIterator<Integer> linkedListIterator = linkedList.listIterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
    }
}
