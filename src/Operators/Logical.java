package Operators;

public class Logical {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;

        //logical AND operator
        System.out.println(a > b && a > c);//true && true = true
        System.out.println(a > b && a < c);//true && false = false
        System.out.println(a < b && a < c);//false && false = false
        System.out.println(a < b && a > c);//false && true = false

        //logical OR operator
        System.out.println(a > b || a > c);//true or true = true
        System.out.println(a > b || a < c);//true && false = true
        System.out.println(a < b || a < c);//false && false = false
        System.out.println(a < b || a > c);//false && true = true

        // Logical not
        System.out.println(!(a > b));//true && true = false
        System.out.println(!(a < b));//true && true = true
    }
}
