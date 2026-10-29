import java.util.*;

class Student14 {
    private int Id;
    private String Name;
    private int Age;

    public Student14(int id, String name, int age) {
        this.Id = id;
        this.Name = name;
        this.Age = age;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }
}

public class TreeSetDemo{
    public static void main(String[] args){
        Student14 s1 = new Student14(101,"Rajiv",20);
        Student14 s2 = new Student14(120,"Riya",30);
        Student14 s3 = new Student14(132,"Sanjay",32);
        Student14 s4 = new Student14(123,"Rohini",33);

        TreeSet<Student14> set = new TreeSet<Student14>(
            Comparator.comparing(obj -> obj.getName())
        );
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        System.out.println(set);
    }
}