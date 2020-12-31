import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GroupingBy {




    public static void main(String[] args) {

        Person p = new Person("SAI", "BRAZIL");
        Person p1 = new Person("RAM", "BRAZIL");
        Person p2 = new Person("KRISHNA", "BRAZIL");
        Person p3 = new Person("SHIVA", "INDIA");
        Person p4 = new Person("LAKSHMI", "INDIA");
        Person p5 = new Person("SITHA", "USA");
        Person p6 = new Person("SAI", "USA");
        Person p7 = new Person("SAI", "USA");
        List<Person> l = new ArrayList<Person>();
        l.add(p);
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        l.add(p6);


        /*to get the uniques names and convert it to lower case*/
        System.out.println(l.stream().map(t->t.name.toLowerCase()).distinct().collect(Collectors.toList()));
        l.stream().map(t->t.country).distinct().forEach(System.out::println);


        System.out.println(l.stream().collect(Collectors.groupingBy(person -> person.country)));
        System.out.println(l.stream().collect(Collectors.groupingBy(person -> person.country, Collectors.counting())));
        /*want the same names for the same country*/
        System.out.println(l.stream().collect(Collectors.partitioningBy(person -> person.name.equals("SAI"))));
        Map<?,?> map = l.stream().collect(Collectors.partitioningBy(person -> person.name.equals("SAI"),
                Collectors.mapping(x->x.name.toLowerCase(),Collectors.toList())));
        System.out.println(map);


        Product product1= new Product("TV","ENTERTAINMENT",500.35);
        Product product2= new Product("Book","STUDYING",500.335);
        Product product3= new Product("GAME","CHILLING",400.35);
        Product product4= new Product("TV","BORING",600.35);
        Product product5= new Product("FRIDGE","FOOD",300.35);
        Product product6= new Product("TV","NATURE",50.35);

        List<Product> productlist=new ArrayList<Product>();
        productlist.add(product1);
        productlist.add(product2);
        productlist.add(product3);
        productlist.add(product4);
        productlist.add(product5);
        productlist.add(product6);



        /*Product name as key and price is the value which is the sum of prices of same type*/

     //  System.out.println(productlist.stream().collect(Collectors.toMap(x->x.getName(), x->x.getPrice())));

       Map<?,?> map1= productlist.stream().collect(Collectors.groupingBy(t->t.name,Collectors.mapping(y->y.price,Collectors.toList())));
       System.out.println(map1);
       map1.forEach((k,v)->System.out.println( k + ":" +v));






    }


}
