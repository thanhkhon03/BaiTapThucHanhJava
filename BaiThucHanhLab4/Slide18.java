import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);

        // Sắp xếp ArrayList giảm dần
        arrayList.sort((o1, o2) -> o2 - o1);

        // Sắp xếp LinkedList tăng dần
        Collections.sort(linkedList, (o1, o2) -> o1 - o2);

        System.out.println("ArrayList sau khi sắp xếp: ");
        Iterator<Integer> arrayListIterator = arrayList.iterator();
        while (arrayListIterator.hasNext()) {
            System.out.println(arrayListIterator.next());
        }

        System.out.println("LinkedList sau khi sắp xếp: ");
        Iterator<Integer> linkedListIterator = linkedList.iterator();
        while (linkedListIterator.hasNext()) {
            System.out.println(linkedListIterator.next());
        }
    }
}
