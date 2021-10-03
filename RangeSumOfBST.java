
 //Definition for a binary tree node.
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
 
  //Implementation of range sum 
class Solution {
    int res=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
       if(root==null)
           return res;
        if(root.val>low&&root.val>high)
            rangeSumBST(root.left,low,high);
        else if(root.val<low&&root.val<high)
            rangeSumBST(root.right,low,high);
        else 
        {   rangeSumBST(root.left,low,high);
            res+=root.val;
            rangeSumBST(root.right,low,high);
        }
        return res;
        
    }
}