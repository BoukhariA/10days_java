// Fibonacci using iteration and recursion methods
//implementing memorision in java 

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    //memorization implementation
    private static Map<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) 
    {
        int pos = 9;
        //fib(pos);
        int result = fib(pos);
        System.out.println(result);
    }
    public static int fib(int pos)
    {
        //int a = 0, b = 1;
        // System.out.println(a);
        // System.out.println(b);

        //int c = 0;

        //interaction method
        //0 1 1 2 3 5 8 13 21 34 55
          //a b c
        // for(int loop = 2; loop <= pos; loop++)
        // {
        //     c = a + b;
        //     a = b;
        //     b = c;

        //     System.out.println(c);
        // }
        //return c;


        //recursion method

        if(pos == 0)
            return 0;
        
        if(pos == 1 || pos == 2)
            return 1;
            
        if(cache.containsKey(pos))
            return cache.get(pos);

        int result = fib(pos-1) + fib(pos-2);
        cache.put(pos, result);

        return result;
    }
}
