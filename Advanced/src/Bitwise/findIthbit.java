package Bitwise;

public class findIthbit {
    public static void main(String[] args) {
        int number = 14;
        int ibit = 3;

        System.out.println(Integer.toBinaryString(number));
        int ans = findbit(number,ibit);
        System.out.println(ans);


    }
    public static int findbit(int num, int bit){

        if(((num>>bit)&1) == 1){
                return 1;
        }
        else return 0;
    }
}
