class Student {
    String name;
    int age;
    String course;
    boolean isAttending;
    
    Student() {
        System.out.println("default constructor");
    }

    void study() {
        System.out.println(name + " is studying in " + course);
    }

    void attendClass() {
        if (isAttending) {
            System.out.println(name + " is attend the classes");
        } else {
            System.out.println(name + " is not attend the classes");
        }
        System.out.println();
    }

    void inilizeObject(String n, int a, String c, boolean ia) {
        System.out.println("intialize object.");
        name = n;
        age = a;
        course = c;
        isAttending = ia;
    }

}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inilizeObject("Rahul", 20, "B.Tech", false);
        s1.study();
        s1.attendClass();

        Student s2 = new Student();
        s2.inilizeObject("Priya", 19, "B.Sc", true);
        s2.study();
        s2.attendClass();

    }
}