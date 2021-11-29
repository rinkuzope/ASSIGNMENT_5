import java.util.*;
public class EmployeeClass {

    class Employee implements Comparable<Employee> {
        int empId;
        float salary;
        static int dob;
        int dateOfJoining;
        String name;

        public Employee(int empId, float salary, int dob, int dateOfJoining, String name) {
            this.empId = empId;
            this.salary = salary;
            this.dob = dob;
            this.dateOfJoining = dateOfJoining;
            this.name = name;
        }

        @Override
        public int compareTo(Employee o) {
            return 0;
        }
    }
    class Department {
        String deptName;
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(2, 5000, 20/10/1998, 21/11/2021, "Uzumaki"),
                new Employee(1,7000,21/10/1994,25/11/2021,"Minato"),
                new Employee(3,6000,16/6/2001,17/11/2021,"Luffy"),
                new Employee(4,9000, 01/11/2002,5/11/21,"Zoro"));
                Collections.sort(employees, Employee.dob);
                for (Employee str: employees)
        {
            System.out.println(str);
        }




    }

    }








