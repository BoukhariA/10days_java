//Basic annotation

//By using this '@FunctionalInterface' annotation, it tells the concept of lambda is used it not possible to add extra info
@FunctionalInterface //supplementary info
interface Basic
{
    //It is not possible to add extra information here.
    void show();
}

class Animal
{
    public void eat()
    {
        System.out.println("Animal eats");
    }

    public void AnimalsHuntAndEat()
    {
        System.out.println("Parent class");
    }


}
class Lion extends Animal
{
    //this method it will overwrite the behavior of the parent class
    @Override
    public void eat()
    {
        System.out.println("Lion hunts and eat");
    }
    //to check if you are override the propre method you can use annotation "@Override"to check if changing the right method
    @Override
    public void AnimalsHuntAndEat()
    {
        System.out.println("Child class");
    }
}

public class B_in_annotation {
    public static void main(String[] args) {
    // Using the concept of Lambda expression to implement the interface in the main method
        // We can use Lambda expression if interface has more than one abstract method
    Lion lion  = new Lion();
    lion.eat();
    lion.AnimalsHuntAndEat();
        System.out.println("^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*^*");
     Basic b;
        b = ()-> {
            System.out.println("I have used lambda expression");
        };
    }
}
