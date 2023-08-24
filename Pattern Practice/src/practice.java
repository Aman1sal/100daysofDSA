public class practice {
    public static void main(String[] args) {
        pattern3(5);
    }
    public static void pattern1(int n){
        for(int row = 0; row<n; row++){
            for(int spaces=0; spaces<n-row; spaces++){
                System.out.print("  ");
            }
            for(int col = 0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int spaces = 0; spaces <= n-i; spaces++){
                System.out.print("  ");
            }
            for(int j = 1; j<= 2*i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row=0; row<2*n; row++) {
            int totalCols = row>n? 2*n-row:row;
            int spaces = n - totalCols;
            for (int s = 0; s<spaces; s++){
                System.out.print(" ");
            }
            for (int col = 0; col<totalCols; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
