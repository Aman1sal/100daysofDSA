public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size +=1;
    }

    public void insertlast(int val){
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void duplicates(){
        Node node = head;
        while(node.next != null){
            if( node.value == node.next.value){
                node.next = node.next.next;
                size--;
            } else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

//    // // merge two linkedlist
    public static  LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while(f!=null && s!=null){
            if(f.value < s.value){
                ans.insertlast(f.value);
                f = f.next;
            } else{
                ans.insertlast(s.value);
                s = s.next;
            }
        }
        while(f!=null){
            ans.insertlast(f.value);
            f=f.next;
        }

        while(s!=null){
            ans.insertlast(s.value);
            s=s.next;
        }
        return ans;
    }

    // // // happy number
    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

//    // // // middle of linekdlist: slow aur fast chalao, jese hi fast wala last m pahuche then return slow

    // // // Reverse Linkedlist
    private void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    // // // reversing using iteration
    public void reverse(){
        if(size<2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next != null){
                next = next.next;
            }
        }
        head = prev;
    }

    private int findSquare(int number){
        int ans =0;
        while(number > 0){
            int rem = number % 10;
            ans += rem * rem;
            number/=10;
        }
        return ans;
    }

    public static void main(String[] args) {

//        LL list = new LL();
//        list.insertlast(1);
//        list.insertlast(1);
//        list.insertlast(2);
//        list.insertlast(3);
//        list.insertlast(3);
//        list.insertlast(3);
//        list.display();
//        list.duplicates();
//        list.display();

        LL first = new LL();
        LL second = new LL();

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        LL ans = LL.merge(first,second);
        ans.display();

    }



    private class Node{

        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(int value) {
            this.value = value;
        }
    }
}
