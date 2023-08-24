public class Reccursion {
    public static void main(String[] args) {
        int[] arr = {1, 24, 25, 35, 67, 89, 91, 93, 95, 98};
//        example(1);
//        System.out.println(fibonaci(6));
        System.out.println(binarySearch(arr, 91, 0, arr.length-1));
    }

    public static void example(int n){
        if (n>5){
            return;
        }
        System.out.println(n);
        example(n+1);

    }
    static int fibonaci(int n){
        if(n<2){
            return n;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m= s+ (e-s)/2;
        if (arr[m] == target){
            return m;
        }
        if(target<arr[m]){
            return binarySearch(arr, target, s, m-1);
        }
        return binarySearch(arr, target, m+1, e);
    }
}
