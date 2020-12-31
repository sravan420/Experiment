public class MethodReferenceDemo {

    interface Interface {
        public void m1();
    }


    static class Test {
        public void m2() {

            System.out.println("sai ram");
        }

        public static void m3() {
            System.out.println("sai ram ji omdfsadfsdf");
        }

    }

    class Sample{
        public void m2(){

        }
    }
    public static void main(String[] args) {

        /*using the lambda expression*/
        Interface i = () -> System.out.println("om sai ram ji");
        i.m1();
        /*using Annonymous inner class*/
//        Interface i4=  new Test(){
//                System.out.print("Annoymous inner class invoked");
//            };


        /*using Method Reference for refering static method*/
        Interface i1 = Test::m3;
        i1.m1();

        /*using Method Reference for refering non static method*/
        Test t = new Test();
        Interface i2 = t::m2;
        i2.m1();

    }


}


