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
    public ListNode partition(ListNode head, int x) {
       ListNode temp = head;
       ListNode great = new ListNode(0);
       ListNode less = new ListNode(0);
       ListNode tl = less, tg = great;
       while(temp!=null){
        if(temp.val < x){
            tl.next = temp;
            tl = tl.next;
        }
        else{
            tg.next = temp;
            tg = tg.next;
        }
        temp = temp.next;
       }
       tg.next = null;
    tl.next = great.next;
    head = less.next;
    return head;
    }
}