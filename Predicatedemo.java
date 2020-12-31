import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicatedemo {



    public static void main(String[] args) {

//        Predicate<Integer> p = i -> i%2==0;
//        System.out.println(p.test(4));
//
//        Predicate<String> p1= s->s.length() %2==0;
//        Predicate<String> p2= s->s.length() >10;
//        System.out.println( p1.test("om sai ram ji"));
//        System.out.println( p2.test("om sai ram"));

        int x[] = {12, 2, 3, 4, 14, 15, 23, 35};
        String names[]={"sai","",null,"","ram","ji","om",null,"krishna"};
        java.util.function.Predicate<Integer> p1 = i -> i > 10;
        java.util.function.Predicate<Integer> p2 = i -> !(i % 2 == 0);
        java.util.function.Predicate<String> p3= s->s.charAt(0)=='k';/*s.startsWith("k");*/
        java.util.function.Predicate<String> p4= s->s!=null && s.length()> 0;
        java.util.function.Predicate<String> p5= s -> s.equals("Krishna"); /*&& user.getPassword().equals("sai");*/
        java.util.function.Predicate<User> p6= user-> user.isGirlfriend() && user.getAge()>18;
        java.util.function.Predicate<Employee> p7= employee->
                employee.getSalary() > 2000 && employee.getDesignation().contains("doctor") ||
                        employee.getDesignation().equals("Chicago") && employee.getName().length()>3;

        java.util.function.Predicate<Employee> p8= e->e.getSalary()>5000;

//        for(String s:names){
//            if (p4.test(s)) {
//
//                System.out.println(s);
//            }
//        }

        User user = new User("SAI", "123",12,false);
        User user1= new User("Ram","456",2,true);
        User user2= new User("ji","435",32,false);
        User user3= new User("om","420",34,true);
        User user4= new User("Krishna","111",5,false);
        User user5= new User("jii","435",56,true);


        ArrayList<User> l=new ArrayList<>();
        l.add(user);
        l.add(user1);
        l.add(user2);
        l.add(user3);
        l.add(user4);
        l.add(user5);
        for(User u:l){
//            String name=u.getUsername();
//            if (p5.test(name)) {
//                System.out.println(name);
//            }

            if(p6.test(u)){
               // System.out.println(u);
            }
        }


        Employee employee= new Employee("sai","student",200.89,"Chicago");
        Employee employee1= new Employee("om","reporter",2000.87,"Chicago");
        Employee employee2= new Employee("ram","police",8200.32,"Chicago");
        Employee employee3= new Employee("krishna","doctor",5040.42,"Chicago");
        Employee employee4= new Employee("vishnu","doctor",3300.39,"Chicago");
        Employee employee5= new Employee("ganesh","laywer",2050.9,"Chicago");

        List<Employee> employeeList= new ArrayList<Employee>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        for(Employee emp: employeeList){
            if(p7.test(emp)){
               //System.out.println(emp);
           }
            if(p8.test(emp)){
                double salary=emp.getSalary();
                double bonus=salary+500;
                emp.setSalary(bonus);
                //System.out.println(emp);
            }
            java.util.function.Predicate<Employee> p9=p7.and(p8);
            if (p9.test(emp)) {
                System.out.println(emp);
            }
        }


//        BiPredicate<Integer,Integer> P=(a, b)->a*b>0;
//        System.out.println(P.test(2,3));
    }



}
