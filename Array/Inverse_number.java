import java.util.Arrays;
import java.util.Scanner;
public class Inverse_number {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        inverseArray(array);
        
        System.out.println("Inverted array: " + Arrays.toString(array));
    }
    
    public static void inverseArray(int[] array) {
        inverseArrayHelper(array, 0, array.length - 1);
    }
    
    public static void inverseArrayHelper(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        
        // Swap elements at left and right indices
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        
        // Recurse on the remaining subarray
        inverseArrayHelper(array, left + 1, right - 1);

    }
    }
}
