public class AnnoymousInnerClassDemo {

    interface Interface {
        public void m1();
    }

    public static void main(String[] args) {
        /*using Annoymous inner class*/
        Interface i = () -> {
            System.out.println("Annoymous inner class invoked");
        };
        i.m1();

        /*using lambda expression*/
        Interface i1 = () -> System.out.println("lambda expression");
        i1.m1();


//        Runnable r=()->{
//            for(int j=0;j<5;j++){
//                System.out.println("child thread");
//            }
//        };
//        Thread t= new Thread(r);
//        t.start();
//
//        for(int k=0;k<=3;k++){
//            System.out.println("main thread");
//        }
//    }


//    Runnable r=()->{
//        for(int j=0;j<5;j++){
//            System.out.println("child thread");
//        }
//    };
        Thread t1 = new Thread(() -> {
            for (int k = 0; k <= 3; k++) {
                System.out.println("child thread");
            }
        });

        t1.start();
        for(int k=0;k<=3;k++){
            System.out.println("main thread");
       }
    }


    }

