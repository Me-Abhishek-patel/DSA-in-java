import java.util.Scanner;
import java.util.Stack;

public class StackProblems {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();


    public void problem1() {
        //Check balancing of parentheses
        System.out.println("problem 1: Check balancing of parentheses");
        System.out.println("Enter String of parentheses: ");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) balanced = false;
                else if (!((ch == ')' && stack.peek() == '(')
                        || (ch == ']' && stack.peek() == '[')
                        || (ch == '}' && stack.peek() == '{')))
                    balanced = false;
                else stack.pop();
            }
        }
        if (balanced && stack.isEmpty()) System.out.println("Balanced");
        else System.out.println("Unbalanced");
    }

    public void problem5() {
        //Design a stack such that get min is O(1)
        System.out.println("problem 5: Design a stack such that get min is O(1)");
        Stack<Integer> elementStack = new Stack<>();
        Stack<Integer> minStack = new Stack<>();
    }

    public void problem8and9and10() {
        //Check given String is palindrome with 'X' as middle char
        System.out.println("problem 9: Check given String is palindrome with 'X' as middle char");
        System.out.println("Enter String with 'X' as middle char: ");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        boolean palindrom = true;
        while (s.charAt(i) != 'X') {
            stack.push(s.charAt(i++));
        }
        i++;
        while (i < s.length()) {
            if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                palindrom = false;
                break;
            }
            i++;

        }
        if (palindrom) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public void problem11() {
        //Reverse contents of stack using push and pop only.
        System.out.println("problem 11: Reverse contents of stack using push and pop only.");
        populateStack();
        int data = stack.pop();
        reverse(stack, data);
        printStack();

    }

    //part of problem11
    private void reverse(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        reverse(stack, data);
        stack.push(temp);
    }

    public void problem14() {
        //implement stack using LL
        TwoStacks stack = new TwoStacks(100);
    }

    public void problem22and23() {
        //Stock span problem
        System.out.println("problem 22: //Stock span problem.");
        System.out.println("enter the no. of items in array");
        int n = sc.nextInt();
        System.out.println("enter " + n + " items");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        stack.push(0);
        System.out.print("1 ");
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                stack.pop();
            }
            int span = ((stack.isEmpty()) ? i + 1 : i - stack.peek());
            System.out.print(span + " ");
            stack.push(i);
        }

    }

    public void problem24and25() {
        //Largest area under histogram
        System.out.println("problem 24 & 25: Largest area under histogram.");
        System.out.println("enter the no. of items in array");
        int n = sc.nextInt();
        System.out.println("enter heights of " + n + " items");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                int temp = stack.pop();
                int curr = arr[temp] * ((stack.isEmpty()) ? i : (i - stack.peek() - 1));
                res = Math.max(res, curr);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int tmp = stack.pop();
            int curr = arr[tmp] * ((stack.isEmpty()) ? n : n - stack.peek() - 1);
            res = Math.max(res, curr);
        }
        System.out.println(res);
    }

    public void problem28() {
        //Remove All Adjacent Duplicates
        System.out.println("problem 28: Remove All Adjacent Duplicates In String.");
        System.out.println("enter the String");
        String s = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == c) {
                stack.pop();
            } else stack.push(c);
        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        System.out.println(sb.reverse().toString());

    }

    //helper methods for LinkedList problems
    private void populateStack() {
        System.out.println("Enter no of elements: ");
        int k = sc.nextInt();
        System.out.println("enter " + k + "elements");
        for (int i = 0; i < k; i++) {
            stack.push(sc.nextInt());
        }
    }

    private void printStack() {
        while (!stack.isEmpty())
            System.out.print(stack.pop() + " ");
    }

    //part of problem 14
    class TwoStacks {
        int[] stack;
        int size, top1, top2;

        public TwoStacks(int size) {
            this.size = size;
            stack = new int[size];
            top1 = -1;
            top2 = size;
        }

        void push1(int data) {
            if (top1 < top2 - 1) {
                stack[++top1] = data;
            }
        }

        void push2(int data) {
            if (top1 < top2 - 1) {
                stack[--top2] = data;
            }
        }

        int pop1() {
            if (top1 >= 0) return stack[top1--];
            else return -1;
        }

        int pop2() {
            if (top2 < size) return stack[top2++];
            else return -1;
        }

    }


}
