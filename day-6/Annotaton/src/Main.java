
//Annotation



import java.lang.annotation.*;


//Target to the type, here target type in class it can not be played to the Field,constructor or method
//if so you have to specify in the target
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.FIELD})
//It will reach till the JVM,
@Retention(RetentionPolicy.RUNTIME)

//It is annotation on mechanism of an  interface
@interface CricketPlayer
{
    int age() default 34;
    String country() default "India";
}

//learning the concept of annotation by practicing customize annotation

//This one way of passing the value  or defaulter values in the interface
//@CricketPlayer(age = 45, country = "India")
@CricketPlayer
class Virat
{
    @CricketPlayer
    private int runs;
    private int innings;
    @CricketPlayer
    public Virat()
    {
        System.out.println("Construction testing!");
    }
    @CricketPlayer
    public void setRuns(int runs)
    {
        this.runs=runs;
    }
    public void setInnings(int innings)
    {
        this.innings=innings;
    }
    public  int getRuns()
    {
        return runs;
    }
    public int getInnings()
    {
        return innings;
    }
}




public class Main {
    public static void main(String[] args) {

    Virat v = new Virat();
    v.setRuns(159834);
    v.setInnings(87);

    System.out.println(v.getRuns());
    System.out.println(v.getInnings());

    System.out.println("\n..........Fetching the default values of the annotation.....................");

    //Using reflection api to fetch the value of the annotation
    Class c = v.getClass();
    //all collections are store as objects, if you want as field you have to down cast from parent to field
    Annotation a = c.getAnnotation(CricketPlayer.class);
    //it will behave like CricketPlayer by down casting it
    CricketPlayer cricketPlayer = (CricketPlayer) a;

    System.out.println("Age: "+ cricketPlayer.age());
    System.out.println("Country: "+ cricketPlayer.country());
    }
}