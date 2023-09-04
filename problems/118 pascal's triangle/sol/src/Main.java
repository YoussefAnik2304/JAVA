import java.util.List;
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage to generate Pascal's Triangle with numRows = 5
        int numRows = 5;
        List<List<Integer>> triangle = solution.generate(numRows);

        // Print the generated Pascal's Triangle
        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}