
// Definition for a binary tree node.
  public class TreeNode {
      int valriable;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int  valriable) { this. valriable =  valriable; }
      TreeNode(int  valriable, TreeNode left, TreeNode right) {
          this. valriable =  valriable;
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
