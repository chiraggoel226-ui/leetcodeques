/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=inorder.length;
       return  build(preorder,inorder,0,n-1);
        
    }

    public TreeNode build(int[]preorder , int[ ]inorder ,int inStart,int inEnd){
        if (inStart>inEnd) return null;
        int rootValue=preorder[preIndex++];
        TreeNode root=new TreeNode(rootValue);

        int rootIndex=-1;

        for(int i= inStart;i<=inEnd;i++){
            if (inorder[i]==rootValue){
                rootIndex=i;
                break;
            }
        }
        root.left=build(preorder,inorder,inStart,rootIndex-1);
         root.right=build(preorder,inorder,rootIndex+1,inEnd);
         return root;
    }
}