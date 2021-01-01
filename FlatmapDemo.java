import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlatmapDemo {


    public static void main(String[] args) {
        List<String> pno = Arrays.asList("4590", "344", "454", "456", "78", "879785");
        List<Student> students = Arrays.asList(
                new Student("sai", 25, pno),
                new Student("ram", 55, pno),
                new Student("shiva", 35, pno),
                new Student("krishna", 36, pno)


        );

        Optional<String> s = students.stream().map(st -> st.getPhonenumbers().stream())/*list of phone number*/
                .flatMap(stringstream -> stringstream.filter(phno -> phno.equals("454")))
                .findAny();
        s.ifPresent(phnno -> System.out.println(phnno));


        String val = "om sai ram ji";
        String val1 = null;
        Optional<String> str = Optional.ofNullable(val);
        System.out.println(str.isPresent());
        System.out.println(str.orElse("entered valued found is empty"));


        int a[]={1,2,3,2,8};
        OptionalInt min= IntStream.of(a).min();
        System.out.println(min);
        OptionalInt max= IntStream.of(a).max();
        System.out.println(max);
        System.out.println(min.orElse(0));
        System.out.println(max.getAsInt());
        
       
        
        System.out.println("hey add some changes for rebase from github");
         System.out.println("hey adding some changes for rebase from github");

        System.out.println("hey added some for rebase from local");

        students.stream().sorted(Comparator.comparingInt(Student::getRollno).reversed()).limit(3).map(st->st.getName()).forEach(System.out::println);



    }
}
