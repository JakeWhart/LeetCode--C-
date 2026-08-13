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
    public ListNode oddEvenList(ListNode head) {
        int idx = 1;
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode o = odd, e = even;
        ListNode temp = head;
        while(temp!=null){
            if(idx%2 != 0){
                o.next = temp;
                o = o.next;
            }
            else{
                e.next = temp;
                e = e.next;
            }
            temp = temp.next;
            idx++;
        }
        e.next = null;
        o.next = even.next;
        head = odd.next;
        return head;
    }
}