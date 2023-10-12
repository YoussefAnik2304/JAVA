public class Main {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2]; // Create an array to store the result

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result; // Return the result array when a match is found
                }
            }
        }

        // If no solution is found, return null or handle it as needed
        return null;
    }
        public int[] twoSum2(int[] numbers, int target) {
            int p1,p2;
            p1=0;
            p2=numbers.length-1;

            while(p1<p2){
                int sum =numbers[p1]+numbers[p2];
                if(sum<target){
                    p1++;
                }else if(sum>target){
                    p2--;
                }else{
                    return new int[]{p1,p2};
                }
            }
            return new int []{p1,p2};
        }

    public static void main(String[] args) {
        Main main = new Main(); // Create an instance of the Main class
        int[] n = new int[8];
        for (int i = 0; i < 8; i++)
            n[i] = i + 5;

        int[] result = main.twoSum(n, 30); // Call the twoSum method on the instance
        int[] result2 = main.twoSum2(n, 30);
        if (result != null) {
            System.out.println("Indices of the two numbers: " + result[0] + ", " + result[1]);

        }else if(result2!=null){
            System.out.println("Indices of the two numbers2: " + result2[0] + ", " + result2[1]);
        } else {
            System.out.println("No solution found.");
        }
    }
}
