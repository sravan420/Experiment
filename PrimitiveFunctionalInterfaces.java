import java.time.LocalDate;
import java.util.Date;
import java.util.function.*;

public class PrimitiveFunctionalInterfaces {

    public static <StringFunction> void main(String[] args) {

        Predicate<Integer> p = i -> i % 2 == 0;
        System.out.println(p.test(4));

        IntPredicate p1 = i -> i % 2 == 0;
        System.out.println(p1.test(8));

        Function<Integer, Integer> f = i -> i * i;
        System.out.println(f.apply(3));

        /*here Int incoming value and Integer is the return type*/
        IntFunction<Integer> f1 = i -> i * i;
        System.out.println(f1.apply(345));

        /*** next example**/
        Function<String, Integer> f2 = s -> s.length();
        System.out.println(f2.apply("DOG"));

        /*here ToInt is the return type and incoming value is string*/
        ToIntFunction<String> f3 = s -> s.length();
        System.out.println(f3.applyAsInt("cow"));


        /*to get the square root of the number*/
        Function<Integer, Double> f4 = i -> {
            return Math.sqrt(i);
        };
        System.out.println(f4.apply(5));

        ToDoubleFunction<Integer> f5 = i -> Math.sqrt(i);
        System.out.println(f5.applyAsDouble(7));

        /* (or) best approach is*/
        IntToDoubleFunction f6 = i -> Math.sqrt(i);
        System.out.println(f6.applyAsDouble(7));

     /*   Note: how to remebere primitive types easily in Functional Interaface means
                If Input:int output:int===>IntFunction
                If Input:LONG output:LONG===>LongFunction
                If Input:String output:int===>ToIntFunction<String>(f.applyAsInt())
                If Input:String output:Long===>ToLongFunction<String>(f.applyAsLong())
                If Input:int output:int===>IntToIntFunction(f.applyAsInt())
                If Input:String output:int===>StringToIntFunction(f.applyAsInt())
                If Input:Long output:Double===>LongToIntFunction(f.applyAsDouble())
                If Input:Double output:Long===> (f.applyAsLong())

*/


        Consumer<String> c=s->System.out.println(s);
        c.accept("om sai ram ji");

        IntConsumer c2=i->System.out.println(i*i);
        c2.accept(5);



        Supplier<Integer> supplier= ()->(int)(Math.random()*10);
       // System.out.println(supplier.get());
        String opt="";
        for(int i=0;i<5;i++){
            opt=opt+supplier.get();
            System.out.println(opt);
        }

        Supplier<Date> supplier1=()->new Date();
        System.out.println(supplier1.get());


        /*Supplier using Primitive*/
        IntSupplier supplier2=()-> (int) Math.cbrt(8);
        System.out.println(supplier2.getAsInt());

        ToIntFunction<Integer> f7=i->i*i;
        System.out.println(f7.applyAsInt(8));

        /*both the input and output type are same than go for UnaryOperator */
        UnaryOperator<Integer> u1=i->i*i;
        System.out.println(u1.apply(8));

        BinaryOperator<String> binaryOperator=(s1,s2)-> s1.concat(s2);
        System.out.println(binaryOperator.apply("sai","ram"));

        /*primitive version for BinaryOperator */
        IntBinaryOperator binaryOperator1=(i,j)->i*j;
        System.out.println(binaryOperator1.applyAsInt(3,4));

        /*primitive version for unaryoperator */
        DoubleUnaryOperator u2=i->Math.sqrt(i);
        System.out.println(u2.applyAsDouble(8));



    }


}
