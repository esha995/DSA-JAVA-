import java.util.*;
public class ReverseNumber {
    public static void  main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // read user input and store it in a variable
        System.out.println("Enter a number:");
        int num = scanner.nextInt(); // read input as an integer

        // close the scanner object to prevent resource leaks
        scanner.close();

        // reverse the number
        int reverse = 0;
        while(num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        // print the reverse number
        System.out.println("Reverse number is: " + reverse);
    }
}
