public class Bsearch {
    public static void main(String[] args) {
    int[] arr = {-34, -23, -12, -4, 0, 2, 4, 6, 8, 35, 67, 89};
    int target = 35;
    int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
//    return the index
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
//            find middle element
//            int mid = (start + end)/2;
//            int might exceed the range
            int mid = start + (end-start) / 2;
            if(target< arr[mid]){
                end = mid -  1;
            }
            else if(target> arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
