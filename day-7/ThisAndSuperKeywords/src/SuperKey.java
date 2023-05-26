//Every class in java extends and object class
public class SuperKey {

    int num = 8753;

    public SuperKey()
    {
        System.out.println("In SuperKey!");
    }
    public SuperKey(int money)
    {
        super();
        System.out.println("Money constructor ");
    }
}
class KeySuper extends SuperKey

{
      int num = 8354; //instance variable of class KeySuper
    public KeySuper()
    {
        //You can directly pass the value it will can parameterized constructor of class SuperKey from the here
        super(987);
        System.out.println("In KeySuper!");
        System.out.println("\n//________________Constructor Stuff________________//");
    }
    public KeySuper(int cash)
    {
        this(); //if we use this instead of super() keyword it will call default constructor of class KeySuper
        System.out.println("Cash constructor");
        System.out.println("\n//________________Constructor Stuff________________//");
    }

    //specific example for super key word itself
    public void display()
    {
        int num = 934;//local variable
        //we can use this keyword to print Instance variable of Class KeySuper
        //if you want to access instance variable from class SuperKey you can use super keyword
        System.out.println(super.num);
    }
}




