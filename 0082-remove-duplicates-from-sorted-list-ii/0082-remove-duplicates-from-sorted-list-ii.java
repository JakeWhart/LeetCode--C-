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
    public ListNode deleteDuplicates(ListNode head) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            hm.put(temp.val,hm.getOrDefault(temp.val,0)+1);
            temp = temp.next;
        }

        ListNode newhead = new ListNode(-1);
        ListNode dummy = newhead;

        temp = head;
        while(temp != null){
            if(hm.get(temp.val)== 1){
                dummy.next = new ListNode(temp.val);
                dummy = dummy.next;
            }
            temp = temp.next;
        }
        return newhead.next;

    
    }
}