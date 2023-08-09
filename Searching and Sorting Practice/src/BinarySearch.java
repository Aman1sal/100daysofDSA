public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77,88,99};
        int target = 44;
        System.out.println(binarysearch(arr, target));
    }
    public static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            } else if (arr[mid]<target) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
