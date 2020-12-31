import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream1 {


    public static void main(String[] args){
        List<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l= new ArrayList<Integer>();
        l.add(202);
        l.add(4);
        l.add(5);
        l.add(20);
        l.add(15);

       // System.out.println(l);
       //l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
       //l1=l.stream().map(i->i*2).collect(Collectors.toList());
       long res=l.stream().filter(i->i>5).count();
       l1=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
       Integer res1=l.stream().min((i1,i2)-> i1.compareTo(i2)).get();

       /*to get the max element*/
       int res2= l.stream().max((i,j) ->i.compareTo(j)).get();
       /*to get the max element 2nd approach*/
       int res3=l.stream().min((i,j)->j.compareTo(i)).get();

      // System.out.println(l1);
       //System.out.println(res3);


       //l.stream().forEach(i->System.out.println(i));
       // (or)
      // l.stream().forEach(System.out::println);
       Integer[] array=l.stream().toArray(Integer[]::new);
       for(int x:array){
           System.out.println(x);
       }


       /*how to apply streams concept on the group of values*/
        Stream<Integer> s= Stream.of(9,99,999,999);
        //System.out.println(s.max((i,j)->i.compareTo(j)));
        s.forEach(System.out::println);

        /*how to apply streams concept on the arrays */
        Double[] d={10.0,2.0,34.9,46.9};
        Stream<Double> s1= Stream.of(d);
        s1.forEach(System.out::println);

        List<Integer> list= Arrays.asList(10,20,30);
        list.stream().filter(i->i>10).map(i->i*2).sorted((i,j)->j.compareTo(i)).forEach(System.out::println);



    }
}
