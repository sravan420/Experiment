import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {

        /*BiPredicate*/
        BiPredicate<Integer, Integer> biPredicate = (i, j) -> (i + j) % 2 == 0;
        System.out.println(biPredicate.test(2, 5));

        /*BiFuncion usage*/
        BiFunction<Integer, Integer, Integer> biFunction = (i, j) -> i * j;
        System.out.println(biFunction.apply(2, 3));

        BiFunction<Integer, String, Animal> biFunction1 = (a, b) -> new Animal(a, b);
        System.out.println(biFunction1.apply(13, "DOG"));
        System.out.println(biFunction1.apply(23, "COW"));

        Animal animal= new Animal(12,"cow");
        User user= new User("sai","123",32,true);

        BiFunction<User,Animal,Integer> bf=(a,b)->a.getAge()+b.getAge();
        System.out.println(bf.apply(user,animal));

        BiConsumer<Integer,Integer> biConsumer=(a,b)->System.out.println("first val is:" +a +" "+ "and Second Value is:"+ b);
        biConsumer.accept(8,5);

        /*Automatic conversion from primitive type (12) to Wrapper Object(i) is called AutoBoxing
        * Primitive type to Object type===>AutoBoxing
        * Object type to Primitive type====>AutoUnBoxing*/
        Integer i=12;

        /*Automatic conversion from Wrapper Object to primitive type is called AutoUnBoxing*/
        Integer j= new Integer(2);
        int k=j;
        System.out.println(k);




    }

}