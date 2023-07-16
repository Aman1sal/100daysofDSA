public class AgnoisticBS {
    public static void main(String[] args) {

        int[] arr = {-34, -23, -12, -4, 0, 2, 4, 6, 8, 35, 67, 89};
        int target = 35;
        int ans = orderAgnoisticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnoisticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = start + (end-start) /2;
            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (target<arr[mid]){
                    end = mid - 1;
                } else {
                    start  = mid - 1;
                }
                }
            else {
                if(target>arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
