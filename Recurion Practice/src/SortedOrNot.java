public class SortedOrNot {
    public static void main(String[] args) {
            int[] arr = {12,45,66,73,85,90};
        System.out.println(IsSorted(arr,0));
    }
    static boolean IsSorted(int[] arr, int c){
        if(arr.length -1 == c){
            return true;
        }
        return (arr[c+1]>arr[c]) && IsSorted(arr, c+1);
    }
}
