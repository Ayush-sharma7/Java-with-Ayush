class Student{
    String n;
    int a;
    String c;
    boolean isA;

    void study(){
        System.out.println(n +" is studying in "+ c);
    }
    void attendClasses(){
        if (isA){
            System.out.println(n + " is attending the classes");
        }
        else{
            System.out.println(n + " is not attending the classes");
        }
    }
    void initializeObject(String name, int age, String course, boolean isAttending){
        System.out.println("initializing object.");
        n = name;
        a = age;
        c = course;
        isA = isAttending;
    }
}
public class StudentDemo{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.initializeObject("Rahul",20,"B.Tech",true);
        s1.study();
        s1.attendClasses();
    }
}