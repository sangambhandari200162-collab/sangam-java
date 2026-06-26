 class Employee {
    private int empID;
    private String department;

    public Employee(int empID, String department) {
        this.empID = empID;
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Employee emp = (Employee) obj;

        return empID == emp.empID &&
               department.equals(emp.department);
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(empID);
        result = 31 * result + department.hashCode();
        return result;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "IT");
        Employee e2 = new Employee(101, "IT");
        Employee e3 = new Employee(102, "HR");

        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("e1 hash code: " + e1.hashCode());
        System.out.println("e2 hash code: " + e2.hashCode());

        System.out.println();

        System.out.println("e1 equals e3: " + e1.equals(e3));
        System.out.println("e3 hash code: " + e3.hashCode());
    }
}