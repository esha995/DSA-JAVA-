import java.util.*;
public class Transpose {
    public static void main(String [] args){
        int  [] [] arr ={
             { 10,11,12,13},
             {20,21,22,23},
             {30,31,32,33},
             {40,41,42,43}
        };
        display(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp= arr[i][j];
                arr[i][j]=arr[i][j];
                arr[i][j]=temp;
                System.out.println(arr[i][j] + " ");
            }
            
        }
        System.out.println("-------");
    }]
    
}
