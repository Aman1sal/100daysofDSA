public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {54, 32, 56, 53, 11, 25};
        System.out.println(search(arr, 53, 0));
    }
    public static int search(int[] arr, int target, int num){
        if(arr.length<num){
            return -1;
        }
        if(arr[num]==target){
            return num;
        }
        return search(arr, target, num+1);
    }
}
