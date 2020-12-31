import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerDemo {

    public static void main(String[] args){

        Consumer<String> c= s->System.out.println(s.length());
        Consumer<String> c1=s->System.out.println(s.toUpperCase());
        c.accept("om sai ram ji");
        c1.accept("om sai ram ji");

        Consumer<Employee> c2= e->System.out.println(e.getName());

        Predicate<Employee> p= e->e.getSalary()>5000;
        Function<Employee,Employee> f=e->{
            double sal=e.getSalary();
            double val=sal+200;
            e.setSalary(val);
            return e;};
        Consumer<Employee> c4=e->System.out.println(e);


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

        /*filter employee whoes sal >5000 and add 200 to the salary and get only those employees*/
        for (Employee e:employeeList){
            if(p.test(e)){
               Employee e1= f.apply(e);
               c4.accept(e1);

            }
            //c2.accept(e);
        }



    }

}
