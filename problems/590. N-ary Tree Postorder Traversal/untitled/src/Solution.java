import java.util.List;
import java.util.ArrayList;
class Solution {
    List<Integer> ans = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return ans;
        if (root.children != null) {
            for (Node n : root.children) {
                postorder(n);
            }
        }
        ans.add(root.val);
        return ans;
    }
}