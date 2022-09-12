package Operators;

public class ArithmeticOperator {

    public static void addition(int x, int y)
    {
        int add = x + y;
        System.out.println("The division of x + y = " + add);
    }

    public static void multiply(int x, int y)
    {
        int mul = x * y  ;
        System.out.println("The division of x  y = " + mul);
    }

    public static void subtraction(int x, int y)
    {
        int sub = x - y;
        System.out.println("The division of x - y = " + sub);
    }

    public static void division(int x, int y)
    {
        int div = x /y ;
        System.out.println("The division of x /y = " + div);
    }
    public static void main(String[] args) {
        addition(2, 5);
        multiply(4, 5);
        subtraction(4, 5);
        division(4, 5);
    }
}
