package Operators;

import java.util.Scanner;

public class EqualNotEqual {
    public static void main(String[] args) {
        System.out.print("Enter your Age?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if( age == 12)
        {
            System.out.println("You are Correct");
        }else if(age != 12) {
            System.out.println("You are Wrong");
        }
    }
}
