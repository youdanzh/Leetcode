class Solution {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ListNode p = head;
        while(p!=null){
            map.put(p.val,map.getOrDefault(p.val,0)+1);
            p = p.next;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        p = dummy;
        while(p!=null){
            ListNode q = p.next;
            while(q!=null&&map.get(q.val)>1) q = q.next;
            p.next = q;
            p =p.next;
        }
        return dummy.next;
    }
}
