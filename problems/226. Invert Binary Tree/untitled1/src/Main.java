public class Main {
    public static void main(String[] args) {
        // Create the binary tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Invert the binary tree
        TreeNode invertedTree = solution.invertTree(root);

        // Print the inverted tree
        System.out.println("Inverted Tree:");
        printTree(invertedTree);
    }

    // Helper method to print a binary tree (in-order traversal)
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }
}
