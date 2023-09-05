import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hash.contains(nums[i])) return true;
            hash.add(nums[i]);
        }
        return false;
    }

    public static boolean containsDuplicateSorted(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
