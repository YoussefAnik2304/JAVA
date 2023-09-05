public class Main {
    public static void main(String[] args) {
        int[] test = {1, 2, 5, 2, 1};

        if (Solution.containsDuplicateHashSet(test)) {
            System.out.println("Contains duplicates using HashSet");
        } else {
            System.out.println("No duplicates using HashSet");
        }

        if (Solution.containsDuplicateSorted(test)) {
            System.out.println("Contains duplicates after sorting");
            System.out.println(Solution.containsDuplicateHashSet(test));
        } else {
            System.out.println("No duplicates after sorting");
        }
    }
}
