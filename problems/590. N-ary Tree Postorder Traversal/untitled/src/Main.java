import java.util.*;


public class Main {
    public static void main(String[] args) {
        // Create a sample tree
        Node root = new Node(1);
        List<Node> children = new ArrayList<>();
        children.add(new Node(3));
        children.add(new Node(2));
        children.add(new Node(4));
        root.children = children;
        children.get(0).children = Arrays.asList(new Node(5), new Node(6));

        // Create a Solution object and call the postorder method
        Solution solution = new Solution();
        List<Integer> result = solution.postorder(root);

        // Print the result
        System.out.println("Postorder traversal result: " + result);
    }
}
