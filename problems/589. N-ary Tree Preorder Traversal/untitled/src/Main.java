import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(1);
        List<Node> children = new ArrayList<>();
        children.add(new Node(3, Arrays.asList(new Node(5), new Node(6))));
        children.add(new Node(2));
        children.add(new Node(4));
        root.children = children;

        // Create a Solution object and call the preorder method
        Solution solution = new Solution();
        List<Integer> result = solution.preorder(root);

        // Print the result
        System.out.println("Preorder traversal result: " + result);
    }
}