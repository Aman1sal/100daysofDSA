public class Sortedornot {
    public static void main(String[] args) {
    int[] arr = {1,2,3,5,7,6,8,9};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }

        return arr[index] < arr[index + 1] && sorted(arr, index+1);
    }
}
