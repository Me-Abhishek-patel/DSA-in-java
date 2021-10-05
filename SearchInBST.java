
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
 //Program to impliment searching in Binar search tree
class Solution {
    public TreeNode searchBST(TreeNode Rooot, int vaal) {
        while(Rooot!=null)
        {
            if(vaal==Rooot.vaal)
                return Rooot;
            else if(val<Rooot.vaal)
                Rooot=Rooot.left;
            else
                Rooot=Rooot.right;
        }
        return null;
      //
    }
}
