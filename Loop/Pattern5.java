public class Pattern5 {
    public static void main(String[] args) {
            int n = 5;
            int row =0;
            int nsp= n-1;
            int nst=0;
            int nst2=0;
            while(row<n){
                for( int i=0;i<nst;i++){
                    System.out.println("*");
                }
                for(int i=0;i<nsp;i++){
                    System.out.println("");
                }
                for(int i=0;i<nst2;i++){
                    System.out.println("*");
                }
                nst--;
                if(row!=0)
                nst2--;
    
                nsp+=2;
    
                row++;
                System.out.println("");
            }
           
        }
}

