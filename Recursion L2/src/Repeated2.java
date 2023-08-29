import java.util.ArrayList;

public class Repeated2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5,5,5,6,7,5};
        System.out.println(findAllIndex2(arr, 5, 0));

    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();


        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> answerfrombelowcalls = findAllIndex2(arr, target, index+1);
        list.addAll(answerfrombelowcalls);
        return list;
    }
}
