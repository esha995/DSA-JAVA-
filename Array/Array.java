import java.util.Scanner;
public class Array {
    public static void main(String args[]){
        
        int[][] arr = new int[3][5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        Scanner sc = new Scanner (System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println();
        }

        for(int[] a: arr){
            for(int K:a){
                System.out.println(K+" ");
            }
            System.out.println();
        }

    }
}
