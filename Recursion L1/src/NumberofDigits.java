public class NumberofDigits {
    public static void main(String[] args) {
        System.out.println(count(2346359,0));
    }
    public static int count(int n, int c){
        if(n/10<=1){
            return c+1;
        }
        return count(n/10, c+1);
    }
}
