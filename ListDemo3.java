import java.util.*;

public class ListDemo3{
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names = new ArrayList<String>();

        names.add("Hemant");
        names.add("harsh");
        names.add("nikhil");
        names.add("aditya");
        names.add("dragon");
        names.add("hardik");
        names.add("yash");
        names.add(1,"ayush");

        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("--2, Retrieve Names--");

        for(String name : names){
            System.out.println(name);
        }

        System.out.println("--3, retrieve names--");
        Iterator it1 = names.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        System.out.println("--4, retrieve names--");
        names.stream().forEach(name -> System.out.println(name));
        // System.out.println(names.toString());
    }
}