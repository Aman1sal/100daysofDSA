public class StackMain {

    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(69);
        stack.push(85);
        stack.push(15);
        stack.push(17);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }


}
