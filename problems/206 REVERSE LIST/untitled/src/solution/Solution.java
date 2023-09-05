package solution;

public class Solution {
    public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        ListNode a = null;
        ListNode p= head;
        while(p!=null){
            ListNode tmp=new ListNode(p.val);
            tmp.next=a;
            a=tmp;
            p=p.next;
        }
        return a ;
    }
}
