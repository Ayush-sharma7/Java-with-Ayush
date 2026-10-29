import java.util.*;

public class ListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(75);
        marks.add(43);
        marks.add(23);
        marks.add(77);
        marks.add(90);
        marks.add(87);
        marks.add(64);
        System.out.println(marks);
        System.out.println("no. of subjects: " + marks.size());

        System.out.println("max marks: " + Collections.max(marks));
        System.out.println("min makrs: " + Collections.min(marks));

        Collections.sort(marks);
        System.out.println("After sorting: ");
        System.out.println(marks);

        int searchFor = 75;
        int index = Collections.binarySearch(marks, searchFor);
        System.out.println("Found at: " + index);

        ArrayList arrlist = new ArrayList();
        ArrayList llist = new LinkedList();

        arrlist.add(12);
        llist.add(24);

        
    }
}