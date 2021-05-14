/**
 * Design a stack which supports the following operations.
 * Implement the CustomStack class:
 * <p>
 * CustomStack(int maxSize) Initializes the object with maxSize which is the maximum number of elements in the stack or do nothing if the stack reached the maxSize.
 * void push(int x) Adds x to the top of the stack if the stack hasn't reached the maxSize.
 * int pop() Pops and returns the top of stack or -1 if the stack is empty.
 * void inc(int k, int val) Increments the bottom k elements of the stack by val. If there are less than k elements in the stack, just increment all the elements in the stack.
 */
class CustomStack {
    int[] stack;
    int size;
    int top;

    public CustomStack(int maxSize) {
        stack = new int[maxSize];
        size = maxSize;
        top = -1;
    }

    public void push(int x) {
        if (top < size - 1) stack[++top] = x;
    }

    public int pop() {
        if (top >= 0) return stack[top--];
        else return -1;
    }

    public void increment(int k, int val) {
        for (int i = 0; i < k && i <= top; i++) {
            stack[i] = stack[i] + val;
        }
    }
}
