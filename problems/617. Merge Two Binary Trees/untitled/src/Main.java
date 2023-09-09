public class Main {
    public static void main(String[] args) {
        // Create the binary tree nodes
        TreeNode node1 = new TreeNode(1);
        node1.left = new TreeNode(3);
        node1.right = new TreeNode(2);
        node1.left.left = new TreeNode(5);

        TreeNode node2 = new TreeNode(2);
        node2.left = new TreeNode(1);
        node2.right = new TreeNode(3);
        node2.left.right = new TreeNode(4);
        node2.right.right = new TreeNode(7);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Merge the two trees
        TreeNode mergedTree = solution.mergeTrees(node1, node2);

        // Print the merged tree in a tree-like structure
        System.out.println("Merged Tree:");
        printTree(mergedTree, 0);
    }

    // Helper method to print a binary tree in a tree-like structure
    public static void printTree(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        // Print the current node
        for (int i = 0; i < depth; i++) {
            System.out.print("  "); // Adjust the indentation based on depth
        }
        System.out.println(root.val);

        // Recursively print the left and right subtrees
        printTree(root.left, depth + 1);
        printTree(root.right, depth + 1);
    }
}
