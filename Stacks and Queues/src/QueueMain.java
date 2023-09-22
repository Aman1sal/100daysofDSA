public class QueueMain {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        queue.insert(3);
//        queue.insert(6);
//        queue.insert(9);
//        queue.insert(45);
//        queue.insert(76);
//
//        queue.display();
//
//        System.out.println(queue.remove());
//
//        queue.display();

        CircularQueue queue = new CircularQueue(5);
        queue.insert(3);
        queue.insert(6);
        queue.insert(9);
        queue.insert(45);
        queue.insert(76);

        queue.display();

        System.out.println(queue.remove());

        queue.display();
    }
}
