package Loops;
import java.util.Scanner;
public class ArmstrongNumber {

    static boolean  isArmstrong(int n){
       int result = 0;
       int temp = n ;
        while(n != 0){
            int r = n % 10;
            result += (r * r * r);
            System.out.println(result);
            n = n / 10 ;
        }
        return result == temp;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        //User Input stored in num
        int num = new Scanner(System.in).nextInt();

        //if(true)
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
        /* The first few Armstrong numbers between 0 to 999 are
            1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407. */
    }
}
