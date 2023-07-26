public class MountainPeak {
    public static void main(String[] args) {
        int[] array = {45, 69, 83, 89, 95, 92, 84, 63, 67};
        System.out.println(peakIndexInMountainArray(array));
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end  = arr.length -1;

        while (start<end){
            int mid = start + (end-start)/2;
            if(arr[mid] > arr[mid + 1]){
//                we are in decreasing part of array
//                it may or may not be answer
                end = mid;
            } else{
//                increasing part of array
                start = mid + 1;
            }
        }
//        unless start == end
        return arr[start];
    }
}
