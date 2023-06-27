import java.util.Arrays;

public class First {
    public static int[] getProductArray(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
// except self product of all element
        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * arr[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < n; i++) {
            output[i] = leftProduct[i] * rightProduct[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] output = getProductArray(arr);
        System.out.println(Arrays.toString(output));

    }
    
}
