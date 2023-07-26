// // / / // // Incomplete....

//public class RotatedBS {
//    public static void main(String[] args) {
//        int[] array = {4,5,6,7,0,1,2};
//        System.out.println(findPivot(array));
//
//    }
//    static int findPivot(int[] arr){
//        int start = 0;
//        int end = arr.length - 1;
//        while(start<=end){
//            int mid = start + (end-start)/2;
//
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if(mid > start && arr[mid] < arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]<=arr[start]){
//                end = mid -1;
//            } else{
//                start = mid +1;
//            }
//        }
//        return -1;
//    }
//
//    static int binarysearch(int[] nums, int target, int start, int end){
//
//
//        if(pivot==-1){
//            while(start<=end){
//                int mid = start + (end-start)/2;
//                if(target>mid){
//                    start = mid + 1;
//                } else if (target<mid) {
//                    end = mid-1;
//                }
//                else{
//                    return mid;
//                }
//            }
//        }
//    }
//}
