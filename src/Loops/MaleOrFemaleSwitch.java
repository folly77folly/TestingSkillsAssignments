package Loops;

import java.util.Scanner;

public class MaleOrFemaleSwitch {

    public static void main(String[] args) {
        System.out.println("Enter you gender M or F");
        Scanner myScan = new Scanner(System.in);
        char gender = myScan.next().charAt(0);

        switch (gender){
            case 'M':
                System.out.println("You are a Male");
            case 'F' :
                System.out.println("You are a Female");
        }
    }
}
