import java.util.*;
public class Array_split {
    public static void main(String [] args){
        int  [] [] arr ={
             { 5,1,9,11},
             {2,4,8,10},
             {13,3,6,7},
             {15,14,12,16}
        };
        int Cmin = 0;
        int Rmin = 0;
        int Cmax = arr[0].length-1;
        int Rmax = arr.length-1;

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i][Cmax]+" ");
        }
           
       Cmax--;
       System.out.println();

       for(int i=Cmax;i>=Cmax;i--){
        System.out.println(arr[Rmax][i]+" ");
       }
       Rmax--;
       System.out.println();

       for(int i=Rmax;i>=Rmax;i--){
        System.out.println(arr[i][Cmax]+" ");
       }
       Cmin++;

       System.out.println();
    }
}