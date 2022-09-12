package Operators;

public class IncrementAndDecrement {

    public static void increment(int x)
    {
        for(int i = 0; i < x; i++)
        {
            System.out.println(i);
        }
    }

    public static void decrement(int x)
    {
        for(int i = 0; i < x; i--)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        increment(10);
        decrement(10);
    }
}
