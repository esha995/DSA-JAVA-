public class Pattern7 {
     public static void main(String[] args) {
        int c = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (j >= 3 - c && j <= 3 + c) {
                    System.out.print("  ");
    
                } 
                else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
                if (i >= 3) c--;
                else {
                    c++;
                }
            }
        }
}
