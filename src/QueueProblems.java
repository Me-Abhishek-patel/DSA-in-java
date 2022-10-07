// import module
import java.util.*;
import java.util.LinkedList;

public class QueueProblems {
    Scanner sc = new Scanner(System.in);
    Deque<Integer> queue = new LinkedList<>(); //creating linked list


    public void problem1() {
        //reversing a Queue
        System.out.println("problem 1:reversing a Queue");
        System.out.println("Enter n: ");
        int n = sc.nextInt(); // taking input n
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            queue.addLast(sc.nextInt()); //taking elements input
        }
        Stack<Integer> stack = new Stack<>(); //creating stack 
        while (!queue.isEmpty()) stack.push(queue.pollFirst());
        while (!stack.isEmpty()) queue.addLast(stack.pop());
        for (int i : queue) {
            System.out.print(i + " ");
        }
    }

    public void problem4() {
        //Maximum sum in sliding window
        System.out.println("problem 2: Maximum sum in sliding window");
        System.out.println("Enter Size of arry: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " array elements: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter window Size : ");
        int w = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < w; i++) {
            sum += array[i];
            queue.addLast(array[i]);
        }
        int max = sum;
        for (int i = w; i < n; i++) {
            sum += array[i];
            queue.addLast(array[i]);
            sum -= queue.removeFirst();
            max = Math.max(sum, max);
        }

        System.out.println(max);
    }

    public void problem8() {
        //Check each successive pair of number in stack are consecutive
        System.out.println("problem 8: Check each successive pair of number in stack are consecutive");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no of elements: ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "elements");
        for (int i = 0; i < k; i++) {
            stack.push(sc.nextInt());
        }
        while (!stack.isEmpty())
            queue.addLast(stack.pop());
        while (!queue.isEmpty())
            stack.push(queue.pollFirst()); //inserting the element
        boolean isConsecutive = true;
        while (!stack.isEmpty()) {
            int n = stack.pop(); //removing the element
            queue.addLast(n);
            if (!stack.isEmpty()) {
                int m = stack.pop();
                queue.addLast(m);
                if (Math.abs(m - n) != 1)
                    isConsecutive = false;

            }
        }
        while (!queue.isEmpty()) stack.push(queue.pollFirst());
        System.out.println(isConsecutive);
    }

    public void problem9() {
        //rearrange elements by interleaving the first half of the list
        System.out.println("problem 9: rearrange elements by interleaving the first half of the list");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no of elements: ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "elements");
        for (int i = 0; i < k; i++) {
            queue.addLast(sc.nextInt());
        }
        int n = queue.size();
        for (int i = 1; i <= n / 2; i++) {
            stack.push(queue.pollLast());

        }


        while (!queue.isEmpty())
            System.out.print(queue.pollFirst() + " " + stack.pop() + " ");
    }

    public void problem10() {
        //reverse Only first k elements of a queue
        System.out.println("problem 10: reverse Only first k elements of a queue");
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        System.out.println("enter " + n + "elements");
        for (int i = 0; i < n; i++) {
            queue.addLast(sc.nextInt());
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            stack.push(queue.pollFirst());
        }
        while (!stack.isEmpty()) queue.addLast(stack.pop());
        for (int i = 0; i < queue.size() - k; i++) {
            queue.addLast(queue.pollFirst());
        }


        while (!queue.isEmpty())
            System.out.print(queue.pollFirst() + " ");
    }
}
