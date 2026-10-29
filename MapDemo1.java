import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Hemant");
        map.put(2, "Harsh");
        map.put(5, "Tarun");
        map.put(4, "Ajay");

        System.out.println("Size = " + map.size());
        System.out.println(map.toString());

        System.out.println("Name of 1: " + map.get(1));
        System.out.println("Name of 2: " + map.get(5));

        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        System.out.println("key 6? =" + map.containsKey(6));
        System.out.println("Value Ajay? =" + map.containsValue("Ajay"));

        Set<Map.Entry<Integer, String>> entry = map.entrySet();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("===========1============");

        for (Map.Entry<Integer, String> entry1 : entries) {
            System.out.println("Key = " + entry1.getKey());
            System.out.println("Values = " + entry1.getValue());
        }

        System.out.println("============2===========");
        Iterator<Map.Entry<Integer, String>> it1 = entries.iterator();
        while (it1.hasNext()) {
            Map.Entry<Integer, String> entry2 = it1.next();
            System.out.println("Key = " + entry2.getKey());
            System.out.println("Values = " + entry2.getValue());
        }

        System.out.println("============3===========");
        entries.stream()
                .filter(entry1 -> entry1.getKey() % 2 == 0)
                .forEach(entry1 -> {
                    System.out.println("key = " + entry1.getKey());
                    System.out.println("Values = " + entry1.getValue());
                });

    }
}