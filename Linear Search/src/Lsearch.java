public class Lsearch {
    public static void main(String[] args) {
    int[] nums = {12, 45, 78, 90, 46, 47, 87, 32};
    int target = 47;
    int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
//    // // search in the array
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
//        // // if not found
        return -1;
    }
}
