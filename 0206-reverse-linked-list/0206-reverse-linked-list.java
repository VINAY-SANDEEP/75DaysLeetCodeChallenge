/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp!=null){
            stack.push(temp.val);
            temp =temp.next;
        }
        ListNode rajasri = head;
        while(rajasri!=null){
            rajasri.val = stack.pop();
            rajasri=rajasri.next;
        }
      return head;
    }
}