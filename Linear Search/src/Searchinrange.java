public class Searchinrange {
    public static void main(String[] args) {
        int[] num = {12,23,34,45,56,67,78,89,90};
        int target = 67;
        System.out.println(rangesearch(num, target, 1, 8));
    }
    static int rangesearch(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for (int index = start; index<=end; index++){
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
