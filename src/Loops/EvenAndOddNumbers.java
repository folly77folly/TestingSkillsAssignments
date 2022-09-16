package Loops;

public class EvenAndOddNumbers {

    public static void printEvenOdd(int x){
        for (int i = 1 ; i <= x ; i++){
            if(i % 2 == 0){
                System.out.println(i + " is even number");
            }else{
                System.out.println(i + " is odd number");
            }
        }

    }

    public static void main(String[] args) {
        printEvenOdd(15);
    }
}
