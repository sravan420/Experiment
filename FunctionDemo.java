import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();


        Function<Integer, Integer> func2 = x -> x * 2;

        Function<String, String> f3 = s -> s.replace(" ", "");

        /*how many  spaces are there between the words in a given line*/
        Function<String, Integer> f4 = s -> s.length() - s.replaceAll(" ", "").length();

        Function<List<Employee>, Double> f5 = l-> {
            double total = 0;
            for(Employee emp:l){
                double sal=emp.getSalary();
                total=sal+total;
            }
            return total;
        };

        /*first func will be applied and than func2 will be applied*/
        Integer result = func.andThen(func2).apply("om sai ram   ji");

        /*first func will be applied and than func2 will be applied*/
        Integer result1=func2.compose(func).apply("om sai ram  ji") ;

        System.out.println(result1);
        //System.out.println(f3.apply("om sai ram  ji"));
        //System.out.println(f4.apply("om sai ram    ji"));


        //System.out.println(f5.apply(80));

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

        Predicate<Employee> p= e->e.getSalary()>5000;
        Function<Employee,Employee> f6=e->{
            double sal=e.getSalary();
            double insal=sal+200;
            return e;};

        for(Employee emp:employeeList){
            if(p.test(emp)){
//                    ArrayList<Employee> l= new ArrayList<>();
//                    l.add(emp);
                    System.out.println(f6.apply(emp));
                }

            }
        }


        //System.out.println(f5.apply(employeeList));

    }




