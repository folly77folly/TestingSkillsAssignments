package Loops;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int n){

        boolean isPrime = false;
        //Prime numbers are only divisible by 1 and the number itself.
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                isPrime = true;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {
        System.out.println("Enter Your Number : ");
        Scanner myScan =  new Scanner(System.in);
        int userNumber = myScan.nextInt();
            if(isPrime(userNumber) == true){
                System.out.println(userNumber + " is a Prime Number");
            }else{
                System.out.println(userNumber + " is not aPrime Number");
        }
    }
}
