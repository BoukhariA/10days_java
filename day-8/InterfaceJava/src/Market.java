
//Multiple implementation from interfaces

interface Shop_A {
    void A_1();

    void A_2();
}

interface Shop_B {
    // void A_1();
    void B_1();

    void B_2();
}

class Market implements Shop_A, Shop_B {
    void Own_method() {
        System.out.println("HI there!, method of who is not implemented from interfaces.\nI am done");
    }

    public void A_1() {
        System.out.println("\nOh, HI");
    }

    public void A_2() {
        System.out.println("Oh, wow this interesting.");
    }

    public void B_1() {
        System.out.println("Is working?");
    }

    public void B_2() {
        System.out.println("This is awesome!");
    }
}