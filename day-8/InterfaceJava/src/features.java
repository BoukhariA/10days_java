
interface inheritance_in_multiple_interface{
    void a_1();
    void a_2();


}
interface feature_B {
    void b_1();
    void b_2();
    int ID = 0;
}
//feature_C it is extended from the above features
interface feature_C extends feature_B, inheritance_in_multiple_interface{
    //it will inherit all the method of two interfaces
    void c_1();
    void c_2();
}

class Features implements feature_C {

    public void a_1(){
        System.out.println("\nA1");

    }
    public void a_2(){
        System.out.println("A2");
    }
    public void b_1(){
        System.out.println("B1");
    }
    public void b_2(){
        System.out.println("B2");
    }
    public void c_1(){
        System.out.println("C1");
    }
    public void c_2(){
        System.out.println("C2");
    }

}


