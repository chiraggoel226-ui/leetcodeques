import java.util.*;

class Solution {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        boolean nullFound = false;

        while (!q.isEmpty()) {
            TreeNode node = q.poll();

            if (node == null) {
                nullFound = true;
            } else {
                if (nullFound) {
                    return false;
                }

                q.offer(node.left);
                q.offer(node.right);
            }
        }

        return true;
    }
}