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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       ListNode l1 = list1, l2 = list2;
       ArrayList<Integer> arr = new ArrayList<>();
       if(l1 == null) return l2;
       if(l2 == null) return l1;
        while(l1.next != null && l2.next != null){
            arr.add(l1.val);
            arr.add(l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1!=null){
            while(l1!=null){
                arr.add(l1.val);
                l1 = l1.next;
            }
        }
        if(l2!=null){
            while(l2!=null){
                arr.add(l2.val);
                l2 = l2.next;
            }
        }
        Collections.sort(arr);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        for(int i = 0; i < arr.size();i++){
            ListNode NewNode = new ListNode(arr.get(i));
            temp.next = NewNode;
            temp = temp.next;
        }
        
        return res.next;
    }
}