import java.util.io*;
public class pattern {
    public static void main(String[] args) {
        int n = 5;
        int trow =(2*n)-1;
        int row=0;
        int nst=1;
        while(row<nrow){
            for(i=0;i<nst;i++){
                System.out.println("*");
            }
            if(row<trow/2)  //9/2=4 as total rows is 9
            {
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
            row++;
        }
       
    }
}