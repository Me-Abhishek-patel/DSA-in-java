import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class TreeProblems {

    //problem 1: find max element in a binary tree
    public int maxInBinaryTree(BinaryTreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(maxInBinaryTree(root.left), Math.max(root.data, maxInBinaryTree(root.right)));
        }
    }

    //problem 2: find max element in a binary tree without recursion
    public int maxInBinaryTreeLevelOrder(BinaryTreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();

            max = Math.max(node.data, max);

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return max;


    }

    //problem 3: Search for an element in a binary tree
    public boolean findNodeInBT(BinaryTreeNode root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        else return findNodeInBT(root.left, key) || findNodeInBT(root.right, key);
    }

    //problem 4: Search for an element in a binary tree without recursion
    public boolean findNodeInBTLevelOrder(BinaryTreeNode root, int key) {
        if (root == null) {
            return false;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if (node.data == key) return true;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return false;
    }

    //problem 5:Insert an element in a binary tree
    public BinaryTreeNode InsertInBTLevelOrder(BinaryTreeNode root, int key) {
        if (root == null) {
            return new BinaryTreeNode(key);
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            if (node.left != null) queue.add(node.left);
            else {
                node.left = new BinaryTreeNode(key);
                return root;
            }
            if (node.right != null) queue.add(node.right);
            else {
                node.right = new BinaryTreeNode(key);
                return root;
            }
        }
        return root;

    }

    //problem 5:Insert an element in a binary tree recursively
    public void InsertInBTRecursively(BinaryTreeNode root, int key) {
        if (root.left == null) {
            root.left = new BinaryTreeNode(key);
        } else {
            InsertInBTRecursively(root.left, key);
        }

    }

    //problem 6: find size of binary tree
    public int findSizeOfBT(BinaryTreeNode root) {
        if (root == null) return 0;
        return 1 + findSizeOfBT(root.left) + findSizeOfBT(root.left);
    }

    //problem 7: find size of binary tree without rec
    public int findSizeOfBTIterative(BinaryTreeNode root) {
        int count = 0;
        if (root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode node = q.poll();
            count++;
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
        return count;
    }

    //problem 8:delete binary tree
    public void deleteBT(BinaryTreeNode root) {
        root = null;
    }

    //problem 9: Print level order data in reverse order
    public void printReverseBTLevelOrder(BinaryTreeNode root, int key) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<>();
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            stack.push(node);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop().data);

    }

    //problem 10: find height of a binary tree
    public int heightOfBinaryTree(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxInBinaryTree(root.left), maxInBinaryTree(root.right)) + 1;
        }
    }


}
