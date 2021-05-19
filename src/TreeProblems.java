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

    //problem 11: find height of a binary tree using stack
    public int heightOfBinaryStack(BinaryTreeNode root) {
        if (root == null) return 0;
        Stack<BinaryTreeNode> s = new Stack<>();
        s.push(root);
        int depth = 0;
        BinaryTreeNode prev = null;
        while (!s.isEmpty()) {
            BinaryTreeNode curr = s.peek();
            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null) s.push(curr.left);
                else if (curr.right != null) s.push(curr.right);
            } else if (curr.left == prev) {
                if (curr.right != null) s.push(curr.right);
            } else s.pop();
            prev = curr;
            depth = Math.max(s.size(), depth);
        }
        return depth;
    }

    //problem 12 find height of a binary tree using Iteration
    public int heightOfBinaryIteration(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> s = new LinkedList<>();
        s.add(root);
        s.add(null);
        int depth = 1;
        while (!s.isEmpty()) {
            BinaryTreeNode curr = s.poll();
            if (curr == null) {
                depth++;
                s.add(null);
            } else {
                if (curr.left == null && curr.right == null) return depth;
                if (curr.left != null) s.add(curr.left);
                if (curr.right != null) s.add(curr.right);
            }
        }
        return depth;
    }

    //problem 13 find the minimum
    public int minDepth(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> s = new LinkedList<>();
        s.add(root);
        s.add(null);
        int depth = 1;
        while (!s.isEmpty()) {
            BinaryTreeNode curr = s.poll();
            if (curr == null) {
                depth++;
                s.add(null);
            } else {
                if (curr.left == null && curr.right == null) return depth;
                if (curr.left != null) s.add(curr.left);
                if (curr.right != null) s.add(curr.right);
            }
        }
        return depth;
    }

    //problem 14: find deepest node of binary tree
    public BinaryTreeNode deepestNodeInBinaryTreeLevelOrder(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        BinaryTreeNode node = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            node = queue.poll();
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return node;


    }

    //problem 16: find the number of leaf nodes in binary tree without recursion
    public int countLeavesInBT(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        BinaryTreeNode prev = null;
        while (!q.isEmpty()) {
            BinaryTreeNode curr = q.peek();
            if (curr.left == null && curr.right == null)
                count++;
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

        }
        return count;
    }

    //problem 17: find the number of full nodes in binary tree
    public int countFullNodesInBT(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        BinaryTreeNode prev = null;
        while (!q.isEmpty()) {
            BinaryTreeNode curr = q.peek();
            if (curr.left != null && curr.right != null)
                count++;
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

        }
        return count;
    }

    //problem 18: find the number of half nodes in binary tree without recursion
    public int countHalfNodesInBT(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        int count = 0;
        BinaryTreeNode prev = null;
        while (!q.isEmpty()) {
            BinaryTreeNode curr = q.peek();
            if (curr.left == null && curr.right != null || curr.left != null && curr.right == null)
                count++;
            if (curr.left != null)
                q.add(curr.left);
            if (curr.right != null)
                q.add(curr.right);

        }
        return count;
    }

    //problem 19: given two binary trees check if they are structurally identical
    public boolean checkStructIdentical(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        return checkStructIdentical(root1.left, root2.left) && checkStructIdentical(root1.right, root2.right);
    }

    //problem 20: find the diameter of binary tree
    int diameter = 0;

    public int widthOfBinaryTree(BinaryTreeNode root) {

        if (root == null) return 0;
        int left = widthOfBinaryTree(root.left), right = widthOfBinaryTree(root.right);
        if (left + right > diameter)
            diameter = left + right;
        return Math.max(left, right) + 1;

    }


}
