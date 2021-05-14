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

    public void problem14() {
        //implement stack using LL
        TwoStacks stack = new TwoStacks(100);
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
            if (top1 < top2-1) {
                stack[++top1] = data;
            }
        }
        void push2(int data) {
            if (top1 < top2-1) {
                stack[--top2] = data;
            }
        }
        int pop1(){
            if(top1>=0) return stack[top1--];
            else return -1;
        }
        int pop2(){
            if(top2<0) return stack[top2++];
            else return -1;
        }

    }


}
