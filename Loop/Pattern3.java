import java.util.io;
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int trow =(2*n)-1;
        int row =0;
        int nst=nint nsp=n-1;
        while(row<nrow){
            for(i=0;i<nst;i++){
                System.out.println("*");
            }
            if(nsp<trow/2)  
            {
               nst--;
               nsp--;
            }
            else{
                nst++;
                nsp++;
            }
            System.out.println();
            row++;
        }
       
    }
}