//package Generics;
//
//import java.util.Arrays;
//
//public class CustomGenricArraylist<T> {
//
//    private T[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size = 0;
//
//    public CustomGenricArraylist() {
//        this.data = new T[DEFAULT_SIZE];
//    }
//
//    public void add(int num){
//        if (isFull()) {
//            resize();
//        }
//        data[size++] = num;
//    }
//
//    private void resize() {
//        int[] temp = new int[data.length*2];
//
//        for(int i=0; i<data.length; i++){
//            temp[i] = data[i];
//        }
//        data = temp;
//    }
//
//    private boolean isFull() {
//        return size==data.length;
//    }
//
//    public int remove(){
//        int removed = data[--size];
//        return removed;
//    }
//
//    public int get(int index){
//        return data[index];
//    }
//
//    public int size(){
//        return size;
//    }
//
//    public void set(int index, int value){
//        data[index] = value;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomArraylist{" +
//                "data=" + Arrays.toString(data) +
//                ", size=" + size +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        CustomGenricArraylist list = new CustomGenricArraylist();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//
//        System.out.println(list);
//    }
//}
