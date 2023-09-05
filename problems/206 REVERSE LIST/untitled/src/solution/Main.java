package solution;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create a test linked list
        Solution.ListNode head = solution.new ListNode(1);
        head.next = solution.new ListNode(2);
        head.next.next = solution.new ListNode(3);
        head.next.next.next = solution.new ListNode(4);
        head.next.next.next.next = solution.new ListNode(5);

        // Reverse the linked list
        Solution.ListNode reversed = solution.reverseList(head);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
        // Print the reversed linked list
        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }

    }
}
