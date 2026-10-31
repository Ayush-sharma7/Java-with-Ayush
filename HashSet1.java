import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {

        HashMap<Integer, Integer> h1 = new HashMap<>();

        h1.put(1, 10);
        h1.put(2, 9);
        h1.put(3, 8);
        h1.put(4, 7);
        h1.put(5, 6);
        h1.put(6, 5);
        h1.put(7, 4);
        h1.put(8, 3);
        h1.put(9, 2);
        h1.put(10, 1);
        System.out.println(h1);

        h1.put(3, 0);
        System.out.println(h1);

        HashMap<Integer, Integer> h2 = new HashMap<>();

        h2.put(11, 4);
        h2.put(12, 5);
        h2.put(13, 6);
        h2.put(14, 7);
        h2.put(15, 8);

        h1.putAll(h2);

        for (int i = 1; i <= h1.size(); i++) {
            System.out.print(h1.get(i) + " ");
        }

        h1.getOrDefault(53, 0);

        System.out.println("\n" + h1.containsKey(32));

        System.out.println(h1.containsValue(10));

        System.out.println(h1);

        h1.put(3, 8);

        System.out.println(h1);

        h1.replace(3, 1);

        System.out.println(h1);

        h1.replace(15, 8, 9);

        System.out.println(h1);

        h1.remove(3);

        System.out.println(h1);

        h1.remove(15, 9);
        System.out.println(h1);

        System.out.println(h1.keySet());

        System.out.println(h1.values());

        System.out.println(h1.entrySet());

        h1.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        System.out.println(h1.size());

        System.out.println(h1.isEmpty());

        h1.clear();

        System.out.println(h1);

    }
}