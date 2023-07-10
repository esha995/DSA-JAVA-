import java.util.*;
public class Selection_Sort {
    public static void main(String args[])
    int [] arr= {2,5,1,4,3};
    for(int i=0;i<arr.length;i++){
        int key=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[key]>arr[j]){
                key=j;
            }
            int t=arr[i];
            arr[i]=arr[key];
            arr[key]=t;
        }
    }
}

