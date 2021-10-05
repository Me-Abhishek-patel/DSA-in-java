
// Definition for a binary tree node.
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 //Program to perform searching in BST
class Solution {
    public TreeNode searchBST(TreeNode Rooot, int val) {
        while(Rooot!=null)
        {
            if(val==Rooot.val)
                return Rooot;
            else if(val<Rooot.val)
                Rooot=Rooot.left;
            else
                Rooot=Rooot.right;
        }
        return null;
      //
    }
}
