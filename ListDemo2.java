import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {

        ArrayList<Integer> all = new ArrayList<Integer>();

        all.add(Integer.valueOf(45));
        all.add(47);
        all.add(56);
        all.add(6789);
        all.add(556);

        System.out.println(all.toString());
    }
}