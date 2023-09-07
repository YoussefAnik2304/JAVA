import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Create a Solution object and call the inorderTraversal method
        Solution solution = new Solution();
        List<Integer> result = solution.inorderTraversal(root);

        // Print the result
        System.out.println("Inorder traversal result: " + result);
    }
}