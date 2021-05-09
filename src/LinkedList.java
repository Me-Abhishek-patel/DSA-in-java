public class LinkedList<Item> {
    int N;
    Node head = null;

    public void insertAtBeginning(Item item) {
        if (head == null) {
            head = new Node();
            head.item = item;
        } else {
            Node temp = new Node();
            temp.item = item;
            temp.next = head;
            head = temp;
        }
        N++;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public int size() {
        return N;
    }

    public void insertAtEnd(Item item) {
        if (head == null) {
            head = new Node();
            head.item = item;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node();
            temp.next.item = item;
            temp.next.next = null;
        }
        N++;
    }

    public void insertAtPosition(Item item, int pos) {
        if(pos>N){
            System.out.println("LL Overflow");
            return;
        }
        Node temp = head;
        for(int i = 0;i<pos;i++){
            temp = temp.next;
        }
        Node x = new Node();
        x.item = item;
        x.next = temp.next;
        temp.next = x;
    }

    public void deleteFirst(){
        head = head.next;
    }

    public void deleteLast(){
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public class Node {
        Item item;
        Node next;

        Node(Item item){
            this.item = item;
        }
        Node(){

        }

    }

}
