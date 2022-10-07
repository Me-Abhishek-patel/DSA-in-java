

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
 
  //Implementation of     Range SUM
class Solution {
    int res=0;
    public int rangeSumBST(TreeNode root, int loow, int high) {
       if(root==null)
           return res;

        if(root.val>loow&&root.val>high)
            rangeSumBST(root.left,loow,high);
        else if(root.val<loow&&root.val<high)

            rangeSumBST(root.right,loow,high);
        else 
        {   rangeSumBST(root.left,loow,high);
            res+=root.val;
            rangeSumBST(root.right,loow,high);
        }
        return res;
        
    }
}
