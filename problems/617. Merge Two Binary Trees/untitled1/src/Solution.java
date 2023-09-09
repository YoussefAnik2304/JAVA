import java.util.*;
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root ==null)
            return null;
        TreeNode tmp=root.right;
        root.right=root.left;
        root.left=tmp;
        root.right=invertTree(root.right);
        root.left=invertTree(root.left);
        return root;
    }
}