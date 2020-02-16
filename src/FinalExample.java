public class FinalExample {
    private final int a = 10;

    public int getA() {
        return a;
    }

    public void multiplyByTwo() {
//        this.a = a*2;
    }

    public static void main(String[] args) {
        FinalExample ob = new FinalExample();
        System.out.println(ob.getA());
        ob.multiplyByTwo();
    }
}

class Car {

    final void run() {
        System.out.println("running");
    }
}

class Maruti extends Car {

//    void run() {
//        System.out.println("Running at 100 KMPH");
//    }

    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.run();
    }
}

final class Bike {
    void run(){
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();
    }
}

//class KTM extends Bike{
//
//    public static void main(String[] args) {
//
//    }
//}
