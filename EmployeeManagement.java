class Employee{
    int id;
    String name;
    String department;
    Employee(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
    void displayInfo(){
        System.out.println("------------------------------------------");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee department: " + department);
    }
    static class Faculty extends Employee{
        String subject;
        String designation;
        int experience;
        Faculty(String s, String d, int ex, int id , String name, String dept){
            super(id,name,dept);
            subject = s;
            designation = d;
            experience = ex;
        }
        void displayFacultyInfo(){
            System.out.println("--------------------------------------");
            System.out.println("Subject: "+subject);
            System.out.println("Designation: "+designation);
            System.out.println("Experience: "+experience);
        }
    }
}
public class EmployeeManagement{
    public static void main(String[] args){
        Employee.Faculty f = new Employee.Faculty("OOPs", "Assignment Professor", 5,
            1111, "Amit Singh", "CEA");

        f.displayInfo();
        f.displayFacultyInfo();
    }
}