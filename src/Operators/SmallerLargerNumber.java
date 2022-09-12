package Operators;

public class SmallerLargerNumber {
    public static void main(String[] args) {
        int a = 25;
        int b = 15;
        int c = 4;

        int min  = (a > b) ? a:b;
        int max  = (a < b) ? a:b;

        System.out.println("smaller number is" + min);
        System.out.println("larger number is" + max);
    }
}
