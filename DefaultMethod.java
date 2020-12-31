public class DefaultMethod {


    interface Interface {
        default void m2() {
            System.out.println("m1 method invoked");
        }
    }

    interface Interface1 {
        default void m2() {
            System.out.println("interface1 method is invoked");
        }
    }

    interface Interface2 {
        default void m2() {
            System.out.println("interface2 method is invoked");
        }
    }

    interface Interface3 {
        default void m2() {
            System.out.println("interface3 method is invoked");
        }
    }

    interface Interface4 {
        default void m2() {
            System.out.println("interface4 method is invoked");
        }
    }

    static class Test implements Interface, Interface1, Interface2, Interface3, Interface4 {
        public void m2() {
            /*we can call whatever interface method using super */
            Interface4.super.m2();
            //System.out.println("om namshivaya");
        }

    }

    public static void main(String[] args){
        Test t=new Test();
        t.m2();
    }


}
