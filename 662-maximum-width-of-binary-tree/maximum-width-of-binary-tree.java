class Solution {

    class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        long max = 0;

        while (!q.isEmpty()) {

            int n = q.size();

            long first = q.peek().index;
            long last = first;

            for (int i = 0; i < n; i++) {

                Pair p = q.poll();

                TreeNode node = p.node;
                long index = p.index;

                last = index;

                if (node.left != null) {
                    q.add(new Pair(node.left, 2 * index + 1));
                }

                if (node.right != null) {
                    q.add(new Pair(node.right, 2 * index + 2));
                }
            }

            max = Math.max(max, last - first + 1);
        }

        return (int) max;
    }
}