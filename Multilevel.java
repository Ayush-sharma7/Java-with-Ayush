// import java.util.*;

class person {
    private String name;
    private String adharid;
    private String pannumber;

    public person() {

    }

    public person(String name,
            String adharid,
            String pannumber) {
        System.out.println("Person");
        this.name = name;
        this.adharid = adharid;
        this.pannumber = pannumber;
    }

    void display() {
        System.out.println(name + "details: ");
        System.out.println("pan Number: " + pannumber);
        System.out.println("Adhar Number: " + adharid);
    }
}

class Employee extends person {
    int empid;
    String dept;

    Employee() {
        super();
    }

    public Employee(String name, String adharid, String pannumber, int empid, String dept) {
        super(name, adharid, pannumber);
        System.out.println("Employee");
        this.empid = empid;
        this.dept = dept;
    }

    void display() {
        super.display();
        System.out.println(empid + "Deputed to: " + dept.toUpperCase());
    }
}

class SoftwareEngineer extends Employee {
    String projectid;
    String projectname;

    SoftwareEngineer() {
        super();
    }

    public SoftwareEngineer(String name, String adharid, String pannumber, int empid, String dept, String projectid,
            String projectname) {
        super(name, adharid, pannumber, empid, dept);
        System.out.println("SoftwareEngineer");
        this.projectid = projectid;
        this.projectname = projectname;
    }

    void display() {
        System.out.println("Working on " + projectname);
        System.out.println("Project id: " + projectid);
    }
}

public class Multilevel {
    public static void main(String[] args) {

        SoftwareEngineer se;
        // se = new SoftwareEngineer("Rahul","12345");

    }
}