public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {45,78,91,62,34,55,10,8,32};
        int target = 32;
        System.out.println(linearsearch(arr, target));
    }
    public static int linearsearch(int[] arr, int target){
        for(int  i =0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
