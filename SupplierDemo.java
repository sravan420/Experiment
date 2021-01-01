import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<Date> s = () -> new Date();
        Employee employee = new Employee("sai", "student", 200.89, "Chicago");
        Employee employee1 = new Employee("om", "reporter", 2000.87, "Chicago");
        Employee employee2 = new Employee("ram", "police", 8200.32, "Chicago");
        Employee employee3 = new Employee("krishna", "doctor", 5040.42, "Chicago");
        Employee employee4 = new Employee("vishnu", "doctor", 3300.39, "Chicago");
        Employee employee5 = new Employee("ganesh", "laywer", 2050.9, "Chicago");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Supplier<String> s1 = () -> { return employee.getName(); };
        System.out.println(s1.get());

        Supplier<Integer> s2=()->{
            List<Integer> l= new ArrayList<Integer>();
            l.add(4);
            l.add(3);
            l.add(9);
            l.add(2);
            l.add(5);

            int x= (int) (Math.random()*2);
            return l.indexOf(x);
        };
        System.out.println(s2.get());

        System.out.println("Supplier first change");
        System.out.println("Supplier second change");
        System.out.println("Supplier third change");
        System.out.println("Supplier fourth change");
        System.out.println("Supplier fith change");
        System.out.println("Supplier sixth change");
    }
}
