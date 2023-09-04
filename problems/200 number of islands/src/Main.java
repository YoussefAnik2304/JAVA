// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package Solution.java;
        public class Main {
            public static void main(String[] args) {
                Solution solution = new Solution();

                // Example usage with a sample grid
                char[][] grid = {
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'1', '0', '0', '1', '1'}
                };

                int numIslands = solution.numIslands(grid);
                System.out.println("Number of islands: " + numIslands);
            }
        }