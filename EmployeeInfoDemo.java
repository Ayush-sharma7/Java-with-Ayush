class Employee {
    int emp_no;
    String emp_name;
    String join_date;
    char desigcode;
    String dept;
    int basic;
    int hra;
    int it;

    Employee(int emp_no,
            String emp_name,
            String join_date,
            char desigcode,
            String dept,
            int basic,
            int hra,
            int it) {
        this.emp_no = emp_no;
        this.emp_name = emp_name;
        this.join_date = join_date;
        this.desigcode = desigcode;
        this.dept = dept;
        this.basic = basic;
        this.hra = hra;
        this.it = it;
    }

    public String toString() {
        return "Employee Details:\n" +
                "Employee Number: " + emp_no + "\n" +
                "Employee Name: " + emp_name + "\n" +
                "Join Date: " + join_date + "\n" +
                "Designation Code: " + desigcode + "\n" +
                "Department: " + dept + "\n" +
                "Basic: " + basic + "\n" +
                "HRA: " + hra + "\n" +
                "I.T: " + it;
    }

    public class EmployeeInfoDemo {
        public static void main(String[] args) {

            Employee e1 = new Employee(1001, "Ayush", "01/01/2026", 'E', "R&D", 20000, 8000, 10000);

        }
    }
}