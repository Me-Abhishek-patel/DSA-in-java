public class BinarySearchTreeOperations {

    //Find elements in BST recursively
    public BinarySearchTreeNode findRec(BinarySearchTreeNode root, int data) {
        if (root == null) return null;
        if (data > root.data)
            return findRec(root.right, data);
        else if (root.data > data)
            return findRec(root.left, data);
        return root;
    }

    //Find elements in BST Iteratively
    public BinarySearchTreeNode findItr(BinarySearchTreeNode root, int data) {
        if (root == null) return null;
        while (root != null) {
            if (root.data == data) return root;
            else if (data < root.data) root = root.left;
            else root = root.right;
        }
        return null;
    }

    //Find minimum element in BST Recursively
    public BinarySearchTreeNode findMinRec(BinarySearchTreeNode root) {
        if (root == null) return null;
        if (root.left == null) return root;
        else return findMinRec(root.left);
    }

    //Find minimum element in BST Iteratively
    public BinarySearchTreeNode findMinItr(BinarySearchTreeNode root) {
        if (root == null) return null;
        while (root.left != null) root = root.left;
        return root;
    }

    //Find the maximum element in BST recursively
    public BinarySearchTreeNode findMaxRec(BinarySearchTreeNode root) {
        if (root == null) return null;
        if (root.right == null) return root;
        else return findMaxRec(root.left);
    }

    //Find minimum element in BST Iteratively
    public BinarySearchTreeNode findMaxItr(BinarySearchTreeNode root) {
        if (root == null) return null;
        while (root.right != null) root = root.right;
        return root;
    }

    //Insert element in BST recursively
    public BinarySearchTreeNode insertRec(BinarySearchTreeNode root, int data) {
        if (root == null) return new BinarySearchTreeNode(data);
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else root.right = insertRec(root.right, data);
        return root;
    }

    //Insert element in BST iteratively
    public BinarySearchTreeNode insertItr(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode parent = null, newNode = new BinarySearchTreeNode(data), curr = root;
        while (curr != null) {
            parent = curr;
            if (data < curr.data)
                curr = curr.left;
            else if (data > curr.data)
                curr = curr.right;
            else return curr;
        }
        if (parent == null) return newNode;
        if (parent.data < data)
            parent.right = newNode;
        else parent.left = newNode;
        return root;
    }

    //Delete node in BST
    public BinarySearchTreeNode deleteNode(BinarySearchTreeNode root, int data) {
        if (root == null) return null;
        if (root.data > data)
            root.left = deleteNode(root.left, data);
        else if (root.data < data)
            root.right = deleteNode(root.right, data);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            else {
                BinarySearchTreeNode succ = getDeleteSucc(root);
                root.data = succ.data;
                root.right = deleteNode(root.right, succ.data);
            }
        }
        return root;
    }

    private BinarySearchTreeNode getDeleteSucc(BinarySearchTreeNode root) {
        BinarySearchTreeNode curr = root.right;
        while (curr.left != null) curr = curr.left;
        return curr;
    }

    //Find Floor in BST
    public BinarySearchTreeNode floorBST(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode res = null;
        while (root != null) {
            if (root.data == data) return root;
            else if (root.data > data)
                root = root.left;
            else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }

    //Find Ceil in BST
    public BinarySearchTreeNode ceilBST(BinarySearchTreeNode root, int data) {
        BinarySearchTreeNode res = null;
        while (root != null) {
            if (root.data == data) return root;
            else if (root.data < data)
                root = root.right;
            else {
                res = root;
                root = root.left;
            }
        }
        return res;
    }

}
