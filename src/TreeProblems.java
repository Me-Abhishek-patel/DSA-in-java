import java.util.*;
import java.util.LinkedList;
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
        if (root == null) {//comparing if the value of root isequal to null
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);//adding the element in queue
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();

            max = Math.max(node.data, max);

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return max;//returning the value of max


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
        return root;//returning the value of root

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
        int depth = 0;//initializing the value of depth
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

    //problem 21: find the width of binary tree
    public int widthOfBT(BinaryTreeNode root) {
        if (root == null) return 0;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE;
        while (!q.isEmpty()) {
            int c = q.size();
            max = Math.max(c, max);
            for (int i = 0; i < c; i++) {
                BinaryTreeNode temp = q.poll();
                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);

            }
        }
        return max;
    }

    //problem 25: sum of all element in binary tree
    public int addBT(BinaryTreeNode root) {
        if (root == null) return 0;
        return root.data + addBT(root.left) + addBT(root.right);
    }

    //problem 26: sum of all element in binary tree without recursion
    public int addBTIterative(BinaryTreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            sum += node.data;
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return sum;
    }

    //problem 27: Convert a binary tree to its mirror using recursion
    public BinaryTreeNode mirrorBT(BinaryTreeNode root) {
        if (root != null) {
            mirrorBT(root.left);
            mirrorBT(root.right);
            BinaryTreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        return root;
    }

    //problem 28: Convert a binary tree to its mirror using recursion
    public boolean checkMirrorBT(BinaryTreeNode root1, BinaryTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null)
            return false;
        if (root1.data != root2.data) return false;
        return checkMirrorBT(root1.left, root2.left) && checkMirrorBT(root1.right, root2.right);
    }

    //problem 29:Construct binary tree from inorder and preorder traversals
    int preIndex = 0;

    public BinaryTreeNode constructBT(int[] ino, int[] pre) {
        if (ino.length != pre.length) return null;
        return constructBTPreOrderInOrder(ino, pre, 0, pre.length - 1);
    }

    public BinaryTreeNode constructBTPreOrderInOrder(int[] ino, int[] pre, int is, int ie) {
        if (is > ie) return null;
        BinaryTreeNode root = new BinaryTreeNode(pre[preIndex++]);
        int index = -1;
        for (int i = is; i <= ie; i++) {
            if (ino[i] == root.data) {
                index = i;
                break;
            }
        }
        root.left = constructBTPreOrderInOrder(ino, pre, is, index - 1);
        root.right = constructBTPreOrderInOrder(ino, pre, index + 1, ie);
        return root;
    }

    //problem 30:Construct binary tree from inorder and postorder
    int postIndex = 0;

    public BinaryTreeNode constructBT2(int[] ino, int[] pre) {
        if (ino.length != pre.length) return null;
        postIndex = pre.length - 1;
        return constructBTPostOrderInOrder(ino, pre, 0, pre.length - 1);
    }

    public BinaryTreeNode constructBTPostOrderInOrder(int[] ino, int[] pre, int is, int ie) {
        if (is > ie) return null;
        BinaryTreeNode root = new BinaryTreeNode(pre[postIndex--]);
        int index = -1;
        for (int i = is; i <= ie; i++) {
            if (ino[i] == root.data) {
                index = i;
                break;
            }
        }
        root.left = constructBTPostOrderInOrder(ino, pre, is, index - 1);
        root.right = constructBTPostOrderInOrder(ino, pre, index + 1, ie);
        return root;
    }

    //problem 32: print all ancestors of a node of a binary tree
    public static boolean printAllAncestors(BinaryTreeNode root, BinaryTreeNode node) {
        if (root == null) return false;
        if (root.left == node || root.right == node || printAllAncestors(root.left, node) || printAllAncestors(root.right, node)) {
            System.out.println(root.data);
            return true;
        }
        return false;
    }

    //problem 33: find least common ancestor of two nodes in a Binary Tree
    public BinaryTreeNode lca(BinaryTreeNode root, BinaryTreeNode n1, BinaryTreeNode n2) {
        if (root == null) return null;
        if (root == n1 || root == n2) return root;
        BinaryTreeNode lca1 = lca(root.left, n1, n2);
        BinaryTreeNode lca2 = lca(root.right, n1, n2);
        if (lca1 != null && lca2 != null) return root;
        else return lca1 != null ? lca1 : lca2;
    }

    //problem 34: zig zag tree traversals
    public void spiralTraversal(BinaryTreeNode root) {
        Stack<BinaryTreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                BinaryTreeNode temp = s1.pop();
                System.out.println(temp.data);
                if (temp.left != null) s2.push(temp.left);
                if (temp.right != null) s2.push(temp.right);
            }
            while (!s2.isEmpty()) {
                BinaryTreeNode temp = s2.pop();
                System.out.println(temp.data);
                if (temp.left != null) s1.push(temp.left);
                if (temp.right != null) s1.push(temp.right);
            }
        }
    }

    //problem 35: find vertical sum of binary trees
    public static void verticalSum(BinaryTreeNode root) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        vSum(hash, root, 0);
        System.out.println();
        for (int k : hash.keySet()) {
            System.out.println("key(pos): " + k + " sum: " + hash.get(k));
        }
    }

    private static void vSum(HashMap<Integer, Integer> hash, BinaryTreeNode root, int i) {
        if (root.left != null) vSum(hash, root, i - 1);
        if (root.right != null) vSum(hash, root, i + 1);
        hash.put(i, root.data + hash.getOrDefault(i, 0));

    }

    //problem 36: Differet trees possible with n noes
    public int numberOfBT(int n) {
        int[] count = new int[n + 1];
        count[0] = 1;
        count[1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                count[i] += count[j] * count[i - j - 1];
            }
        }
        return count[n];
    }

    //problem 37: generate all BT with n nodes
    public ArrayList<BinaryTreeNode> generateTrees(int n) {
        if (n == 0) return generateTrees(1, 0);
        return generateTrees(1, n);
    }

    private ArrayList<BinaryTreeNode> generateTrees(int start, int end) {

        ArrayList<BinaryTreeNode> subTrees = new ArrayList<>();
        if (start > end) {
            subTrees.add(null);
            return subTrees;
        }
        //Incomplete
        return subTrees;
    }


}
