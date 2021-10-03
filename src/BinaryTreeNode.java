public class BinaryTreeNode {
    public int data;
    BinaryTreeNode left, right;

    public BinaryTreeNode(int data) {
        this.data = data;
    }

    public int getData() {//getter function
        return data;
    }

    public void setData(int data) {//setter function
        this.data = data;
    }

    public BinaryTreeNode getLeft() {//getting left
        return left;
    }

    public void setLeft(BinaryTreeNode left) {//setting left
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
}
