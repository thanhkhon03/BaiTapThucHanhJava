import java.util.ArrayList;
import java.util.LinkedList;

public class Slide16 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(8);

        // Sắp xếp ArrayList
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) < arrayList.get(j)) {
                    int temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(j));
                    arrayList.set(j, temp);
                }
            }
        }

        // Sắp xếp LinkedList
        for (int i = 0; i < linkedList.size() - 1; i++) {
            for (int j = i + 1; j < linkedList.size(); j++) {
                if (linkedList.get(i) < linkedList.get(j)) {
                    int temp = linkedList.get(i);
                    linkedList.set(i, linkedList.get(j));
                    linkedList.set(j, temp);
                }
            }
        }

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
