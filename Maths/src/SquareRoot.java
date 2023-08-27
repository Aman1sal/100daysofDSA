public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(sqrt(n, 3));
    }
    static double sqrt(int n, int p){
        int start = 0;
        int end = n;
        double root = 0.0;
        while(start<=end){
            int mid = start + (end-start)/2;

            if(mid*mid == n){
                return mid;
            }
            if(mid*mid > n){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        double incr = 0.1;
        for(int i=0; i<p; i++){
            while(root*root<=n){
                root += incr;
            }
            root-= incr;
            incr/=10;
        }
        return root;

    }
}
