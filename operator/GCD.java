import java.util.*;
public class GCD {
    public static void main(String[] args) {
        int num1 = 12, num2 = 30;
        int gcd = findGCD(num1, num2);
        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
     }
  
     public static int findGCD(int n1, int n2) {
        if (n2==0) {
           return n1;
        }
        else {
           return findGCD(n2, n1%n2);
        }
     }
}
