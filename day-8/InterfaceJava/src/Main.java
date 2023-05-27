
//interface in Java

interface Motor {
    float capacity = 7.5f;

    void consume();

    void run();

}

class WashingMachine implements Motor {
    public void run() {
        System.out.println("Washing Machine's rpm: 750rpm.");
    }

    public void capacity() {
        System.out.println("Washing Machine's capacity: " + capacity + "l.");
    }

    public void consume() {
        System.out.println("Washing Machine's power consumption: 700kWh.");
    }
}




public class Main {
    public static void main(String[] args) {

        WashingMachine ob = new WashingMachine();
        ob.run();
        ob.capacity();
        ob.consume();
        System.out.println("\n______________________________________________________________________________________________________");
        Features obj = new Features();

        obj.a_1();
        obj.a_2();
        obj.b_1();
        obj.b_2();
        obj.c_1();
        obj.c_2();

        System.out.println("\n______________________________________________________________________________________________________");

        Market o = new Market();

        o.Own_method();
        o.A_1();
        o.A_2();
        o.B_1();
        o.B_2();
    }
}