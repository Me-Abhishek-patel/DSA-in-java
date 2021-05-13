import java.util.Scanner;
import java.util.Stack;

public class StackProblems {
    Scanner sc = new Scanner(System.in);


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
        boolean palindrom =  true;
        while (s.charAt(i)!='X'){
            stack.push(s.charAt(i++));
        }
        i++;
        while (i<s.length()){
            if(stack.isEmpty() ||stack.pop()!=s.charAt(i)){
                palindrom = false;
                break;
            }
            i++;

        }
        if (palindrom) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }


}
