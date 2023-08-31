import java.util.Arrays;

public class Inplace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        mergeInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeInplace(int[] arr, int s, int e){
        if(e-s == 1){
            return;
        }
        int mid = (s+e)/2;
        mergeInplace(arr,s,mid);
        mergeInplace(arr,mid,e);

      merge(arr,s,mid, e);
    }
    private static void merge(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i<m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }
}
