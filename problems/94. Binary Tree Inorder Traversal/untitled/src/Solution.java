import java.util.*;
class Solution {
    private List<Integer> result= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traverse(root);
        return result;

    }
    private void traverse(TreeNode head ){
        if(head==null)return;
        traverse(head.left);
        result.add(head.val);
        traverse(head.right);
    }

}