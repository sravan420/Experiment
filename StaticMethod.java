public class StaticMethod {

    interface Interface {
        public static void m1() {
            System.out.println("OM Sai RAM");
        }
    }

    static class Test implements Interface {
        public void m1() {
            System.out.println("om sai ram ");
        }
    }

    /*we can declare main method in interface in java 1.8*/
    interface Infterface1{
        public static void main(){
            System.out.println("om sai ram ji");
        }
    }

    public static void main(String[] args) {
        /*when we declared the static method in the Interface than we can invoke static method only through Interface name*/
        Interface.m1();

    }
}
