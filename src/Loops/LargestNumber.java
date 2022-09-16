package Loops;

public class LargestNumber {
    public static void main(String[] args) {
        int numbers[] = {10,15, 1, 2, 4};
        int maximumNumber = numbers[0];
        for(int i  = 1; i < numbers.length; i++){
            if( numbers[i] > maximumNumber){
                maximumNumber = numbers[i];
            }
        }
        System.out.println("The Maximum Number is "+ maximumNumber);
    }
}
