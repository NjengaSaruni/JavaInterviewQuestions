/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
package Utils;

public class TreeNode {
     public int val;
     public TreeNode left;
     public TreeNode right;
     public TreeNode(int x) { val = x; }

     public void insert(int val){
          if(val > this.val){
               if(this.right != null){
                    this.right.insert(val);
               }else{
                    this.right = new TreeNode(val);
               }
          }else{
               if(this.left != null){
                    this.left.insert(val);
               }else{
                    this.left = new TreeNode(val);
               }
          }
     }
}
