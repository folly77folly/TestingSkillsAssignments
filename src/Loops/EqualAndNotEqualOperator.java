package Loops;

import java.util.Scanner;

public class EqualAndNotEqualOperator {
    public static void main(String[] args) {
        System.out.println("What is your current age");
        Scanner myScan = new Scanner(System.in);
        int age = myScan.nextInt();

        if(age == 18){
            System.out.println("You are old enough to Drive");
        }
        if (age != 18){
            System.out.println("Sorry You are noy old enough to Drive");
        }
    }
}
