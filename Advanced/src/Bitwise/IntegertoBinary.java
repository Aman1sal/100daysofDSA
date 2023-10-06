package Bitwise;

public class IntegertoBinary {
    public static void main(String[] args) {
        int num = 18;
        StringBuffer binary = new StringBuffer("");
        while( num >=1){
            if(num==1){
                binary.append(num);
                break;
            }
            binary.append(num%2);
            num = num/2;
        }
        binary.reverse();
        System.out.println(binary);
        }


    }
