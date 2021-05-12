import java.util.*;

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
        populateLL(" numbers ");
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
        populateLL(" numbers ");
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
        populateLL(" numbers ");
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
        populateLL(" numbers ");
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
        populateLL(" numbers ");
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
        populateLL(" numbers for LL without cycle");
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
        populateLL(" numbers");
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

    public void problem12() {
        //find start node of cycle
        System.out.println("problem 12: check whether a linked list is null terminated or ends in a cycle. find start node of cycle");
        populateLL(" numbers");
        HashSet<LinkedList<Integer>.Node> set = new HashSet<>();
        LinkedList<Integer>.Node temp = ll.head;
        System.out.println("creating cycle...");
        temp = ll.head;
        while (temp.next != null) temp = temp.next;
        LinkedList<Integer>.Node temp2 = ll.head;
        temp2 = temp2.next.next.next;
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
        if (cycle) {
            slowPtr = ll.head;
            while (slowPtr != fastPtr) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;
            }
            System.out.println(fastPtr.item);

        } else {
            System.out.println("NO cycle exits");
        }

    }

    public void problem15() {
        //find length of cycle
        System.out.println("problem 15: check whether a linked list is null terminated or ends in a cycle. find length of cycle");
        populateLL("");
        HashSet<LinkedList<Integer>.Node> set = new HashSet<>();
        LinkedList<Integer>.Node temp = ll.head;
        System.out.println("creating cycle...");
        temp = ll.head;
        while (temp.next != null) temp = temp.next;
        LinkedList<Integer>.Node temp2 = ll.head;
        temp2 = temp2.next.next.next;
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
        int length = 1;
        if (cycle) {
            slowPtr = ll.head;
            slowPtr = slowPtr.next;
            while (slowPtr != fastPtr) {
                slowPtr = slowPtr.next;
                length++;
            }
            System.out.println(length);

        } else {
            System.out.println("NO cycle exits");
        }

    }

    public void problem16() {
        //insert a node in sorted linked list
        System.out.println("problem 16: insert a node in sorted linked list");
        populateLL(" numbers in sorted order");
        System.out.println("enter n");
        LinkedList<Integer>.Node newNode;
        newNode = ll.new Node();
        newNode.item = sc.nextInt();
        LinkedList<Integer>.Node temp = ll.head, prevNode = ll.head;
        while (temp != null && temp.item < newNode.item) {
            prevNode = temp;
            temp = temp.next;
        }
        newNode.next = temp;
        prevNode.next = newNode;
        printLL();
    }

    public void problem17() {
        //Reverse a singly Linked List
        System.out.println("problem 17: Reverse a singly Linked List");
        populateLL(" numbers ");
        LinkedList<Integer>.Node curr = ll.head, prev = null;
        while (curr != null) {
            LinkedList<Integer>.Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ll.head = prev;
        printLL();
    }

    public void problem18and19() {
        //Finding the merging point of two LL using brute force
        System.out.println("problem 18: Finding the merging point of two singly Linked Lists using brute force");
        populateLL(" numbers ");
        LinkedList<Integer> ll2 = new LinkedList<>();
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers");
        for (int i = 0; i < k; i++) {
            ll2.insertAtEnd(sc.nextInt());
        }
        System.out.println("creating merge...");
        //comment out below line to remove merge and run again
        ll2.head.next.next = ll.head.next.next.next;
        LinkedList<Integer>.Node temp = ll.head;
        boolean merge = false;
        while (temp != null) {
            LinkedList<Integer>.Node temp2 = ll2.head;
            while (temp2 != null) {
                if (temp == temp2) {
                    merge = true;
                    System.out.println("merge point " + temp.item + " " + temp2.item);
                    break;
                }
                temp2 = temp2.next;

            }
            if (merge) break;
            temp = temp.next;
        }
        if (!merge) System.out.println("No merge point");

    }

    public void problem20() {
        //Finding the merging point of two LL using hash table
        System.out.println("problem 20: Finding the merging point of two singly Linked Lists using hash table");
        populateLL(" numbers ");
        LinkedList<Integer> ll2 = new LinkedList<>();
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers");
        for (int i = 0; i < k; i++) {
            ll2.insertAtEnd(sc.nextInt());
        }
        System.out.println("creating merge...");
        //comment out below line to remove merge and run again
        ll2.head.next.next = ll.head.next.next.next;
        LinkedList<Integer>.Node temp = ll.head;
        boolean merge = false;
        HashSet<LinkedList<Integer>.Node> set = new HashSet<>();
        while (temp != null) {
            set.add(temp);
            temp = temp.next;
        }
        LinkedList<Integer>.Node temp2 = ll2.head;
        while (temp2 != null) {
            if (set.contains(temp2)) {
                merge = true;
                System.out.println("merge point " + temp2.item);
                break;
            }
            temp2 = temp2.next;

        }
        if (!merge) System.out.println("No merge point");

    }

    public void problem21() {
        //Finding the merging point of two LL using stack
        System.out.println("problem 21: Finding the merging point of two singly Linked Lists using stack");
        populateLL(" numbers ");
        LinkedList<Integer> ll2 = new LinkedList<>();
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers");
        for (int i = 0; i < k; i++) {
            ll2.insertAtEnd(sc.nextInt());
        }
        System.out.println("creating merge...");
        //comment out below line to remove merge and run again
        ll2.head.next.next = ll.head.next.next.next;
        LinkedList<Integer>.Node temp = ll.head;
        boolean merge = true;
        Stack<LinkedList<Integer>.Node> stack = new Stack<>();
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        LinkedList<Integer>.Node temp2 = ll2.head;
        Stack<LinkedList<Integer>.Node> stack2 = new Stack<>();
        while (temp2 != null) {
            stack2.push(temp);
            temp2 = temp2.next;
        }
        LinkedList<Integer>.Node temp3 = ll2.head;
        while (stack.peek() == stack2.peek()) {
            merge = true;
            temp3 = stack.pop();
            stack2.pop();
        }

        if (!merge) System.out.println("No merge point");
        else System.out.println(temp3.item);

    }

    public void problem30() {
        //check if linked list length is even or odd
        System.out.println("problem 30: check if linked list length is even or odd");
        populateLL(" numbers ");
        LinkedList<Integer>.Node temp = ll.head;
        while (temp != null && temp.next != null) temp = temp.next.next;
        if (temp == null) System.out.println("even length");
        else System.out.println("odd length");

    }

    public void problem32() {
        //Merge two sorted linked list in sorted order
        System.out.println("problem 33: Merge two sorted linked list in sorted order");
        populateLL(" numbers in sorted order");
        LinkedList<Integer> ll2 = new LinkedList<>();
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers in sorted order");
        for (int i = 0; i < k; i++) {
            ll2.insertAtEnd(sc.nextInt());
        }
        System.out.println("merged List...");
        ll.head = mergeTwoList(ll.head, ll2.head);
        printLL();

    }

    //part of problem 32
    private LinkedList<Integer>.Node mergeTwoList(LinkedList<Integer>.Node head, LinkedList<Integer>.Node head1) {
        if (head == null) return head1;
        if (head1 == null) return head;
        LinkedList<Integer> newList = new LinkedList<>();
        newList.insertAtEnd(0);
        LinkedList<Integer>.Node newNode = newList.head;
        if (head.item < head1.item) {
            newNode = head;
            newNode.next = mergeTwoList(head.next, head1);
        } else {
            newNode = head1;
            newNode.next = mergeTwoList(head1.next, head);
        }
        return newNode;
    }

    public void problem33() {
        //Merge two sorted linked list in sorted order
        System.out.println("problem 33: Merge two sorted linked list in sorted order");
        populateLL(" numbers in sorted order");
        LinkedList<Integer> ll2 = new LinkedList<>();
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers in sorted order");
        for (int i = 0; i < k; i++) {
            ll2.insertAtEnd(sc.nextInt());
        }
        System.out.println("merged List...");
        LinkedList<Integer>.Node temp = ll.head;
        LinkedList<Integer>.Node temp2 = ll2.head;
        LinkedList<Integer> newList = new LinkedList<>();
        newList.insertAtEnd(0);
        LinkedList<Integer>.Node newNode = newList.head;
        while (temp != null && temp2 != null) {
            if (temp.item < temp2.item) {
                newNode.next = temp;
                newNode = newNode.next;
                temp = temp.next;
            } else {
                newNode.next = temp2;
                newNode = newNode.next;
                temp2 = temp2.next;
            }
        }
        if (temp != null) newNode.next = temp;
        if (temp2 != null) newNode.next = temp2;

        ll.head = newList.head.next;
        printLL();


    }

    public void problem38() {
        //Split circular LL in two equal CLL
        System.out.println("problem 38: Split circular LL in two equal CLL");
        System.out.println("enter no of nodes for LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("Creating cycle...");
        LinkedList<Integer>.Node temp = ll.head;
        while (temp.next != null) temp = temp.next;
        temp.next = ll.head;

        LinkedList<Integer>.Node slow = ll.head;
        LinkedList<Integer>.Node fast = ll.head;
        while (fast.next != ll.head && fast.next.next != ll.head) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast.next.next == ll.head) fast = fast.next;
        LinkedList<Integer>.Node head1 = ll.head, head2 = slow.next;

        fast.next = slow.next;
        slow.next = head1;

        LinkedList<Integer>.Node temp2 = head2;
        temp = head1;
        while (head1 != temp.next) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
        System.out.print(temp.item + " ");

        System.out.println();
        while (temp2.next != head2) {
            System.out.print(temp2.item + " ");
            temp2 = temp2.next;
        }
        System.out.print(temp2.item + " ");


    }

    public void problem39() {
        //CHeck linked list is a palindrome
        System.out.println("problem 39: CHeck linked list is a palindrome");
        System.out.println("enter no of nodes for second LL ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers ");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }

        LinkedList<Integer>.Node slow = ll.head;
        LinkedList<Integer>.Node fast = ll.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        LinkedList<Integer>.Node head2 = slow.next, curr = slow.next, prev = null;
        slow.next = null;
        while (curr != null) {
            LinkedList<Integer>.Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        LinkedList<Integer>.Node temp1 = ll.head, temp2 = prev;

        boolean palindrome = true;
        while (temp1 != null && temp2 != null) {
            if (temp1.item != temp2.item) {
                palindrome = false;
                break;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (palindrome) System.out.println("palindrome");
        else System.out.println("not palindrome");

    }

    public void problem40() {
        //exchange adjacent elements in a linked list
        System.out.println("problem 40: exchange adjacent elements in a linked list");
        populateLL("numbers");
        LinkedList<Integer> newList = new LinkedList<>();
        newList.insertAtEnd(0);
        newList.head.next = ll.head;
        LinkedList<Integer>.Node prev = newList.head, curr = ll.head;
        while (curr != null && curr.next != null) {
            LinkedList<Integer>.Node next = curr.next.next;
            curr.next.next = prev.next;
            prev.next = curr.next;
            curr.next = next;
            prev = curr;
            curr = prev.next;
        }
        ll.head = newList.head.next;
        printLL();
    }

    public void problem44() {
        //JosephusCircle
        System.out.println("problem 44: JosephusCircle");
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "numbers:");
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
        System.out.println("Creating cycle...");
        LinkedList<Integer>.Node temp = ll.head;
        while (temp.next != null) temp = temp.next;
        temp.next = ll.head;
        System.out.println("enter M");
        int m = sc.nextInt();
        for (int count = k; count > 1; count--) {
            for (int i = 0; i < m - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        System.out.println(temp.item);


    }

    public void problem49() {
        //fractionalNode
        System.out.println("problem 49: fractionalNode");
        populateLL("numbers");
        System.out.println("enter K");
        int k = sc.nextInt();
        LinkedList<Integer>.Node fractionalNode = null, temp = ll.head;
        int i = 0;
        while (temp.next != null) {
            if (i % k == 0) {
                if (fractionalNode == null) {
                    fractionalNode = ll.head;
                } else {
                    fractionalNode = fractionalNode.next;
                }
            }
            i++;
            temp = temp.next;
        }

        System.out.println(fractionalNode.item);


    }


    //helper methods for LinkedList problems
    public void printLL() {
        LinkedList<Integer>.Node temp;
        temp = ll.head;
        while (temp != null) {
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }

    private void populateLL(String s) {
        System.out.println("enter no of nodes ");
        int k = sc.nextInt();
        System.out.println("enter " + k + s);
        for (int i = 0; i < k; i++) {
            ll.insertAtEnd(sc.nextInt());
        }
    }

}
