import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;

public class LinkedListProblems {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> ll = new LinkedList<>();


    public void problem1() {
        //implement stack using LL
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>();
    }

    public void problem2() {
        //find nth node from end of the linked list
        System.out.println("problem 2: find nth node from end of the linked list");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");

        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        int n = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head;
        while (temp != null) {
            LinkedList<Integer>.Node tempx = temp;
            int count = -1;
            while (tempx != null) {
                tempx = tempx.next;
                count++;
            }
            if (count == n - 1) {
                System.out.println(temp.item);
                break;
            }
            temp = temp.next;
        }
    }

    public void problem3() {
        //improve the complexity of problem 2
        System.out.println("problem 3: improve the complexity of problem 2");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        int n = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head;
        int m = 1;
        Hashtable<Integer, LinkedList<Integer>.Node> hashtable = new Hashtable<>();
        while (temp != null) {
            m++;
            hashtable.put(m, temp);
            temp = temp.next;

        }
        System.out.println(hashtable.get(m - n + 1).item);
    }

    public void problem4() {
        //improve the complexity of problem 2 without hashtable
        System.out.println("problem 4: improve the complexity of problem 2 without hashtable");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        int n = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head;
        int m = 0;
        while (temp != null) {
            m++;
            temp = temp.next;

        }
        temp = ll.head;
        for (int i = 0; i < m - n; i++) {
            temp = temp.next;
            int x = temp.item;
        }
        System.out.println(temp.item);
    }

    public void problem5() {
        //solve problem 2 in one scan
        System.out.println("problem 5: solve problem 2 in one scan");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        int n = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head, node = ll.head;

        for (int i = 0; temp != null; i++) {
            temp = temp.next;
            if (i > n) {
                node = node.next;
            }
        }
        System.out.println(node.item);
    }

    public void problem6() {
        //solve problem 5 with recursion
        System.out.println("problem 6: solve problem 5 with recursion");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        int n = sc.nextInt();

        System.out.println(nth(ll.head, n).item);
    }

    //part of problem 6
    int count = 0;

    public LinkedList<Integer>.Node nth(LinkedList<Integer>.Node head, int n) {
        LinkedList<Integer>.Node node = null;
        if (head != null) {
            node = nth(head.next, n);
            count++;
            if (n == count) {
                // System.out.println(head.item);
                return head;
            }
        }
        return node;
    }

    public void problem7and8and9() {
        //check whether a linked list is null terminated or ends in a cycle
        System.out.println("problem 7: check whether a linked list is null terminated or ends in a cycle");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers for LL without cycle");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        HashSet<LinkedList<Integer>.Node> set = new HashSet<>();
        LinkedList<Integer>.Node temp = ll.head;
        boolean cycle = false;
        while (temp != null) {
            if (set.contains(temp)) {
                System.out.println("cycle exist");
                cycle = true;
                break;
            } else {
                set.add(temp);
                temp = temp.next;

            }
        }
        if (!cycle) System.out.println("NO cycle found");

        System.out.println("creating cycle...");
        temp = ll.head;
        while (temp.next != null) temp = temp.next;
        LinkedList<Integer>.Node temp2 = ll.head;
        temp2 = temp2.next.next;
        temp.next = temp2;

        System.out.println("checking for cycle again...");
        while (temp != null) {
            if (set.contains(temp)) {
                System.out.println("cycle exist");
                cycle = true;
                break;
            } else {
                set.add(temp);
                temp = temp.next;

            }
        }
        if (!cycle) System.out.println("NO cycle found");

    }

    public void problem10() {
        //check whether a linked list is null terminated or ends in a cycle (problem6) in O(n)
        System.out.println("problem 10: check whether a linked list is null terminated or ends in a cycle (problem6) in O(n)");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        HashSet<LinkedList<Integer>.Node> set = new HashSet<>();
        LinkedList<Integer>.Node temp = ll.head;
        System.out.println("creating cycle...");
        temp = ll.head;
        while (temp.next != null) temp = temp.next;
        LinkedList<Integer>.Node temp2 = ll.head;
        temp2 = temp2.next.next;
        //to remove cycle comment out line below this
        temp.next = temp2;

        boolean cycle = false;
        System.out.println("checking for cycle ...");
        LinkedList<Integer>.Node fastPtr = ll.head, slowPtr = ll.head;

        while (slowPtr != null && fastPtr != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) {
                System.out.println("cycle exist");
                cycle = true;
                break;
            }
        }
        if (!cycle) System.out.println("NO cycle found");

    }


    public void problem16() {
        //insert a node in sorted linked list
        System.out.println("problem 16: insert a node in sorted linked list");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + " numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("enter n");
        LinkedList<Integer>.Node newNode;
        newNode = ll.new Node();
        newNode.item = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head;
        while (temp != null && temp.item < newNode.item) {
            newNode.next = temp.next;
            temp.next = newNode;
        }
        temp = ll.head;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }

}
