import java.util.*;
public class Inverse_number {
    public static void main(String args[]){
        int number = 32145;
        int inverseNumber = inverseWithDigitAtFirstPlace(number);
        System.out.println("Inverse number: " + inverseNumber);
    }

    public static int inverseWithDigitAtFirstPlace(int number) {
        int inverseNumber = 0;
        int position = 1;

        while (number != 0) {
            int digit = number % 10;
            inverseNumber += position * Math.pow(10, digit - 1);
            number /= 10;
            position++;
        }

        return inverseNumber;
    }
    
}
