// factorial using iteration and recursion methods
// 6! = 5*4*3*2*1
// 
class factorial{
    public static void main(String[] args) {
       int number = 7;
       int result = 0;
       result = fact (number);

       System.out.println(result);
    }

    public static int fact(int number)
    {
        //interation
        //int value = 1;
        // for(int loop = 1; loop <= number; loop++)
        // { 
               //6! = 5*4*3*2*1
        //     value = value * loop;
        // }
        //return value;

        //recurtion
        if(number == 0)
        {
            return 1;
        }
        // fact(5)= 5*fact(4)
        return number * fact(number - 1);
    }
}