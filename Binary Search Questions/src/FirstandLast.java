//public class FirstandLast {
////    find first and last element of sorted array in given target value
////    // ex: for [5,7,8,8,10] and target =8, return [3,4]
//    public static void main(String[] args) {
//        int[] arr = {5, 7, 8, 8, 10};
//        int target = 8;
//        int[] result = firstandlastposition(arr, target);
//        System.out.println(result);
//    }
//
//    public int[] firstandlastposition(int[] arr, int target){
//        int[] ans = {-1, -1};
//        int start = 0;
//        int end = arr.length - 1;
//        while(start<=end){
//            int mid = start + (end- start)/2;
//            if(target<arr[mid]){
//                end=  mid -1;
//            }
//            else if(target>arr[mid]){
//                start = mid + 1;
//            }
//            else {
//                ans = mid;
//            }
//        }
//        return ans;
//    }
//}
